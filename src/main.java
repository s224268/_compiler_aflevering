import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

	// Build the Abstract Syntax Tree (AST)
	//ASTMaker astmaker = new ASTMaker();
	//Program p=(Program)astmaker.visit(parseTree);

	// For evaluation, create an empty environment and run eval:
	//Environment env=new Environment();
	//p.eval(env);
    }
}

/* Visitor that turns the ANTLR parse tree into more friendly abstract
 * syntax tree (AST). The return type <T> is AST, see AST.java
 */
/*
class ASTMaker extends AbstractParseTreeVisitor<AST>
               implements implVisitor<AST> {
    public AST visitStart(implParser.StartContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (implParser.StmtContext s : ctx.p )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitSingle(implParser.SingleContext ctx)
    {
	return visit(ctx.s);
    };
    public AST visitBlock(implParser.BlockContext ctx){
	List<Program> ps = new ArrayList<Program>();
	for (implParser.StmtContext s : ctx.p )
	    ps.add((Program) visit(s));
	return new Sequence(ps);
    };
    public AST visitAssign(implParser.AssignContext ctx){
	return new Assignment(ctx.x.getText(),(Exp) visit(ctx.e));
    };
    public AST visitWhile(implParser.WhileContext ctx){
	return new While((Condition) visit(ctx.c), (Program) visit(ctx.p));
    };
    public AST visitOutput(implParser.OutputContext ctx){
	return new Output((Exp) visit(ctx.e));
	
    };
    public AST visitIf(implParser.IfContext ctx){
	return new If((Condition) visit(ctx.c),
		      (Program) visit(ctx.p1),
		      (Program) visit(ctx.p2));
    };
    public AST visitGreater(implParser.GreaterContext ctx){
	return new Greater((Exp) visit(ctx.e1), (Exp) visit(ctx.e2)); 
    };
    public AST visitEqual(implParser.EqualContext ctx){
	System.err.println("visitEqual: Implement me!");
	System.exit(-1);
	return null;
    };
    public AST visitUnequal(implParser.UnequalContext ctx){
	System.err.println("visitUnequal: Implement me!");
	System.exit(-1);
	return null;
    };
    public AST visitAdd(implParser.AddContext ctx){
	if (ctx.op.getText().equals("+"))
	    return new Addition((Exp) visit(ctx.e1),
				(Exp) visit(ctx.e2));
	else return new Subtraction((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitMult(implParser.MultContext ctx){
	if (ctx.op.getText().equals("*"))
	    return new Multiplication((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
	else return new Division((Exp) visit(ctx.e1), (Exp) visit(ctx.e2));
    };
    public AST visitVar(implParser.VarContext ctx){
	return new Variable(ctx.x.getText());
    };
    public AST visitConst(implParser.ConstContext ctx){
	return new Constant(Integer.valueOf(ctx.i.getText()));
    };
    public AST visitParen(implParser.ParenContext ctx){
	return visit(ctx.e);
    };
}



 */