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
	 * Visit a parse tree produced by {@link mainParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mainParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(mainParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(mainParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(mainParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(mainParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(mainParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(mainParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#latch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(mainParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(mainParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link mainParser#simulate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate_stmt(mainParser.Simulate_stmtContext ctx);
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