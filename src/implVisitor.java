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
	 * Visit a parse tree produced by {@link implParser#skippable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkippable(implParser.SkippableContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(implParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(implParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(implParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(implParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(implParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(implParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#stmn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmn(implParser.StmnContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(implParser.ExpContext ctx);
}