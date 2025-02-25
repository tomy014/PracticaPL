// Generated from C:/Users/Alberto/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica Obligatoria/PracticaPL/src/TraductorPascal.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TraductorPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, IDENTIFIER=23, NUMERIC_INTEGER_CONST=24, 
		NUMERIC_REAL_CONST=25, STRING_CONST=26, LINE=27, COMMENT=28, IGNORE=29, 
		ID=30, CONSTINT=31, CONSTREAL=32, CONSTLIT=33;
	public static final int
		RULE_prg = 0, RULE_blq = 1, RULE_dcllist = 2, RULE_sentlist = 3, RULE_dcl = 4, 
		RULE_defcte = 5, RULE_ctelist = 6, RULE_simpvalue = 7, RULE_defvar = 8, 
		RULE_defvarlist = 9, RULE_varlist = 10, RULE_defproc = 11, RULE_deffun = 12, 
		RULE_formal_paramlist = 13, RULE_formal_param = 14, RULE_tbas = 15, RULE_sent = 16, 
		RULE_asig = 17, RULE_exp = 18, RULE_op = 19, RULE_oparit = 20, RULE_factor = 21, 
		RULE_subparamlist = 22, RULE_explist = 23, RULE_proc_call = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "blq", "dcllist", "sentlist", "dcl", "defcte", "ctelist", "simpvalue", 
			"defvar", "defvarlist", "varlist", "defproc", "deffun", "formal_paramlist", 
			"formal_param", "tbas", "sent", "asig", "exp", "op", "oparit", "factor", 
			"subparamlist", "explist", "proc_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'begin'", "'end'", "'const'", "'='", 
			"'var'", "':'", "','", "'procedure'", "'function'", "'('", "')'", "'INTEGER'", 
			"'REAL'", "':='", "'+'", "'-'", "'*'", "'div'", "'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"NUMERIC_INTEGER_CONST", "NUMERIC_REAL_CONST", "STRING_CONST", "LINE", 
			"COMMENT", "IGNORE", "ID", "CONSTINT", "CONSTREAL", "CONSTLIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TraductorPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TraductorPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(ID);
			setState(52);
			match(T__1);
			setState(53);
			blq();
			setState(54);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlqContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public BlqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterBlq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitBlq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitBlq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlqContext blq() throws RecognitionException {
		BlqContext _localctx = new BlqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			dcllist(0);
			setState(57);
			match(T__3);
			setState(58);
			sentlist(0);
			setState(59);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist() throws RecognitionException {
		return dcllist(0);
	}

	private DcllistContext dcllist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DcllistContext _localctx = new DcllistContext(_ctx, _parentState);
		DcllistContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_dcllist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DcllistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dcllist);
					setState(62);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(63);
					dcl();
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist() throws RecognitionException {
		return sentlist(0);
	}

	private SentlistContext sentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SentlistContext _localctx = new SentlistContext(_ctx, _parentState);
		SentlistContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_sentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(70);
			sent();
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sentlist);
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					sent();
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DefprocContext defproc() {
			return getRuleContext(DefprocContext.class,0);
		}
		public DeffunContext deffun() {
			return getRuleContext(DeffunContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcl);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				defcte();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				defvar();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				defproc();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				deffun();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefcteContext extends ParserRuleContext {
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDefcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDefcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcteContext defcte() throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__5);
			setState(86);
			ctelist(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist() throws RecognitionException {
		return ctelist(0);
	}

	private CtelistContext ctelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CtelistContext _localctx = new CtelistContext(_ctx, _parentState);
		CtelistContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_ctelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			match(ID);
			setState(90);
			match(T__6);
			setState(91);
			simpvalue();
			setState(92);
			match(T__1);
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CtelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ctelist);
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					match(ID);
					setState(96);
					match(T__6);
					setState(97);
					simpvalue();
					setState(98);
					match(T__1);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode CONSTINT() { return getToken(TraductorPascalParser.CONSTINT, 0); }
		public TerminalNode CONSTREAL() { return getToken(TraductorPascalParser.CONSTREAL, 0); }
		public TerminalNode CONSTLIT() { return getToken(TraductorPascalParser.CONSTLIT, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarContext extends ParserRuleContext {
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDefvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDefvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarContext defvar() throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__7);
			setState(108);
			defvarlist(0);
			setState(109);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefvarlistContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistContext defvarlist() {
			return getRuleContext(DefvarlistContext.class,0);
		}
		public DefvarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDefvarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDefvarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDefvarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistContext defvarlist() throws RecognitionException {
		return defvarlist(0);
	}

	private DefvarlistContext defvarlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, _parentState);
		DefvarlistContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_defvarlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(112);
			varlist();
			setState(113);
			match(T__8);
			setState(114);
			tbas();
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DefvarlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_defvarlist);
					setState(116);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(117);
					match(T__1);
					setState(118);
					varlist();
					setState(119);
					match(T__8);
					setState(120);
					tbas();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varlist);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(ID);
				setState(129);
				match(T__9);
				setState(130);
				varlist();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefprocContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DefprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDefproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDefproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDefproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefprocContext defproc() throws RecognitionException {
		DefprocContext _localctx = new DefprocContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__10);
			setState(134);
			match(ID);
			setState(135);
			formal_paramlist();
			setState(136);
			match(T__1);
			setState(137);
			blq();
			setState(138);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeffunContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public DeffunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deffun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDeffun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDeffun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDeffun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeffunContext deffun() throws RecognitionException {
		DeffunContext _localctx = new DeffunContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__11);
			setState(141);
			match(ID);
			setState(142);
			formal_paramlist();
			setState(143);
			match(T__8);
			setState(144);
			tbas();
			setState(145);
			match(T__1);
			setState(146);
			blq();
			setState(147);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_formal_paramlist);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__12);
				setState(151);
				formal_param();
				setState(152);
				match(T__13);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFormal_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFormal_param(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFormal_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramContext formal_param() throws RecognitionException {
		Formal_paramContext _localctx = new Formal_paramContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_formal_param);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				varlist();
				setState(157);
				match(T__8);
				setState(158);
				tbas();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				varlist();
				setState(161);
				match(T__8);
				setState(162);
				tbas();
				setState(163);
				match(T__1);
				setState(164);
				formal_param();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class TbasContext extends ParserRuleContext {
		public TbasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tbas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterTbas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitTbas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitTbas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TbasContext tbas() throws RecognitionException {
		TbasContext _localctx = new TbasContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tbas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sent);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				asig();
				setState(171);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				proc_call();
				setState(174);
				match(T__1);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsigContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AsigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterAsig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitAsig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitAsig(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsigContext asig() throws RecognitionException {
		AsigContext _localctx = new AsigContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(179);
			match(T__16);
			setState(180);
			exp(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(185);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(186);
					op();
					setState(187);
					exp(3);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			oparit();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8126464L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				simpvalue();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(T__12);
				setState(200);
				exp(0);
				setState(201);
				match(T__13);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(ID);
				setState(204);
				subparamlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubparamlistContext extends ParserRuleContext {
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public SubparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterSubparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitSubparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitSubparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubparamlistContext subparamlist() throws RecognitionException {
		SubparamlistContext _localctx = new SubparamlistContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_subparamlist);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__12);
				setState(209);
				explist();
				setState(210);
				match(T__13);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_explist);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				exp(0);
				setState(216);
				match(T__9);
				setState(217);
				explist();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public SubparamlistContext subparamlist() {
			return getRuleContext(SubparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			setState(222);
			subparamlist();
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
		case 2:
			return dcllist_sempred((DcllistContext)_localctx, predIndex);
		case 3:
			return sentlist_sempred((SentlistContext)_localctx, predIndex);
		case 6:
			return ctelist_sempred((CtelistContext)_localctx, predIndex);
		case 9:
			return defvarlist_sempred((DefvarlistContext)_localctx, predIndex);
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dcllist_sempred(DcllistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sentlist_sempred(SentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ctelist_sempred(CtelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean defvarlist_sempred(DefvarlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"K\b\u0003\n\u0003\f\u0003N\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006e\b\u0006\n\u0006\f\u0006h\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t{\b\t\n\t\f"+
		"\t~\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009b\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u00b1\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u00be\b\u0012\n\u0012\f\u0012\u00c1"+
		"\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00ce\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00d5\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u00dc\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0000\u0005\u0004\u0006\f\u0012$\u0019\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.0\u0000\u0003\u0001\u0000\u001f!\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u0012\u0016\u00d7\u00002\u0001\u0000\u0000\u0000\u00028\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000"+
		"\bS\u0001\u0000\u0000\u0000\nU\u0001\u0000\u0000\u0000\fX\u0001\u0000"+
		"\u0000\u0000\u000ei\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000"+
		"\u0012o\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016"+
		"\u0085\u0001\u0000\u0000\u0000\u0018\u008c\u0001\u0000\u0000\u0000\u001a"+
		"\u009a\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e"+
		"\u00a8\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000\u0000\u0000\"\u00b2"+
		"\u0001\u0000\u0000\u0000$\u00b6\u0001\u0000\u0000\u0000&\u00c2\u0001\u0000"+
		"\u0000\u0000(\u00c4\u0001\u0000\u0000\u0000*\u00cd\u0001\u0000\u0000\u0000"+
		",\u00d4\u0001\u0000\u0000\u0000.\u00db\u0001\u0000\u0000\u00000\u00dd"+
		"\u0001\u0000\u0000\u000023\u0005\u0001\u0000\u000034\u0005\u001e\u0000"+
		"\u000045\u0005\u0002\u0000\u000056\u0003\u0002\u0001\u000067\u0005\u0003"+
		"\u0000\u00007\u0001\u0001\u0000\u0000\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0005\u0004\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0005\u0005\u0000"+
		"\u0000<\u0003\u0001\u0000\u0000\u0000=B\u0006\u0002\uffff\uffff\u0000"+
		">?\n\u0001\u0000\u0000?A\u0003\b\u0004\u0000@>\u0001\u0000\u0000\u0000"+
		"AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000C\u0005\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EF\u0006"+
		"\u0003\uffff\uffff\u0000FG\u0003 \u0010\u0000GL\u0001\u0000\u0000\u0000"+
		"HI\n\u0001\u0000\u0000IK\u0003 \u0010\u0000JH\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u0007\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OT\u0003"+
		"\n\u0005\u0000PT\u0003\u0010\b\u0000QT\u0003\u0016\u000b\u0000RT\u0003"+
		"\u0018\f\u0000SO\u0001\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000T\t\u0001\u0000\u0000\u0000"+
		"UV\u0005\u0006\u0000\u0000VW\u0003\f\u0006\u0000W\u000b\u0001\u0000\u0000"+
		"\u0000XY\u0006\u0006\uffff\uffff\u0000YZ\u0005\u001e\u0000\u0000Z[\u0005"+
		"\u0007\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u0002\u0000\u0000"+
		"]f\u0001\u0000\u0000\u0000^_\n\u0001\u0000\u0000_`\u0005\u001e\u0000\u0000"+
		"`a\u0005\u0007\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0005\u0002\u0000"+
		"\u0000ce\u0001\u0000\u0000\u0000d^\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\r\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0007\u0000\u0000\u0000"+
		"j\u000f\u0001\u0000\u0000\u0000kl\u0005\b\u0000\u0000lm\u0003\u0012\t"+
		"\u0000mn\u0005\u0002\u0000\u0000n\u0011\u0001\u0000\u0000\u0000op\u0006"+
		"\t\uffff\uffff\u0000pq\u0003\u0014\n\u0000qr\u0005\t\u0000\u0000rs\u0003"+
		"\u001e\u000f\u0000s|\u0001\u0000\u0000\u0000tu\n\u0001\u0000\u0000uv\u0005"+
		"\u0002\u0000\u0000vw\u0003\u0014\n\u0000wx\u0005\t\u0000\u0000xy\u0003"+
		"\u001e\u000f\u0000y{\u0001\u0000\u0000\u0000zt\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u0013\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0084\u0005\u001e\u0000\u0000\u0080\u0081\u0005\u001e\u0000\u0000\u0081"+
		"\u0082\u0005\n\u0000\u0000\u0082\u0084\u0003\u0014\n\u0000\u0083\u007f"+
		"\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0015"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087"+
		"\u0005\u001e\u0000\u0000\u0087\u0088\u0003\u001a\r\u0000\u0088\u0089\u0005"+
		"\u0002\u0000\u0000\u0089\u008a\u0003\u0002\u0001\u0000\u008a\u008b\u0005"+
		"\u0002\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\f\u0000\u0000\u008d\u008e\u0005\u001e\u0000\u0000\u008e\u008f\u0003\u001a"+
		"\r\u0000\u008f\u0090\u0005\t\u0000\u0000\u0090\u0091\u0003\u001e\u000f"+
		"\u0000\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0093\u0003\u0002\u0001"+
		"\u0000\u0093\u0094\u0005\u0002\u0000\u0000\u0094\u0019\u0001\u0000\u0000"+
		"\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\u0005\r\u0000\u0000"+
		"\u0097\u0098\u0003\u001c\u000e\u0000\u0098\u0099\u0005\u000e\u0000\u0000"+
		"\u0099\u009b\u0001\u0000\u0000\u0000\u009a\u0095\u0001\u0000\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009b\u001b\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0003\u0014\n\u0000\u009d\u009e\u0005\t\u0000\u0000\u009e"+
		"\u009f\u0003\u001e\u000f\u0000\u009f\u00a7\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0014\n\u0000\u00a1\u00a2\u0005\t\u0000\u0000\u00a2\u00a3"+
		"\u0003\u001e\u000f\u0000\u00a3\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5"+
		"\u0003\u001c\u000e\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u009c"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000\u0000\u00a7\u001d"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0007\u0001\u0000\u0000\u00a9\u001f"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\"\u0011\u0000\u00ab\u00ac\u0005"+
		"\u0002\u0000\u0000\u00ac\u00b1\u0001\u0000\u0000\u0000\u00ad\u00ae\u0003"+
		"0\u0018\u0000\u00ae\u00af\u0005\u0002\u0000\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b1!\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0011\u0000\u0000\u00b4\u00b5\u0003$\u0012\u0000"+
		"\u00b5#\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0012\uffff\uffff\u0000"+
		"\u00b7\u00b8\u0003*\u0015\u0000\u00b8\u00bf\u0001\u0000\u0000\u0000\u00b9"+
		"\u00ba\n\u0002\u0000\u0000\u00ba\u00bb\u0003&\u0013\u0000\u00bb\u00bc"+
		"\u0003$\u0012\u0003\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001"+
		"\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0%\u0001\u0000"+
		"\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003(\u0014"+
		"\u0000\u00c3\'\u0001\u0000\u0000\u0000\u00c4\u00c5\u0007\u0002\u0000\u0000"+
		"\u00c5)\u0001\u0000\u0000\u0000\u00c6\u00ce\u0003\u000e\u0007\u0000\u00c7"+
		"\u00c8\u0005\r\u0000\u0000\u00c8\u00c9\u0003$\u0012\u0000\u00c9\u00ca"+
		"\u0005\u000e\u0000\u0000\u00ca\u00ce\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u001e\u0000\u0000\u00cc\u00ce\u0003,\u0016\u0000\u00cd\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001"+
		"\u0000\u0000\u0000\u00ce+\u0001\u0000\u0000\u0000\u00cf\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0005\r\u0000\u0000\u00d1\u00d2\u0003.\u0017"+
		"\u0000\u00d2\u00d3\u0005\u000e\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d5-\u0001\u0000\u0000\u0000\u00d6\u00dc\u0003$\u0012\u0000\u00d7"+
		"\u00d8\u0003$\u0012\u0000\u00d8\u00d9\u0005\n\u0000\u0000\u00d9\u00da"+
		"\u0003.\u0017\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d6\u0001"+
		"\u0000\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc/\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005\u001e\u0000\u0000\u00de\u00df\u0003,\u0016"+
		"\u0000\u00df1\u0001\u0000\u0000\u0000\rBLSf|\u0083\u009a\u00a6\u00b0\u00bf"+
		"\u00cd\u00d4\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}