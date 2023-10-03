// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ccParser}.
 */
public interface ccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ccParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ccParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#skippable}.
	 * @param ctx the parse tree
	 */
	void enterSkippable(ccParser.SkippableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#skippable}.
	 * @param ctx the parse tree
	 */
	void exitSkippable(ccParser.SkippableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ccParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ccParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(ccParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(ccParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(ccParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(ccParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(ccParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(ccParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(ccParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(ccParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(ccParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(ccParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(ccParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(ccParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#stmn}.
	 * @param ctx the parse tree
	 */
	void enterStmn(ccParser.StmnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#stmn}.
	 * @param ctx the parse tree
	 */
	void exitStmn(ccParser.StmnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(ccParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ccParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(ccParser.ExpContext ctx);
}