import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.util.Arrays;

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
        System.out.println(s);
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
        String html = ("<!DOCTYPE html>\n");

        html += ("<html><head><title> " + ctx.h.stop.getText() + "</title\n");

        html += ("<scriptsrc=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>" +
                "<scripttype=\"text/javascript\"id=\"MathJax-script\"" +
                "asyncsrc=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">" +
                "</script></head><body>\n");

        String h = visit(ctx.h);
        String i = visit(ctx.i);
        String o = visit(ctx.o);
        String l = visit(ctx.l);
        String u = visit(ctx.u);
        String s = visit(ctx.s);


        return html + "\n" + h + "\n" + i + "\n" + o + "\n" + l + "\n" + u + "\n" + s + "\n" + "\n</body></html>";
    }

    @Override
    public String visitHardwareProg(HDL0Parser.HardwareProgContext ctx) {
        return "<h1> " + ctx.CIRCUITNAME().getText() + " </h1>\n";
    }

    @Override
    public String visitIns(HDL0Parser.InsContext ctx) {
        String ins = "<h2> Input </h2>\n";
        ins += ctx.ins.getText();
        return ins + "\n";
    }

    @Override
    public String visitOuts(HDL0Parser.OutsContext ctx) {
        String outs = "<h2> Output </h2>\n";
        outs += ctx.outs.getText();
        return outs + "\n";
    }

    @Override
    public String visitLats(HDL0Parser.LatsContext ctx) {
        String lats = "<h2> Latches </h2>\n";
        lats += ctx.latch(0).getText();

        if(lats.contains("->")){
            lats = lats.replace(" -> ","&rarr;");
        }
        return lats + "<br>" + "\n";
    }

    @Override
    public String visitUdt(HDL0Parser.UdtContext ctx) {
        String udt = "<h2> Updates </h2>\n";
        String begin = visitChildren(ctx);
        String beginFirst = "";

        if(begin.contains("=")){
            begin = begin.replace("=","");
            beginFirst = begin.substring(0,10);
            begin = begin.substring(11);
        }

        return udt + beginFirst + "&larr;"  + begin + "<br>" + "\n";
    }

    @Override
    public String visitSimp(HDL0Parser.SimpContext ctx) {
        String udt = "<h2> Simulation inputs </h2>\n";
        return udt + visitChildren(ctx) + ")";
    }

    @Override
    public String visitLat(HDL0Parser.LatContext ctx) {
        String lat1 = ctx.lat1.getText();
        String lat2 = ctx.lat2.getText();
        return lat1 + "&rarr;" + lat2;
    }

    @Override
    public String visitAsstmt(HDL0Parser.AsstmtContext ctx) {
        String var = ctx.var.getText();
        String exp = visit(ctx.expression());
        return var + " = " + exp;

    }

    @Override
    public String visitSstmt(HDL0Parser.SstmtContext ctx) {
        String html = "<b>";
        String start = ctx.var.getText();
        String number = ctx.BINARY().getText();
        html += start + "</b>: "+ number+"<br>";

        return html;
    }

    @Override
    public String visitCondition(HDL0Parser.ConditionContext ctx) {
        String e = visit(ctx.e);
        return "\\(" + e + "\\)";
    }

    @Override
    public String visitVar(HDL0Parser.VarContext ctx) {
        String signalName = ctx.var.getText();
        // Translate the signal name to LaTeX format
        String latexSignalName = signalName;
        if(signalName.contains(" ")) {
            latexSignalName = "\\mathrm{" + signalName + "}";
        }
        return latexSignalName;
    }

    @Override
    public String visitOG(HDL0Parser.OGContext ctx) {
        String e1 = visit(ctx.e1);
        String e2 = visit(ctx.e2);

        return "(" + e1 + " \\wedge " + e2 + ")";
    }

    @Override
    public String visitNegate(HDL0Parser.NegateContext ctx) {
        String e = visit(ctx.e);
        return "(\\neg(" + e + ")";
    }

    @Override
    public String visitEller(HDL0Parser.EllerContext ctx) {
        String e1 = visit(ctx.e1);
        String e2 = visit(ctx.e2);
        return "(" + e1 + " \\vee " + e2 + ")";
    }
}

