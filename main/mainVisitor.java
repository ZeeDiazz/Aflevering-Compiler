// Generated from main.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mainParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mainVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Begin}
	 * labeled alternative in {@link mainParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(mainParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HardwareProg}
	 * labeled alternative in {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardwareProg(mainParser.HardwareProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ins}
	 * labeled alternative in {@link mainParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIns(mainParser.InsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Outs}
	 * labeled alternative in {@link mainParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuts(mainParser.OutsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lats}
	 * labeled alternative in {@link mainParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLats(mainParser.LatsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Udt}
	 * labeled alternative in {@link mainParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt(mainParser.UdtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simp}
	 * labeled alternative in {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimp(mainParser.SimpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lat}
	 * labeled alternative in {@link mainParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLat(mainParser.LatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asstmt}
	 * labeled alternative in {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsstmt(mainParser.AsstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sstmt}
	 * labeled alternative in {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSstmt(mainParser.SstmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(mainParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(mainParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OG}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOG(mainParser.OGContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negate}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(mainParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eller}
	 * labeled alternative in {@link mainParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEller(mainParser.EllerContext ctx);
}