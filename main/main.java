import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
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

        try {
            FileWriter file = new FileWriter("index.html");

            BufferedWriter outputfile = new BufferedWriter(file);

            outputfile.write(s);

            outputfile.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }

    }
}

/* Visitor that turns the ANTLR parse tree into more friendly abstract
 */

class prettyprint extends AbstractParseTreeVisitor<String> implements HDL0Visitor<String> {
    @Override
    public String visitBegin(HDL0Parser.BeginContext ctx) {
        String html = ("<!DOCTYPE html>\n");

        html += ("<html><head><title> " + ctx.hardware().stop.getText() + " </title>\n");

        html += ("<scriptsrc=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>" +
                "<scripttype=\"text/javascript\"id=\"MathJax-script\"" +
                "asyncsrc=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">" +
                "</script></head><body>\n");

        String h = visit(ctx.hardware());
        String i = visit(ctx.input());
        String o = visit(ctx.output());
        String l = visit(ctx.latches());
        String u = visit(ctx.update());
        String s = visit(ctx.simulate());


        return html + "\n" + h + "\n" + i + "\n" + o + "\n" + l + "\n" + u + "\n" + s + "\n" + "\n</body></html>";
    }

    @Override
    public String visitHardwareProg(HDL0Parser.HardwareProgContext ctx) {
        return "<h1> " + ctx.CIRCUITNAME().getText() + " </h1>\n";
    }

    @Override
    public String visitIns(HDL0Parser.InsContext ctx) {
        StringBuilder ins = new StringBuilder("<h2> Input </h2>\n");
        for (var i: ctx.ID()) {
            ins.append(i.getText()).append(" ");
        }
        return ins + "\n";
    }

    @Override
    public String visitOuts(HDL0Parser.OutsContext ctx) {
        StringBuilder outs = new StringBuilder("<h2> Output </h2>\n");
        for (var i: ctx.ID()) {
            outs.append(i.getText());
            outs.append(" ");
        }

        return outs + "\n";
    }

    @Override
    public String visitLats(HDL0Parser.LatsContext ctx) {
        StringBuilder lats = new StringBuilder("<h2> Latches </h2>\n");
        String latch;
        for (HDL0Parser.LatchContext latchContext: ctx.latch()){
            latch = visit(latchContext);
            if(latch.contains("->")){
                latch = latch.replace(" -> ","&rarr;");
            }
            lats.append(latch).append("\n");
        }

        return lats + "\n";
    }

    @Override
    public String visitUdt(HDL0Parser.UdtContext ctx) {
        StringBuilder udt = new StringBuilder("<h2> Updates </h2>\n");
        for (HDL0Parser.Assignment_stmtContext assignmentStmt : ctx.assignment_stmt()) {
            String assignment = visit(assignmentStmt);
            udt.append(assignment).append("<br>\n");
        }
        return udt.toString();
    }

    @Override
    public String visitSimp(HDL0Parser.SimpContext ctx) {
        String udt = "<h2> Simulation inputs </h2>\n";
        return udt + visitChildren(ctx);
    }

    @Override
    public String visitLat(HDL0Parser.LatContext ctx) {
        String lat1 = ctx.lat1.getText();
        String lat2 = ctx.lat2.getText();
        return lat1 + "&rarr;" + lat2;
    }

    @Override
    public String visitAsstmt(HDL0Parser.AsstmtContext ctx) {
        String var = ctx.asig.getText();
        String exp = visit(ctx.expression());

        if (exp.contains("\\neg(")) {
            return var + "&larr;" + exp + ")";
        } else {
            return var + "&rarr;" + exp;
        }
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

