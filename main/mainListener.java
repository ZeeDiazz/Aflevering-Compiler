// Generated from main.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mainParser}.
 */
public interface mainListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Begin}
	 * labeled alternative in {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void enterBegin(mainParser.BeginContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Begin}
	 * labeled alternative in {@link mainParser#start}.
	 * @param ctx the parse tree
	 */
	void exitBegin(mainParser.BeginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HardwareProg}
	 * labeled alternative in {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardwareProg(mainParser.HardwareProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HardwareProg}
	 * labeled alternative in {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardwareProg(mainParser.HardwareProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ins}
	 * labeled alternative in {@link mainParser#input}.
	 * @param ctx the parse tree
	 */
	void enterIns(mainParser.InsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ins}
	 * labeled alternative in {@link mainParser#input}.
	 * @param ctx the parse tree
	 */
	void exitIns(mainParser.InsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Outs}
	 * labeled alternative in {@link mainParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOuts(mainParser.OutsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Outs}
	 * labeled alternative in {@link mainParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOuts(mainParser.OutsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lats}
	 * labeled alternative in {@link mainParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLats(mainParser.LatsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lats}
	 * labeled alternative in {@link mainParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLats(mainParser.LatsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Udt}
	 * labeled alternative in {@link mainParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUdt(mainParser.UdtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Udt}
	 * labeled alternative in {@link mainParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUdt(mainParser.UdtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simp}
	 * labeled alternative in {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimp(mainParser.SimpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simp}
	 * labeled alternative in {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimp(mainParser.SimpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lat}
	 * labeled alternative in {@link mainParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLat(mainParser.LatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lat}
	 * labeled alternative in {@link mainParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLat(mainParser.LatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Asstmt}
	 * labeled alternative in {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsstmt(mainParser.AsstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Asstmt}
	 * labeled alternative in {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsstmt(mainParser.AsstmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sstmt}
	 * labeled alternative in {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSstmt(mainParser.SstmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sstmt}
	 * labeled alternative in {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSstmt(mainParser.SstmtContext ctx);
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