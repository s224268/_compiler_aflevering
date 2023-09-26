// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAdd(implParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAdd(implParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMult(implParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMult(implParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVar(implParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVar(implParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConst(implParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConst(implParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParen(implParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParen(implParser.ParenContext ctx);
}