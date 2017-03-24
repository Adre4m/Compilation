// Generated from /home/etud/o2132140/Documents/Compilation/TD2/langage/src/Langage.g4 by ANTLR 4.6

//package org.meri.antlr_step_by_step.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangageParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(LangageParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(LangageParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(LangageParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(LangageParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(LangageParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LangageParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LangageParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar(LangageParser.CharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(LangageParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(LangageParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(LangageParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(LangageParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LangageParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LangageParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockCondition}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockCondition(LangageParser.BlockConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(LangageParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectExpr}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectExpr(LangageParser.AffectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectBool}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectBool(LangageParser.AffectBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrementVar(LangageParser.DecrementVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementVar(LangageParser.IncrementVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#elseCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseCond(LangageParser.ElseCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(LangageParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(LangageParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(LangageParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#lang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang(LangageParser.LangContext ctx);
	/**
	 * Visit a parse tree produced by {@link LangageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangageParser.ProgContext ctx);
}