// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(implParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(implParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(implParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(implParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(implParser.ParenContext ctx);
}