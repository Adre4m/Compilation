// Generated from /home/etud/o2132140/Documents/Compilation/TD2/langage/src/Langage.g4 by ANTLR 4.6

//package org.meri.antlr_step_by_step.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, NUM=30, VAR=31, WS=32, 
		CHAR=33, PARO=34, PARF=35, BRAO=36, BRAF=37, BOOL=38;
	public static final int
		RULE_comp = 0, RULE_variable = 1, RULE_character = 2, RULE_op = 3, RULE_expr = 4, 
		RULE_bexp = 5, RULE_stmt = 6, RULE_elseif = 7, RULE_elseCond = 8, RULE_cond = 9, 
		RULE_loop = 10, RULE_lang = 11, RULE_prog = 12;
	public static final String[] ruleNames = {
		"comp", "variable", "character", "op", "expr", "bexp", "stmt", "elseif", 
		"elseCond", "cond", "loop", "lang", "prog"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'+'", "'*'", "'-'", 
		"'/'", "'%'", "'\"'", "'true'", "'false'", "'!'", "'&&'", "'||'", "'skip'", 
		"'='", "';'", "'--'", "'++'", "'else'", "'if'", "'then'", "'end'", "'for'", 
		"'do'", "'while'", null, null, null, null, "'('", "')'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NUM", "VAR", "WS", "CHAR", "PARO", 
		"PARF", "BRAO", "BRAF", "BOOL"
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
	public String getGrammarFileName() { return "Langage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompContext extends ParserRuleContext {
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LangageParser.VAR, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(LangageParser.CHAR, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_character);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(CHAR);
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LangageParser.NUM, 0); }
		public NumberContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExprContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				match(NUM);
				}
				break;
			case VAR:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				variable();
				}
				break;
			case CHAR:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				character();
				}
				break;
			case T__11:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(38);
				match(T__11);
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(39);
						matchWildcard();
						}
						} 
					}
					setState(44);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(45);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OperationContext(new ExprContext(_parentctx, _parentState));
					((OperationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(48);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(49);
					op();
					setState(50);
					((OperationContext)_localctx).right = expr(2);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BexpContext extends ParserRuleContext {
		public BexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexp; }
	 
		public BexpContext() { }
		public void copyFrom(BexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends BexpContext {
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public NotContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends BexpContext {
		public ExprContext left;
		public ExprContext right;
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompareContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanContext extends BexpContext {
		public BooleanContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends BexpContext {
		public BexpContext lor;
		public BexpContext ror;
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public OrContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends BexpContext {
		public BexpContext land;
		public BexpContext rand;
		public List<BexpContext> bexp() {
			return getRuleContexts(BexpContext.class);
		}
		public BexpContext bexp(int i) {
			return getRuleContext(BexpContext.class,i);
		}
		public AndContext(BexpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BexpContext bexp() throws RecognitionException {
		return bexp(0);
	}

	private BexpContext bexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BexpContext _localctx = new BexpContext(_ctx, _parentState);
		BexpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_bexp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(58);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__14:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(T__14);
				setState(60);
				bexp(4);
				}
				break;
			case T__11:
			case NUM:
			case VAR:
			case CHAR:
				{
				_localctx = new CompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((CompareContext)_localctx).left = expr(0);
				setState(62);
				comp();
				setState(63);
				((CompareContext)_localctx).right = expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new BexpContext(_parentctx, _parentState));
						((AndContext)_localctx).land = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(67);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(68);
						match(T__15);
						setState(69);
						((AndContext)_localctx).rand = bexp(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new BexpContext(_parentctx, _parentState));
						((OrContext)_localctx).lor = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bexp);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71);
						match(T__16);
						setState(72);
						((OrContext)_localctx).ror = bexp(3);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AffectExprContext extends StmtContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AffectExprContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAffectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAffectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAffectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleStmtContext extends StmtContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public DoubleStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDoubleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDoubleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDoubleStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncrementVarContext extends StmtContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IncrementVarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterIncrementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitIncrementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitIncrementVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AffectBoolContext extends StmtContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public AffectBoolContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterAffectBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitAffectBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitAffectBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends StmtContext {
		public SkipContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StmtContext {
		public TerminalNode BRAO() { return getToken(LangageParser.BRAO, 0); }
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public TerminalNode BRAF() { return getToken(LangageParser.BRAF, 0); }
		public BlockContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecrementVarContext extends StmtContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DecrementVarContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterDecrementVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitDecrementVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitDecrementVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		return stmt(0);
	}

	private StmtContext stmt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StmtContext _localctx = new StmtContext(_ctx, _parentState);
		StmtContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_stmt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(79);
				match(T__17);
				}
				break;
			case 2:
				{
				_localctx = new AffectExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				variable();
				setState(81);
				match(T__18);
				setState(82);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new AffectBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				variable();
				setState(85);
				match(T__18);
				setState(86);
				bexp(0);
				}
				break;
			case 4:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(BRAO);
				setState(89);
				lang();
				setState(90);
				match(BRAF);
				}
				break;
			case 5:
				{
				_localctx = new DecrementVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				variable();
				setState(93);
				match(T__20);
				}
				break;
			case 6:
				{
				_localctx = new IncrementVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				variable();
				setState(96);
				match(T__21);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DoubleStmtContext(new StmtContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stmt);
					setState(100);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(101);
					match(T__19);
					setState(102);
					stmt(5);
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode PARO() { return getToken(LangageParser.PARO, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode PARF() { return getToken(LangageParser.PARF, 0); }
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__22);
			setState(109);
			match(T__23);
			setState(110);
			match(PARO);
			setState(111);
			bexp(0);
			setState(112);
			match(PARF);
			setState(113);
			match(T__24);
			setState(114);
			lang();
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

	public static class ElseCondContext extends ParserRuleContext {
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public ElseCondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseCond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterElseCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitElseCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitElseCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseCondContext elseCond() throws RecognitionException {
		ElseCondContext _localctx = new ElseCondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseCond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__22);
			setState(117);
			lang();
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

	public static class CondContext extends ParserRuleContext {
		public BexpContext ifE;
		public LangContext ifB;
		public TerminalNode PARO() { return getToken(LangageParser.PARO, 0); }
		public TerminalNode PARF() { return getToken(LangageParser.PARF, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public ElseCondContext elseCond() {
			return getRuleContext(ElseCondContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__23);
			setState(120);
			match(PARO);
			setState(121);
			((CondContext)_localctx).ifE = bexp(0);
			setState(122);
			match(PARF);
			setState(123);
			match(T__24);
			setState(124);
			((CondContext)_localctx).ifB = lang();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					elseif();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(131);
				elseCond();
				}
			}

			setState(134);
			match(T__25);
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForContext extends LoopContext {
		public StmtContext init;
		public StmtContext incr;
		public TerminalNode PARO() { return getToken(LangageParser.PARO, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode PARF() { return getToken(LangageParser.PARF, 0); }
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ForContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends LoopContext {
		public TerminalNode PARO() { return getToken(LangageParser.PARO, 0); }
		public BexpContext bexp() {
			return getRuleContext(BexpContext.class,0);
		}
		public TerminalNode PARF() { return getToken(LangageParser.PARF, 0); }
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public WhileContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__26);
				setState(137);
				match(PARO);
				setState(138);
				((ForContext)_localctx).init = stmt(0);
				setState(139);
				match(T__19);
				setState(140);
				bexp(0);
				setState(141);
				match(T__19);
				setState(142);
				((ForContext)_localctx).incr = stmt(0);
				setState(143);
				match(PARF);
				setState(144);
				match(T__27);
				setState(145);
				lang();
				setState(146);
				match(T__25);
				}
				break;
			case T__28:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__28);
				setState(149);
				match(PARO);
				setState(150);
				bexp(0);
				setState(151);
				match(PARF);
				setState(152);
				match(T__27);
				setState(153);
				lang();
				setState(154);
				match(T__25);
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

	public static class LangContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public LangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterLang(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitLang(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitLang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LangContext lang() throws RecognitionException {
		LangContext _localctx = new LangContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lang);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__17:
					case VAR:
					case BRAO:
						{
						setState(158);
						stmt(0);
						}
						break;
					case T__23:
						{
						setState(159);
						cond();
						}
						break;
					case T__26:
					case T__28:
						{
						setState(160);
						loop();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class ProgContext extends ParserRuleContext {
		public LangContext lang() {
			return getRuleContext(LangContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangageListener ) ((LangageListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangageVisitor ) return ((LangageVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			lang();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return bexp_sempred((BexpContext)_localctx, predIndex);
		case 6:
			return stmt_sempred((StmtContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bexp_sempred(BexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean stmt_sempred(StmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6+\n\6\f\6\16\6.\13\6\3\6\5\6\61\n\6\3\6\3\6\3\6\3"+
		"\6\7\6\67\n\6\f\6\16\6:\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3"+
		"\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16\13"+
		"\u0084\13\13\3\13\5\13\u0087\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n\f\3"+
		"\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\3\16\3\16\3\16\3\u00a5\5"+
		"\n\f\16\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\3\b\3\2\t\r\3\2\17"+
		"\20\u00b2\2\34\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n\60\3\2\2"+
		"\2\fC\3\2\2\2\16d\3\2\2\2\20n\3\2\2\2\22v\3\2\2\2\24y\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00a5\3\2\2\2\32\u00a8\3\2\2\2\34\35\t\2\2\2\35\3\3\2\2\2"+
		"\36\37\7!\2\2\37\5\3\2\2\2 !\7#\2\2!\7\3\2\2\2\"#\t\3\2\2#\t\3\2\2\2$"+
		"%\b\6\1\2%\61\7 \2\2&\61\5\4\3\2\'\61\5\6\4\2(,\7\16\2\2)+\13\2\2\2*)"+
		"\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\61\7\16\2"+
		"\2\60$\3\2\2\2\60&\3\2\2\2\60\'\3\2\2\2\60(\3\2\2\2\618\3\2\2\2\62\63"+
		"\f\3\2\2\63\64\5\b\5\2\64\65\5\n\6\4\65\67\3\2\2\2\66\62\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\13\3\2\2\2:8\3\2\2\2;<\b\7\1\2<D\t\4\2\2"+
		"=>\7\21\2\2>D\5\f\7\6?@\5\n\6\2@A\5\2\2\2AB\5\n\6\2BD\3\2\2\2C;\3\2\2"+
		"\2C=\3\2\2\2C?\3\2\2\2DM\3\2\2\2EF\f\5\2\2FG\7\22\2\2GL\5\f\7\6HI\f\4"+
		"\2\2IJ\7\23\2\2JL\5\f\7\5KE\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2N\r\3\2\2\2OM\3\2\2\2PQ\b\b\1\2Qe\7\24\2\2RS\5\4\3\2ST\7\25\2\2"+
		"TU\5\n\6\2Ue\3\2\2\2VW\5\4\3\2WX\7\25\2\2XY\5\f\7\2Ye\3\2\2\2Z[\7&\2\2"+
		"[\\\5\30\r\2\\]\7\'\2\2]e\3\2\2\2^_\5\4\3\2_`\7\27\2\2`e\3\2\2\2ab\5\4"+
		"\3\2bc\7\30\2\2ce\3\2\2\2dP\3\2\2\2dR\3\2\2\2dV\3\2\2\2dZ\3\2\2\2d^\3"+
		"\2\2\2da\3\2\2\2ek\3\2\2\2fg\f\6\2\2gh\7\26\2\2hj\5\16\b\7if\3\2\2\2j"+
		"m\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3\2\2\2no\7\31\2\2op\7\32"+
		"\2\2pq\7$\2\2qr\5\f\7\2rs\7%\2\2st\7\33\2\2tu\5\30\r\2u\21\3\2\2\2vw\7"+
		"\31\2\2wx\5\30\r\2x\23\3\2\2\2yz\7\32\2\2z{\7$\2\2{|\5\f\7\2|}\7%\2\2"+
		"}~\7\33\2\2~\u0082\5\30\r\2\177\u0081\5\20\t\2\u0080\177\3\2\2\2\u0081"+
		"\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\34\2\2\u0089\25\3\2\2"+
		"\2\u008a\u008b\7\35\2\2\u008b\u008c\7$\2\2\u008c\u008d\5\16\b\2\u008d"+
		"\u008e\7\26\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7\26\2\2\u0090\u0091\5"+
		"\16\b\2\u0091\u0092\7%\2\2\u0092\u0093\7\36\2\2\u0093\u0094\5\30\r\2\u0094"+
		"\u0095\7\34\2\2\u0095\u009f\3\2\2\2\u0096\u0097\7\37\2\2\u0097\u0098\7"+
		"$\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7%\2\2\u009a\u009b\7\36\2\2\u009b"+
		"\u009c\5\30\r\2\u009c\u009d\7\34\2\2\u009d\u009f\3\2\2\2\u009e\u008a\3"+
		"\2\2\2\u009e\u0096\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a4\5\16\b\2\u00a1"+
		"\u00a4\5\24\13\2\u00a2\u00a4\5\26\f\2\u00a3\u00a0\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\31\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\30\r"+
		"\2\u00a9\33\3\2\2\2\17,\608CKMdk\u0082\u0086\u009e\u00a3\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}