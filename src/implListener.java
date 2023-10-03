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
	 * Enter a parse tree produced by {@link implParser#skippable}.
	 * @param ctx the parse tree
	 */
	void enterSkippable(implParser.SkippableContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#skippable}.
	 * @param ctx the parse tree
	 */
	void exitSkippable(implParser.SkippableContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(implParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(implParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(implParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(implParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(implParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(implParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(implParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(implParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(implParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(implParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(implParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(implParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(implParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(implParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#stmn}.
	 * @param ctx the parse tree
	 */
	void enterStmn(implParser.StmnContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#stmn}.
	 * @param ctx the parse tree
	 */
	void exitStmn(implParser.StmnContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(implParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(implParser.ExpContext ctx);
}