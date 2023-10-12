// Generated from main.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mainParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mainParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(mainParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(mainParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(mainParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(mainParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(mainParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(mainParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(mainParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(mainParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(mainParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(mainParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(mainParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(mainParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(mainParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(mainParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(mainParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(mainParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimulate_stmt(mainParser.Simulate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimulate_stmt(mainParser.Simulate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition(mainParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition(mainParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(mainParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(mainParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OG}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOG(mainParser.OGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OG}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOG(mainParser.OGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegate(mainParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegate(mainParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eller}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEller(mainParser.EllerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eller}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEller(mainParser.EllerContext ctx);
}