// Generated from C:/Users/willi/Documents/Papier Master 1/Semestre 2/Compilation/Projet Compilation/gitProject/src\Langage.g4 by ANTLR 4.6

//package org.meri.antlr_step_by_step.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangageParser}.
 */
public interface LangageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangageParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(LangageParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(LangageParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#types}.
	 * @param ctx the parse tree
	 */
	void enterTypes(LangageParser.TypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#types}.
	 * @param ctx the parse tree
	 */
	void exitTypes(LangageParser.TypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#tableau}.
	 * @param ctx the parse tree
	 */
	void enterTableau(LangageParser.TableauContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#tableau}.
	 * @param ctx the parse tree
	 */
	void exitTableau(LangageParser.TableauContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#tab}.
	 * @param ctx the parse tree
	 */
	void enterTab(LangageParser.TabContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#tab}.
	 * @param ctx the parse tree
	 */
	void exitTab(LangageParser.TabContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(LangageParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(LangageParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(LangageParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(LangageParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(LangageParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(LangageParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterChar(LangageParser.CharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code char}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitChar(LangageParser.CharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LangageParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LangageParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperation(LangageParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code operation}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperation(LangageParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LangageParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LangageParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterNot(LangageParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitNot(LangageParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterCompare(LangageParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitCompare(LangageParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(LangageParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(LangageParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterOr(LangageParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitOr(LangageParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LangageParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LangageParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockCondition}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void enterBlockCondition(LangageParser.BlockConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockCondition}
	 * labeled alternative in {@link LangageParser#bexp}.
	 * @param ctx the parse tree
	 */
	void exitBlockCondition(LangageParser.BlockConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSkip(LangageParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skip}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSkip(LangageParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectExpr}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterAffectExpr(LangageParser.AffectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectExpr}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitAffectExpr(LangageParser.AffectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterDecrementVar(LangageParser.DecrementVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitDecrementVar(LangageParser.DecrementVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIncrementVar(LangageParser.IncrementVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementVar}
	 * labeled alternative in {@link LangageParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIncrementVar(LangageParser.IncrementVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void enterElseCond(LangageParser.ElseCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#elseCond}.
	 * @param ctx the parse tree
	 */
	void exitElseCond(LangageParser.ElseCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(LangageParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(LangageParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterFor(LangageParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitFor(LangageParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LangageParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LangageParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LangageParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(LangageParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(LangageParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(LangageParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(LangageParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LangageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangageParser.ProgContext ctx);
}