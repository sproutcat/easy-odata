// Generated from D:/resoures/workspace-my.4/easy-odata-all/server/easy-odata-code/src/test/resources\OdataFilter.g4 by ANTLR 4.7

package com.tang.easyodata.code.antlr4.ast;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OdataFilterParser}.
 */
public interface OdataFilterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#odataFilter}.
	 * @param ctx the parse tree
	 */
	void enterOdataFilter(OdataFilterParser.OdataFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#odataFilter}.
	 * @param ctx the parse tree
	 */
	void exitOdataFilter(OdataFilterParser.OdataFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaExpression}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaExpression(OdataFilterParser.CriteriaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaExpression}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaExpression(OdataFilterParser.CriteriaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaIterm}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaIterm(OdataFilterParser.CriteriaItermContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaIterm}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaIterm(OdataFilterParser.CriteriaItermContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaFactor}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaFactor(OdataFilterParser.CriteriaFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaFactor}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaFactor(OdataFilterParser.CriteriaFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#simpleCriteria}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCriteria(OdataFilterParser.SimpleCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#simpleCriteria}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCriteria(OdataFilterParser.SimpleCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaLike}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaLike(OdataFilterParser.CriteriaLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaLike}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaLike(OdataFilterParser.CriteriaLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaEndswith}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaEndswith(OdataFilterParser.CriteriaEndswithContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaEndswith}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaEndswith(OdataFilterParser.CriteriaEndswithContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaStartswith}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaStartswith(OdataFilterParser.CriteriaStartswithContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaStartswith}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaStartswith(OdataFilterParser.CriteriaStartswithContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaNotLike}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaNotLike(OdataFilterParser.CriteriaNotLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaNotLike}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaNotLike(OdataFilterParser.CriteriaNotLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#criteriaOther}.
	 * @param ctx the parse tree
	 */
	void enterCriteriaOther(OdataFilterParser.CriteriaOtherContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#criteriaOther}.
	 * @param ctx the parse tree
	 */
	void exitCriteriaOther(OdataFilterParser.CriteriaOtherContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(OdataFilterParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(OdataFilterParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(OdataFilterParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(OdataFilterParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link OdataFilterParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(OdataFilterParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link OdataFilterParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(OdataFilterParser.ValueContext ctx);
}