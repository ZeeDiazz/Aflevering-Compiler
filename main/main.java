import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        // we expect exactly one argument: the name of the input file
        if (args.length != 1) {
            System.err.println("\n");
            System.err.println("Impl Interpreter\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename = args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        HDL0Lexer lex = new HDL0Lexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        HDL0Parser parser = new HDL0Parser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Build the Abstract Syntax Tree (AST)
        prettyprint astmaker = new prettyprint();
        String s = astmaker.visit(parseTree);
        //ASTMaker astmaker = new ASTMaker();
        //Program p=(Program)astmaker.visit(parseTree);

        //Environment env=new Environment();
        //p.typecheck(env);
        //env=new Environment();
    }
}

/* Visitor that turns the ANTLR parse tree into more friendly abstract
 */

class prettyprint extends AbstractParseTreeVisitor<String> implements HDL0Visitor<String> {
    @Override
    public String visitBegin(HDL0Parser.BeginContext ctx) {
        System.out.println("<!DOCTYPE html>");

        System.out.println("<html><head><title> " + ctx.hardware().stop.getText() + "</title");

        System.out.println("<scriptsrc=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>" +
                "<scripttype=\"text/javascript\"id=\"MathJax-script\"" +
                "asyncsrc=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">" +
                "</script></head><body>");
        return visitChildren(ctx);
    }

    @Override
    public String visitHardwareProg(HDL0Parser.HardwareProgContext ctx) {
        System.out.println("<h1>" + ctx.CIRCUITNAME().getText() + "</h1>");
        return visitChildren(ctx);
    }

    @Override
    public String visitIns(HDL0Parser.InsContext ctx) {
        String test = ctx.start.getText();

        if (test.contains(".")) {
            test = ctx.start.getText().replace(".", "");
        }

        System.out.println("<h2>" + test + "</h2>");

        System.out.println(ctx.ins.getText());
        return visitChildren(ctx);
    }

    @Override
    public String visitOuts(HDL0Parser.OutsContext ctx) {
        String test = ctx.start.getText();

        if (test.contains(".")) {
            test = ctx.start.getText().replace(".", "");
        }

        System.out.println("<h2>" + test + "</h2>");

        System.out.println(ctx.outs.getText());
        return visitChildren(ctx);
    }

    @Override
    public String visitLats(HDL0Parser.LatsContext ctx) {
        String test = ctx.start.getText();

        if (test.contains(".")) {
            test = ctx.start.getText().replace(".", "");
        }

        System.out.println("<h2>" + test + "</h2>");

        System.out.println(ctx.getStop().getText());

        return visitChildren(ctx);
    }

    @Override
    public String visitUdt(HDL0Parser.UdtContext ctx) {
        return null;
    }

    @Override
    public String visitSimp(HDL0Parser.SimpContext ctx) {
        return null;
    }

    @Override
    public String visitLat(HDL0Parser.LatContext ctx) {
        return null;
    }

    @Override
    public String visitAsstmt(HDL0Parser.AsstmtContext ctx) {
        return null;
    }

    @Override
    public String visitSstmt(HDL0Parser.SstmtContext ctx) {
        return null;
    }

    @Override
    public String visitCondition(HDL0Parser.ConditionContext ctx) {
        return null;
    }

    @Override
    public String visitVar(HDL0Parser.VarContext ctx) {
        return null;
    }

    @Override
    public String visitOG(HDL0Parser.OGContext ctx) {
        return null;
    }

    @Override
    public String visitNegate(HDL0Parser.NegateContext ctx) {
        return null;
    }

    @Override
    public String visitEller(HDL0Parser.EllerContext ctx) {
        return null;
    }
    /*public AST visitStart(mainParser.StartContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (mainParser.StmtContext s : ctx.p )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitSingle(mainParser.SingleContext ctx)
    {
	return visit(ctx.s);
    };
    public AST visitBlock(mainParser.BlockContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (mainParser.StmtContext s : ctx.p )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitAssign(mainParser.AssignContext ctx){
	return new Assignment(ctx.x.getText(),(Exp) visit(ctx.e));
    };
    public AST visitWhile(mainParser.WhileContext ctx){
	return new While((Condition) visit(ctx.c), (Program) visit(ctx.p));
    };
    public AST visitOutput(mainParser.OutputContext ctx){
	return new Output((Exp) visit(ctx.e));
	
    };
    public AST visitIf(mainParser.IfContext ctx){
	return new If((Condition) visit(ctx.c),
		      (Program) visit(ctx.p1),
		      (Program) visit(ctx.p2));
    };
    public AST visitGreater(mainParser.GreaterContext ctx){
	return new Greater((Exp) visit(ctx.e1), (Exp) visit(ctx.e2)); 
    };
    public AST visitEqual(mainParser.EqualContext ctx){
	return new Equal((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitUnequal(mainParser.UnequalContext ctx){
	System.err.println("visitUnequal: Implement me!");
	System.exit(-1);
	return null;
    };
    public AST visitAdd(mainParser.AddContext ctx){
	if (ctx.op.getText().equals("+"))
	    return new Addition((Exp) visit(ctx.e1),
				(Exp) visit(ctx.e2));
	else return new Subtraction((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitMult(mainParser.MultContext ctx){
	if (ctx.op.getText().equals("*"))
	    return new Multiplication((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
	else return new Division((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitVar(mainParser.VarContext ctx){


	return new Variable(ctx.x.getText());
    };
    public AST visitConst(mainParser.ConstContext ctx){
	return new Constant(Integer.valueOf(ctx.i.getText()));
    };
    public AST visitParen(mainParser.ParenContext ctx){
	return visit(ctx.e);
    };
    public AST visitString(mainParser.StringContext ctx){
	String s=ctx.f.getText();
	return new ConstString(s.substring(1,s.length()-1));
    }*/
}

