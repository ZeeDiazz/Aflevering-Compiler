import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

enum Type{
    INTTYPE, STRINGTYPE
}

public abstract class AST{
    public static void error(String msg){
	System.err.println(msg);
	System.exit(-1);
    }
};

abstract class Program extends AST{
    abstract public void eval(Environment env);
    abstract public void typecheck(Environment env);
}

class Sequence extends Program{
    List<Program> ps;
    Sequence(List<Program> ps){this.ps=ps;}
    public void eval(Environment env){
	for(Program p : ps) p.eval(env);
    };
    public void typecheck(Environment env){
	for(Program p : ps) p.typecheck(env);
    }
}

class Assignment extends Program{
    String varname;
    Exp e;
    Assignment(String varname, Exp e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
	Value v=e.eval(env);
	env.setVariable(varname,v);
    };
    public void typecheck(Environment env){
	Type t=e.typecheck(env);
	if (env.existVariable(varname)){
	    if(env.getVariable(varname).getType()!=t)
		error("Writing into variable of different type.");
	}
	else{
	    if (t==Type.INTTYPE)
		env.setVariable(varname,new Constant(0));
	    else
		env.setVariable(varname,new ConstString(""));
	}
    }
}

class While extends Program{
    Condition c;
    Program p;
    While(Condition c, Program p){this.c=c; this.p=p;}
    public void eval(Environment env){
	while(c.eval(env)) p.eval(env);
    }
    public void typecheck(Environment env){
	c.typecheck(env);
	p.typecheck(env);
    }
}

class If extends Program{
    Condition c;
    Program p1,p2;
    If(Condition c, Program p1, Program p2){
	this.c=c; this.p1=p1; this.p2=p2;
    }
    public void eval(Environment env){
	if(c.eval(env)) p1.eval(env); else p2.eval(env);
    }    
    public void typecheck(Environment env){
	c.typecheck(env);
	p1.typecheck(env);
	p2.typecheck(env);
    }
}

class Output extends Program{
    Exp e;
    Output(Exp e){ this.e=e;}
    public void eval(Environment env){
	System.out.println(e.eval(env).toString());
    }
    public void typecheck(Environment env){
	e.typecheck(env);
    }
}

abstract class Condition extends AST{
    abstract public Boolean eval(Environment env);
    abstract public void typecheck(Environment env);
};

class Greater extends Condition{
    Exp e1,e2;
    Greater(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	if (v1.getType()==Type.STRINGTYPE || v2.getType()==Type.STRINGTYPE)
	    error("Greater between Strings not defined.");
	return v1.toInt()>v2.toInt();
    }
    public void typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	    error("Greater between Strings not defined."); 	
    }
}

class Equal extends Condition{
    Exp e1,e2;
    Equal(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	Type t1 = v1.getType();
	Type t2 = v2.getType();

	if (t1==Type.STRINGTYPE && t2==Type.STRINGTYPE)
	    return v1.toString().equals(v2.toString());
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	    error("Comparison between values of different types");
	return v1.toInt()==v2.toInt();
    }   
    public void typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1!=t2)
	    error("Comparison between values of different types");
    }
}

abstract class Exp extends AST{
    abstract public Value eval(Environment env);
    abstract public Type typecheck(Environment env);
}

class Addition extends Exp{
    Exp e1, e2;
    Addition(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}    
    public Value eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	if (v1.getType()==Type.STRINGTYPE || v2.getType()==Type.STRINGTYPE)
	    return new ConstString(v1.toString()+v2.toString());
	return new Constant(v1.toInt()+v2.toInt()); 
    };
    public Type typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	    return Type.STRINGTYPE;
	return Type.INTTYPE; 
    }
}


class Subtraction extends Exp{
    Exp e1, e2;
    Subtraction(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}    
    public Value eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	//if (v1.getType()==Type.STRINGTYPE || v2.getType()==Type.STRINGTYPE)
	//    error("Subtraction of Strings not defined.");
	return new Constant(v1.toInt()-v2.toInt()); 
    };
    public Type typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	     error("Subtraction of Strings not defined.");
	return Type.INTTYPE; 
    }
}
class Multiplication extends Exp{
    Exp e1, e2;
    Multiplication(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	if (v1.getType()==Type.STRINGTYPE || v2.getType()==Type.STRINGTYPE)
	    error("Multiplication of Strings not defined.");
	return new Constant(v1.toInt()*v2.toInt()); 
    };
 public Type typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	     error("Multiplication of Strings not defined.");
	return Type.INTTYPE; 
    }}
class Division extends Exp{
    Exp e1, e2;
    Division(Exp e1, Exp e2){this.e1=e1; this.e2=e2;}
    public Value eval(Environment env){
	Value v1=e1.eval(env);
	Value v2=e2.eval(env);
	if (v1.getType()==Type.STRINGTYPE || v2.getType()==Type.STRINGTYPE)
	    error("Division of Strings not defined.");
	return new Constant(v1.toInt()/v2.toInt()); 
    };
public Type typecheck(Environment env){
	Type t1=e1.typecheck(env);
	Type t2=e2.typecheck(env);
	if (t1==Type.STRINGTYPE || t2==Type.STRINGTYPE)
	     error("Division of Strings not defined.");
	return Type.INTTYPE; 
    }
}

class Variable extends Exp{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public Value eval(Environment env){
	return env.getVariable(varname);
    };
    public Type typecheck(Environment env){
	return env.getVariable(varname).getType();
    }
};

abstract class Value extends Exp{
    abstract public Type getType();
    abstract public Integer toInt();
    // abstract public String toString();
}

class Constant extends Value{
    public Integer i;
    Constant(Integer i){ this.i=i;}
    public Value eval(Environment env){
	return this;
    };
    public Type getType(){
	return Type.INTTYPE;
    };
    public Integer toInt(){
	return i;
    };
    public String toString(){
	return ""+i;
    }
    public Type typecheck(Environment env){ return getType();}
};


class ConstString extends Value{
    public String s;
    ConstString(String s){this.s=s;}
    public ConstString eval(Environment env){
	return this;
    };
    public Type getType(){
	return Type.STRINGTYPE;
    };
    public Integer toInt(){
	error("String cannot be converted to int.");
	return null;
    };
    public String toString(){ return s; }
    public Type typecheck(Environment env){ return getType();}
}

