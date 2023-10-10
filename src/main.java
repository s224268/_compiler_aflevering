import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();
	Interpreter interpreter = new Interpreter();
	String result = interpreter.visit(parseTree);
	toFile(result);
	System.out.println(result);

	// Build the Abstract Syntax Tree (AST)
	//ASTMaker astmaker = new ASTMaker();
	//Program p=(Program)astmaker.visit(parseTree);

	// For evaluation, create an empty environment and run eval:
	//Environment env=new Environment();
	//p.eval(env);
    }

	public static void toFile(String data) {
		String filename = "output.html";

		try (FileWriter fw = new FileWriter(filename);
			 BufferedWriter bw = new BufferedWriter(fw)) {

			bw.write(data);
			System.out.println("Data written to file successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


class Interpreter extends AbstractParseTreeVisitor<String> implements implVisitor<String>{

	public String visitStart(implParser.StartContext ctx){
		return ("<!DOCTYPE html>\n" + visit(ctx.p) + "</html>\n");
	}
	/**
	 * Visit a parse tree produced by {@link implParser#skippable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */

	/**
	 * Visit a parse tree produced by {@link implParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitProg(implParser.ProgContext ctx){
		return ("<html><head><title> " + ctx.ident.getText() + " </title>\n" +
				"<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n" +
				"<script type=\"text/javascript\" id=\"MathJax-script\"\n" +
				"async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n" +
				"</script></head><body>\n <h1>"+ ctx.ident.getText() + "</h1>\n" + visit(ctx.next) + "</body>");
	}
	/**
	 * Visit a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	public String visitInputs(implParser.InputsContext ctx){
		return ("<h2> Inputs </h2>\nReset\n" + ctx.ident.getText() + "\n\n" + visit(ctx.next));
	}

	public String visitOutputs(implParser.OutputsContext ctx){
		StringBuilder output = new StringBuilder("<h2> Outputs </h2>\n");
		int childCount = ctx.getChildCount();

		for (int i = 1; i < childCount - 1; i++) {
			ParseTree child = ctx.getChild(i);
			output.append(child.getText()).append("\n");
		}

		// If you still want to visit children (though you've already looped through them above)
		output.append(visitChildren(ctx));

		return output.toString();
	}


	public String visitLatches(implParser.LatchesContext ctx){

		StringBuilder output = new StringBuilder("<h2> Latches </h2>\n");
		int childCount = ctx.getChildCount();

		for (int i = 1; i < childCount - 1; i++) {
			ParseTree child = ctx.getChild(i);
			output.append(child.getText()).append("<br>\n");
		}

		// If you still want to visit children (though you've already looped through them above)
		String update = visit(ctx.next);
		return (output.toString().replaceAll("->","&rarr;") + update);

	}

	public String visitLatch(implParser.LatchContext ctx){
		return "";
	}

	public String visitUpdate(implParser.UpdateContext ctx){
		StringBuilder output = new StringBuilder("<h2> Update </h2>\n");
		int childCount = ctx.getChildCount();
		for (int i = 1; i < childCount - 1; i++) {
			output.append(visit(ctx.getChild(i))).append("\n\n");
		}
		return output.append(visit(ctx.next)).toString();
	}


	public String visitIdent(implParser.IdentContext ctx){
		return ("\\mathrm{" + ctx.i.getText() + "}");
	}


	public String visitSimulate(implParser.SimulateContext ctx){
		StringBuilder output = new StringBuilder("<h2> Simulation inputs </h2>\n\n");
		output.append("<b>" + ctx.i.getText() + "</b>: " + ctx.b.getText());
		return output.toString();
	}


	public String visitStmn(implParser.StmnContext ctx){
		return (("\\(\\mathrm{" + ctx.i.getText() + "}") + "&larr;" + visit(ctx.e) + "\\)" + "<br>");
	}

	public String visitExp(implParser.ExpContext ctx){
		return visit(ctx);
	}
	//abstract and does not override abstract method visitAnd(AndContext

	public String visitOr(implParser.OrContext ctx){
		//System.out.println(ctx.e1 + ctx.e2);
		return ("(" + visit(ctx.e1) + "\\vee" + visit(ctx.e2) + ")") ;
	}


	public String visitAnd(implParser.AndContext ctx){
		//System.out.println(ctx.e1 + ctx.e2);
		return ("(" + visit(ctx.e1) + "\\wedge" + visit(ctx.e2) + ")");
	}
	public String visitParen(implParser.ParenContext ctx){
		//System.out.println(ctx.e1 + ctx.e2);
		return "(" + visit(ctx.e) + ")";
	}

	public String visitNot(implParser.NotContext ctx){
		//System.out.println(ctx.e1 + ctx.e2);
		return ("\\neg(" + visit(ctx.e) + ")");
	}

}