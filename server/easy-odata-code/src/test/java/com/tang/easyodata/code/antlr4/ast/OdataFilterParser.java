// Generated from D:/resoures/workspace-my.4/easy-odata-all/server/easy-odata-code/src/test/resources\OdataFilter.g4 by ANTLR 4.7

package com.tang.easyodata.code.antlr4.ast;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OdataFilterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, WORD=29, DATATIME=30, STRING=31, 
		NUMBER=32, WS=33;
	public static final int
		RULE_odataFilter = 0, RULE_criteriaExpression = 1, RULE_criteriaIterm = 2, 
		RULE_criteriaFactor = 3, RULE_simpleCriteria = 4, RULE_criteriaLike = 5, 
		RULE_criteriaEndswith = 6, RULE_criteriaStartswith = 7, RULE_criteriaNotLike = 8, 
		RULE_criteriaOther = 9, RULE_field = 10, RULE_operate = 11, RULE_value = 12;
	public static final String[] ruleNames = {
		"odataFilter", "criteriaExpression", "criteriaIterm", "criteriaFactor", 
		"simpleCriteria", "criteriaLike", "criteriaEndswith", "criteriaStartswith", 
		"criteriaNotLike", "criteriaOther", "field", "operate", "value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'OR'", "'or'", "'O'", "'o'", "'AND'", "'and'", "'E'", "'e'", "'('", 
		"')'", "'substringof('", "'contains('", "','", "'endswith('", "'startswith('", 
		"'indexof('", "') eq -1'", "'eq'", "'ne'", "'gt'", "'ge'", "'lt'", "'le'", 
		"'ni'", "'in'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "WORD", "DATATIME", "STRING", "NUMBER", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "OdataFilter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OdataFilterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OdataFilterContext extends ParserRuleContext {
		public CriteriaExpressionContext criteriaExpression() {
			return getRuleContext(CriteriaExpressionContext.class,0);
		}
		public OdataFilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_odataFilter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterOdataFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitOdataFilter(this);
		}
	}

	public final OdataFilterContext odataFilter() throws RecognitionException {
		OdataFilterContext _localctx = new OdataFilterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_odataFilter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			criteriaExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaExpressionContext extends ParserRuleContext {
		public List<CriteriaItermContext> criteriaIterm() {
			return getRuleContexts(CriteriaItermContext.class);
		}
		public CriteriaItermContext criteriaIterm(int i) {
			return getRuleContext(CriteriaItermContext.class,i);
		}
		public CriteriaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaExpression(this);
		}
	}

	public final CriteriaExpressionContext criteriaExpression() throws RecognitionException {
		CriteriaExpressionContext _localctx = new CriteriaExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_criteriaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			criteriaIterm();
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				{
				setState(29);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(30);
				criteriaIterm();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaItermContext extends ParserRuleContext {
		public List<CriteriaFactorContext> criteriaFactor() {
			return getRuleContexts(CriteriaFactorContext.class);
		}
		public CriteriaFactorContext criteriaFactor(int i) {
			return getRuleContext(CriteriaFactorContext.class,i);
		}
		public CriteriaItermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaIterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaIterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaIterm(this);
		}
	}

	public final CriteriaItermContext criteriaIterm() throws RecognitionException {
		CriteriaItermContext _localctx = new CriteriaItermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_criteriaIterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			criteriaFactor();
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) {
				{
				{
				setState(37);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				criteriaFactor();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaFactorContext extends ParserRuleContext {
		public SimpleCriteriaContext simpleCriteria() {
			return getRuleContext(SimpleCriteriaContext.class,0);
		}
		public CriteriaExpressionContext criteriaExpression() {
			return getRuleContext(CriteriaExpressionContext.class,0);
		}
		public CriteriaFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaFactor(this);
		}
	}

	public final CriteriaFactorContext criteriaFactor() throws RecognitionException {
		CriteriaFactorContext _localctx = new CriteriaFactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_criteriaFactor);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case T__15:
			case WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				simpleCriteria();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(T__8);
				setState(46);
				criteriaExpression();
				setState(47);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleCriteriaContext extends ParserRuleContext {
		public CriteriaLikeContext criteriaLike() {
			return getRuleContext(CriteriaLikeContext.class,0);
		}
		public CriteriaEndswithContext criteriaEndswith() {
			return getRuleContext(CriteriaEndswithContext.class,0);
		}
		public CriteriaStartswithContext criteriaStartswith() {
			return getRuleContext(CriteriaStartswithContext.class,0);
		}
		public CriteriaNotLikeContext criteriaNotLike() {
			return getRuleContext(CriteriaNotLikeContext.class,0);
		}
		public CriteriaOtherContext criteriaOther() {
			return getRuleContext(CriteriaOtherContext.class,0);
		}
		public SimpleCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterSimpleCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitSimpleCriteria(this);
		}
	}

	public final SimpleCriteriaContext simpleCriteria() throws RecognitionException {
		SimpleCriteriaContext _localctx = new SimpleCriteriaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleCriteria);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				criteriaLike();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				criteriaEndswith();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				criteriaStartswith();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(54);
				criteriaNotLike();
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				criteriaOther();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaLikeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OdataFilterParser.STRING, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CriteriaLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaLike(this);
		}
	}

	public final CriteriaLikeContext criteriaLike() throws RecognitionException {
		CriteriaLikeContext _localctx = new CriteriaLikeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_criteriaLike);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(59);
			match(STRING);
			setState(60);
			match(T__12);
			setState(61);
			field();
			setState(62);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaEndswithContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OdataFilterParser.STRING, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CriteriaEndswithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaEndswith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaEndswith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaEndswith(this);
		}
	}

	public final CriteriaEndswithContext criteriaEndswith() throws RecognitionException {
		CriteriaEndswithContext _localctx = new CriteriaEndswithContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_criteriaEndswith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__13);
			setState(65);
			match(STRING);
			setState(66);
			match(T__12);
			setState(67);
			field();
			setState(68);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaStartswithContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OdataFilterParser.STRING, 0); }
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public CriteriaStartswithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaStartswith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaStartswith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaStartswith(this);
		}
	}

	public final CriteriaStartswithContext criteriaStartswith() throws RecognitionException {
		CriteriaStartswithContext _localctx = new CriteriaStartswithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_criteriaStartswith);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__14);
			setState(71);
			match(STRING);
			setState(72);
			match(T__12);
			setState(73);
			field();
			setState(74);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaNotLikeContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode STRING() { return getToken(OdataFilterParser.STRING, 0); }
		public CriteriaNotLikeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaNotLike; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaNotLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaNotLike(this);
		}
	}

	public final CriteriaNotLikeContext criteriaNotLike() throws RecognitionException {
		CriteriaNotLikeContext _localctx = new CriteriaNotLikeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_criteriaNotLike);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__15);
			setState(77);
			field();
			setState(78);
			match(T__12);
			setState(79);
			match(STRING);
			setState(80);
			match(T__16);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CriteriaOtherContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CriteriaOtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_criteriaOther; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterCriteriaOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitCriteriaOther(this);
		}
	}

	public final CriteriaOtherContext criteriaOther() throws RecognitionException {
		CriteriaOtherContext _localctx = new CriteriaOtherContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_criteriaOther);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			field();
			setState(83);
			operate();
			setState(84);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(OdataFilterParser.WORD, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperateContext extends ParserRuleContext {
		public OperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitOperate(this);
		}
	}

	public final OperateContext operate() throws RecognitionException {
		OperateContext _localctx = new OperateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OdataFilterParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(OdataFilterParser.NUMBER, 0); }
		public TerminalNode DATATIME() { return getToken(OdataFilterParser.DATATIME, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OdataFilterListener ) ((OdataFilterListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << DATATIME) | (1L << STRING) | (1L << NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#_\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3%\13\3\3"+
		"\4\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\2\7\3\2\3\6\3\2\7\n\3\2\r\16\3\2\24\33\4\2\34\36 \"\2X\2\34\3\2\2"+
		"\2\4\36\3\2\2\2\6&\3\2\2\2\b\63\3\2\2\2\n:\3\2\2\2\f<\3\2\2\2\16B\3\2"+
		"\2\2\20H\3\2\2\2\22N\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30Z\3\2\2\2\32\\"+
		"\3\2\2\2\34\35\5\4\3\2\35\3\3\2\2\2\36#\5\6\4\2\37 \t\2\2\2 \"\5\6\4\2"+
		"!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&+\5\b"+
		"\5\2\'(\t\3\2\2(*\5\b\5\2)\'\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7"+
		"\3\2\2\2-+\3\2\2\2.\64\5\n\6\2/\60\7\13\2\2\60\61\5\4\3\2\61\62\7\f\2"+
		"\2\62\64\3\2\2\2\63.\3\2\2\2\63/\3\2\2\2\64\t\3\2\2\2\65;\5\f\7\2\66;"+
		"\5\16\b\2\67;\5\20\t\28;\5\22\n\29;\5\24\13\2:\65\3\2\2\2:\66\3\2\2\2"+
		":\67\3\2\2\2:8\3\2\2\2:9\3\2\2\2;\13\3\2\2\2<=\t\4\2\2=>\7!\2\2>?\7\17"+
		"\2\2?@\5\26\f\2@A\7\f\2\2A\r\3\2\2\2BC\7\20\2\2CD\7!\2\2DE\7\17\2\2EF"+
		"\5\26\f\2FG\7\f\2\2G\17\3\2\2\2HI\7\21\2\2IJ\7!\2\2JK\7\17\2\2KL\5\26"+
		"\f\2LM\7\f\2\2M\21\3\2\2\2NO\7\22\2\2OP\5\26\f\2PQ\7\17\2\2QR\7!\2\2R"+
		"S\7\23\2\2S\23\3\2\2\2TU\5\26\f\2UV\5\30\r\2VW\5\32\16\2W\25\3\2\2\2X"+
		"Y\7\37\2\2Y\27\3\2\2\2Z[\t\5\2\2[\31\3\2\2\2\\]\t\6\2\2]\33\3\2\2\2\6"+
		"#+\63:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}