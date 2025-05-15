// Generated from C:/Users/alber/OneDrive - Universidad Rey Juan Carlos/Documentos/Universidad - Sexto Curso/Segundo semestre/Procesadores de Lenguajes/Práctica Obligatoria/PracticaPL/src/TraductorPascal.g4 by ANTLR 4.13.2
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, ID=41, CONSTINT=42, CONSTREAL=43, CONSTLIT=44, LINE=45, 
		COMMENT=46, IGNORE=47;
	public static final int
		RULE_prg = 0, RULE_programa = 1, RULE_libreria = 2, RULE_blq = 3, RULE_dcllist = 4, 
		RULE_dcl = 5, RULE_defcte = 6, RULE_ctelist = 7, RULE_ctelistP = 8, RULE_simpvalue = 9, 
		RULE_defvar = 10, RULE_defvarlist = 11, RULE_defvarlistP = 12, RULE_varlist = 13, 
		RULE_varlistP = 14, RULE_defproc = 15, RULE_deffun = 16, RULE_formal_paramlist = 17, 
		RULE_formal_param_tail = 18, RULE_formal_param = 19, RULE_tbas = 20, RULE_sentlist = 21, 
		RULE_sentlistP = 22, RULE_sent = 23, RULE_blq_or_sent = 24, RULE_if_stmt = 25, 
		RULE_while_stmt = 26, RULE_repeat_stmt = 27, RULE_for_stmt = 28, RULE_inc = 29, 
		RULE_expcond = 30, RULE_oplog = 31, RULE_factorcond = 32, RULE_opcomp = 33, 
		RULE_asig = 34, RULE_exp = 35, RULE_exp_tail = 36, RULE_op = 37, RULE_factor = 38, 
		RULE_subparamlist = 39, RULE_explist = 40, RULE_explist_tail = 41, RULE_proc_call = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "programa", "libreria", "blq", "dcllist", "dcl", "defcte", "ctelist", 
			"ctelistP", "simpvalue", "defvar", "defvarlist", "defvarlistP", "varlist", 
			"varlistP", "defproc", "deffun", "formal_paramlist", "formal_param_tail", 
			"formal_param", "tbas", "sentlist", "sentlistP", "sent", "blq_or_sent", 
			"if_stmt", "while_stmt", "repeat_stmt", "for_stmt", "inc", "expcond", 
			"oplog", "factorcond", "opcomp", "asig", "exp", "exp_tail", "op", "factor", 
			"subparamlist", "explist", "explist_tail", "proc_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'.'", "'unit'", "'begin'", "'end'", "'const'", 
			"'='", "'var'", "':'", "','", "'procedure'", "'function'", "'('", "')'", 
			"'INTEGER'", "'REAL'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'repeat'", "'until'", "'for'", "':='", "'to'", "'downto'", "'or'", "'and'", 
			"'not'", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'div'", 
			"'mod'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "CONSTINT", "CONSTREAL", "CONSTLIT", 
			"LINE", "COMMENT", "IGNORE"
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


	    private String inputFileName;

	    public TraductorPascalParser(TokenStream input, String fileName) {
	        this(input);
	        this.inputFileName = fileName;
	    }

	public TraductorPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public LibreriaContext libreria() {
			return getRuleContext(LibreriaContext.class,0);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				programa();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				libreria();
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
	public static class ProgramaContext extends ParserRuleContext {
		public BlqContext blq;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__0);
			setState(91);
			match(ID);
			setState(92);
			match(T__1);
			setState(93);
			((ProgramaContext)_localctx).blq = blq();
			setState(94);
			match(T__2);

			    System.out.println("#include <stdio.h>\n int main() {");
			    System.out.println(((ProgramaContext)_localctx).blq.s);
			    System.out.println("return 0;\n}");

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
	public static class LibreriaContext extends ParserRuleContext {
		public Token ID;
		public DcllistContext dcllist;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public LibreriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libreria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterLibreria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitLibreria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitLibreria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LibreriaContext libreria() throws RecognitionException {
		LibreriaContext _localctx = new LibreriaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_libreria);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			setState(98);
			((LibreriaContext)_localctx).ID = match(ID);
			setState(99);
			match(T__1);
			setState(100);
			((LibreriaContext)_localctx).dcllist = dcllist();
			setState(101);
			match(T__2);

			    System.out.println("// Librería " + (((LibreriaContext)_localctx).ID!=null?((LibreriaContext)_localctx).ID.getText():null));
			    System.out.println(((LibreriaContext)_localctx).dcllist.s);

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
		public String s;
		public DcllistContext dcllist;
		public SentlistContext sentlist;
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
		enterRule(_localctx, 6, RULE_blq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((BlqContext)_localctx).dcllist = dcllist();
			setState(105);
			match(T__4);
			setState(106);
			((BlqContext)_localctx).sentlist = sentlist();
			setState(107);
			match(T__5);
			 ((BlqContext)_localctx).s =  ((BlqContext)_localctx).dcllist.s + ((BlqContext)_localctx).sentlist.s; 
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
		public String s;
		public DclContext dcl;
		public List<DclContext> dcl() {
			return getRuleContexts(DclContext.class);
		}
		public DclContext dcl(int i) {
			return getRuleContext(DclContext.class,i);
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
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dcllist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12928L) != 0)) {
				{
				{
				setState(110);
				((DcllistContext)_localctx).dcl = dcl();
				 ((DcllistContext)_localctx).s =  ((DcllistContext)_localctx).dcl.s; 
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 if (_localctx.s == null) ((DcllistContext)_localctx).s =  ""; 
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
	public static class DclContext extends ParserRuleContext {
		public String s;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefprocContext defproc;
		public DeffunContext deffun;
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
		enterRule(_localctx, 10, RULE_dcl);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				((DclContext)_localctx).defcte = defcte();
				 ((DclContext)_localctx).s =  ((DclContext)_localctx).defcte.s; 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				((DclContext)_localctx).defvar = defvar();
				 ((DclContext)_localctx).s =  ((DclContext)_localctx).defvar.s; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				((DclContext)_localctx).defproc = defproc();
				 ((DclContext)_localctx).s =  ((DclContext)_localctx).defproc.s; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				((DclContext)_localctx).deffun = deffun();
				 ((DclContext)_localctx).s =  ((DclContext)_localctx).deffun.s; 
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
		public String s;
		public CtelistContext ctelist;
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
		enterRule(_localctx, 12, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__6);
			setState(135);
			((DefcteContext)_localctx).ctelist = ctelist();
			 ((DefcteContext)_localctx).s =  ((DefcteContext)_localctx).ctelist.s; 
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
		public String s;
		public Token ID;
		public SimpvalueContext simpvalue;
		public CtelistPContext ctelistP;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistPContext ctelistP() {
			return getRuleContext(CtelistPContext.class,0);
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
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ctelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((CtelistContext)_localctx).ID = match(ID);
			setState(139);
			match(T__7);
			setState(140);
			((CtelistContext)_localctx).simpvalue = simpvalue();
			setState(141);
			match(T__1);
			setState(142);
			((CtelistContext)_localctx).ctelistP = ctelistP();
			 ((CtelistContext)_localctx).s =  "const " + (((CtelistContext)_localctx).ID!=null?((CtelistContext)_localctx).ID.getText():null) + " = " + (((CtelistContext)_localctx).simpvalue!=null?_input.getText(((CtelistContext)_localctx).simpvalue.start,((CtelistContext)_localctx).simpvalue.stop):null) + ";\n" + ((CtelistContext)_localctx).ctelistP.s; 
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
	public static class CtelistPContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public SimpvalueContext simpvalue;
		public CtelistPContext ctelistP;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistPContext ctelistP() {
			return getRuleContext(CtelistPContext.class,0);
		}
		public CtelistPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctelistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterCtelistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitCtelistP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitCtelistP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistPContext ctelistP() throws RecognitionException {
		CtelistPContext _localctx = new CtelistPContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ctelistP);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				((CtelistPContext)_localctx).ID = match(ID);
				setState(146);
				match(T__7);
				setState(147);
				((CtelistPContext)_localctx).simpvalue = simpvalue();
				setState(148);
				match(T__1);
				setState(149);
				((CtelistPContext)_localctx).ctelistP = ctelistP();
				 ((CtelistPContext)_localctx).s =  "const " + (((CtelistPContext)_localctx).ID!=null?((CtelistPContext)_localctx).ID.getText():null) + " = " + (((CtelistPContext)_localctx).simpvalue!=null?_input.getText(((CtelistPContext)_localctx).simpvalue.start,((CtelistPContext)_localctx).simpvalue.stop):null) + ";\n" + ((CtelistPContext)_localctx).ctelistP.s; 
				}
				break;
			case T__2:
			case T__4:
			case T__6:
			case T__8:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				 ((CtelistPContext)_localctx).s =  ""; 
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
	public static class SimpvalueContext extends ParserRuleContext {
		public TerminalNode CONSTLIT() { return getToken(TraductorPascalParser.CONSTLIT, 0); }
		public TerminalNode CONSTREAL() { return getToken(TraductorPascalParser.CONSTREAL, 0); }
		public TerminalNode CONSTINT() { return getToken(TraductorPascalParser.CONSTINT, 0); }
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
		enterRule(_localctx, 18, RULE_simpvalue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
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
		public String s;
		public DefvarlistContext defvarlist;
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
		enterRule(_localctx, 20, RULE_defvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__8);
			setState(158);
			((DefvarContext)_localctx).defvarlist = defvarlist();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(159);
				match(T__1);
				}
			}

			 ((DefvarContext)_localctx).s =  ((DefvarContext)_localctx).defvarlist.s; 
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
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public DefvarlistPContext defvarlistP;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistPContext defvarlistP() {
			return getRuleContext(DefvarlistPContext.class,0);
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
		DefvarlistContext _localctx = new DefvarlistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defvarlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((DefvarlistContext)_localctx).varlist = varlist();
			setState(165);
			match(T__9);
			setState(166);
			((DefvarlistContext)_localctx).tbas = tbas();
			setState(167);
			match(T__1);
			setState(168);
			((DefvarlistContext)_localctx).defvarlistP = defvarlistP();
			 ((DefvarlistContext)_localctx).s =  ((DefvarlistContext)_localctx).tbas.s + " " + ((DefvarlistContext)_localctx).varlist.s + ";\n" + ((DefvarlistContext)_localctx).defvarlistP.s; 
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
	public static class DefvarlistPContext extends ParserRuleContext {
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public DefvarlistPContext defvarlistP;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
		}
		public DefvarlistPContext defvarlistP() {
			return getRuleContext(DefvarlistPContext.class,0);
		}
		public DefvarlistPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defvarlistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterDefvarlistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitDefvarlistP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitDefvarlistP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefvarlistPContext defvarlistP() throws RecognitionException {
		DefvarlistPContext _localctx = new DefvarlistPContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defvarlistP);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((DefvarlistPContext)_localctx).varlist = varlist();
				setState(172);
				match(T__9);
				setState(173);
				((DefvarlistPContext)_localctx).tbas = tbas();
				setState(174);
				match(T__1);
				setState(175);
				((DefvarlistPContext)_localctx).defvarlistP = defvarlistP();
				 ((DefvarlistPContext)_localctx).s =  ((DefvarlistPContext)_localctx).tbas.s + " " + ((DefvarlistPContext)_localctx).varlist.s + ";\n" + ((DefvarlistPContext)_localctx).defvarlistP.s; 
				}
				break;
			case T__1:
			case T__2:
			case T__4:
			case T__6:
			case T__8:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				 ((DefvarlistPContext)_localctx).s =  ""; 
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
	public static class VarlistContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public VarlistPContext varlistP;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
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
		enterRule(_localctx, 26, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((VarlistContext)_localctx).ID = match(ID);
			setState(182);
			((VarlistContext)_localctx).varlistP = varlistP();
			 ((VarlistContext)_localctx).s =  (((VarlistContext)_localctx).ID!=null?((VarlistContext)_localctx).ID.getText():null) + ((VarlistContext)_localctx).varlistP.s; 
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
	public static class VarlistPContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public VarlistPContext varlistP;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public VarlistPContext varlistP() {
			return getRuleContext(VarlistPContext.class,0);
		}
		public VarlistPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterVarlistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitVarlistP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitVarlistP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistPContext varlistP() throws RecognitionException {
		VarlistPContext _localctx = new VarlistPContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlistP);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__10);
				setState(186);
				((VarlistPContext)_localctx).ID = match(ID);
				setState(187);
				((VarlistPContext)_localctx).varlistP = varlistP();
				 ((VarlistPContext)_localctx).s =  ", " + (((VarlistPContext)_localctx).ID!=null?((VarlistPContext)_localctx).ID.getText():null) + ((VarlistPContext)_localctx).varlistP.s; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((VarlistPContext)_localctx).s =  ""; 
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
	public static class DefprocContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public Formal_paramlistContext formal_paramlist;
		public BlqContext blq;
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
		enterRule(_localctx, 30, RULE_defproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__11);
			setState(194);
			((DefprocContext)_localctx).ID = match(ID);
			setState(195);
			((DefprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(196);
			match(T__1);
			setState(197);
			((DefprocContext)_localctx).blq = blq();
			setState(198);
			match(T__1);

			  ((DefprocContext)_localctx).s =  "void " + (((DefprocContext)_localctx).ID!=null?((DefprocContext)_localctx).ID.getText():null) + ((DefprocContext)_localctx).formal_paramlist.s + " {\n" + ((DefprocContext)_localctx).blq.s + "}\n";

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
		public String s;
		public Token ID;
		public Formal_paramlistContext formal_paramlist;
		public TbasContext tbas;
		public BlqContext blq;
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
		enterRule(_localctx, 32, RULE_deffun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__12);
			setState(202);
			((DeffunContext)_localctx).ID = match(ID);
			setState(203);
			((DeffunContext)_localctx).formal_paramlist = formal_paramlist();
			setState(204);
			match(T__9);
			setState(205);
			((DeffunContext)_localctx).tbas = tbas();
			setState(206);
			match(T__1);
			setState(207);
			((DeffunContext)_localctx).blq = blq();
			setState(208);
			match(T__1);

			  ((DeffunContext)_localctx).s =  ((DeffunContext)_localctx).tbas.s + " " + (((DeffunContext)_localctx).ID!=null?((DeffunContext)_localctx).ID.getText():null) + ((DeffunContext)_localctx).formal_paramlist.s + " {\n" + ((DeffunContext)_localctx).blq.s + "}\n";

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
		public String s;
		public Formal_paramContext formal_param;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param_tailContext formal_param_tail() {
			return getRuleContext(Formal_param_tailContext.class,0);
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
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(T__13);
				setState(212);
				((Formal_paramlistContext)_localctx).formal_param = formal_param();
				setState(213);
				formal_param_tail();
				setState(214);
				match(T__14);
				 ((Formal_paramlistContext)_localctx).s =  "(" + ((Formal_paramlistContext)_localctx).formal_param.s + ")"; 
				}
				break;
			case T__1:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_paramlistContext)_localctx).s =  "()"; 
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
	public static class Formal_param_tailContext extends ParserRuleContext {
		public String s;
		public Formal_paramContext formal_param;
		public Formal_param_tailContext formal_param_tail;
		public Formal_paramContext formal_param() {
			return getRuleContext(Formal_paramContext.class,0);
		}
		public Formal_param_tailContext formal_param_tail() {
			return getRuleContext(Formal_param_tailContext.class,0);
		}
		public Formal_param_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_param_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFormal_param_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFormal_param_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFormal_param_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_param_tailContext formal_param_tail() throws RecognitionException {
		Formal_param_tailContext _localctx = new Formal_param_tailContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_formal_param_tail);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(T__1);
				setState(221);
				((Formal_param_tailContext)_localctx).formal_param = formal_param();
				setState(222);
				((Formal_param_tailContext)_localctx).formal_param_tail = formal_param_tail();
				 ((Formal_param_tailContext)_localctx).s =  ", " + ((Formal_param_tailContext)_localctx).formal_param.s + ((Formal_param_tailContext)_localctx).formal_param_tail.s; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				 ((Formal_param_tailContext)_localctx).s =  ""; 
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
		public String s;
		public VarlistContext varlist;
		public TbasContext tbas;
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TbasContext tbas() {
			return getRuleContext(TbasContext.class,0);
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
		enterRule(_localctx, 38, RULE_formal_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			((Formal_paramContext)_localctx).varlist = varlist();
			setState(229);
			match(T__9);
			setState(230);
			((Formal_paramContext)_localctx).tbas = tbas();
			 ((Formal_paramContext)_localctx).s =  ((Formal_paramContext)_localctx).tbas.s + " " + ((Formal_paramContext)_localctx).varlist.s; 
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
		public String s;
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
		enterRule(_localctx, 40, RULE_tbas);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(T__15);
				 ((TbasContext)_localctx).s =  "int"; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(T__16);
				 ((TbasContext)_localctx).s =  "float"; 
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
	public static class SentlistContext extends ParserRuleContext {
		public String s;
		public SentContext sent;
		public SentlistPContext sentlistP;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPContext sentlistP() {
			return getRuleContext(SentlistPContext.class,0);
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
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			((SentlistContext)_localctx).sent = sent();
			setState(240);
			((SentlistContext)_localctx).sentlistP = sentlistP();
			 ((SentlistContext)_localctx).s =  ((SentlistContext)_localctx).sent.s + ((SentlistContext)_localctx).sentlistP.s; 
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
	public static class SentlistPContext extends ParserRuleContext {
		public String s;
		public SentContext sent;
		public SentlistPContext sentlistP;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistPContext sentlistP() {
			return getRuleContext(SentlistPContext.class,0);
		}
		public SentlistPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentlistP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterSentlistP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitSentlistP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitSentlistP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistPContext sentlistP() throws RecognitionException {
		SentlistPContext _localctx = new SentlistPContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sentlistP);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__20:
			case T__22:
			case T__24:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				((SentlistPContext)_localctx).sent = sent();
				setState(244);
				((SentlistPContext)_localctx).sentlistP = sentlistP();
				 ((SentlistPContext)_localctx).s =  ((SentlistPContext)_localctx).sent.s + ((SentlistPContext)_localctx).sentlistP.s; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((SentlistPContext)_localctx).s =  ""; 
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
	public static class SentContext extends ParserRuleContext {
		public String s;
		public AsigContext asig;
		public Proc_callContext proc_call;
		public If_stmtContext if_stmt;
		public While_stmtContext while_stmt;
		public Repeat_stmtContext repeat_stmt;
		public For_stmtContext for_stmt;
		public AsigContext asig() {
			return getRuleContext(AsigContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Repeat_stmtContext repeat_stmt() {
			return getRuleContext(Repeat_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
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
		enterRule(_localctx, 46, RULE_sent);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				((SentContext)_localctx).asig = asig();
				setState(251);
				match(T__1);
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).asig.s + ";\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				((SentContext)_localctx).proc_call = proc_call();
				setState(255);
				match(T__1);
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).proc_call.s + ";\n"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				((SentContext)_localctx).if_stmt = if_stmt();
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).if_stmt.s; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				((SentContext)_localctx).while_stmt = while_stmt();
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).while_stmt.s; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				((SentContext)_localctx).repeat_stmt = repeat_stmt();
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).repeat_stmt.s; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				((SentContext)_localctx).for_stmt = for_stmt();
				 ((SentContext)_localctx).s =  ((SentContext)_localctx).for_stmt.s; 
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
	public static class Blq_or_sentContext extends ParserRuleContext {
		public String s;
		public BlqContext blq;
		public SentContext sent;
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Blq_or_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blq_or_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterBlq_or_sent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitBlq_or_sent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitBlq_or_sent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Blq_or_sentContext blq_or_sent() throws RecognitionException {
		Blq_or_sentContext _localctx = new Blq_or_sentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_blq_or_sent);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__6:
			case T__8:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				((Blq_or_sentContext)_localctx).blq = blq();
				 ((Blq_or_sentContext)_localctx).s =  ((Blq_or_sentContext)_localctx).blq.s; 
				}
				break;
			case T__17:
			case T__20:
			case T__22:
			case T__24:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				((Blq_or_sentContext)_localctx).sent = sent();
				 ((Blq_or_sentContext)_localctx).s =  ((Blq_or_sentContext)_localctx).sent.s; 
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
	public static class If_stmtContext extends ParserRuleContext {
		public String s;
		public ExpcondContext condicion;
		public Blq_or_sentContext cuerpo;
		public Blq_or_sentContext cuerpo_else;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public List<Blq_or_sentContext> blq_or_sent() {
			return getRuleContexts(Blq_or_sentContext.class);
		}
		public Blq_or_sentContext blq_or_sent(int i) {
			return getRuleContext(Blq_or_sentContext.class,i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitIf_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__17);
			setState(281);
			((If_stmtContext)_localctx).condicion = expcond();
			setState(282);
			match(T__18);
			setState(283);
			((If_stmtContext)_localctx).cuerpo = blq_or_sent();
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(284);
				match(T__19);
				setState(285);
				((If_stmtContext)_localctx).cuerpo_else = blq_or_sent();
				}
				break;
			}

			        if (((If_stmtContext)_localctx).cuerpo_else.s != null) {
			            ((If_stmtContext)_localctx).s =  "if (" + ((If_stmtContext)_localctx).condicion.s + ") {\n" +
			                 ((If_stmtContext)_localctx).cuerpo.s +
			                 "} else {\n" +
			                 ((If_stmtContext)_localctx).cuerpo_else.s +
			                 "}\n";
			        } else {
			            ((If_stmtContext)_localctx).s =  "if (" + ((If_stmtContext)_localctx).condicion.s + ") {\n" +
			                 ((If_stmtContext)_localctx).cuerpo.s +
			                 "}\n";
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
	public static class While_stmtContext extends ParserRuleContext {
		public String s;
		public ExpcondContext condicion;
		public Blq_or_sentContext cuerpo;
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Blq_or_sentContext blq_or_sent() {
			return getRuleContext(Blq_or_sentContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterWhile_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitWhile_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__20);
			setState(291);
			((While_stmtContext)_localctx).condicion = expcond();
			setState(292);
			match(T__21);
			setState(293);
			((While_stmtContext)_localctx).cuerpo = blq_or_sent();

			        ((While_stmtContext)_localctx).s =  "while (" + ((While_stmtContext)_localctx).condicion.s + ") {\n" +
			             ((While_stmtContext)_localctx).cuerpo.s +
			             "}\n";
			    
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
	public static class Repeat_stmtContext extends ParserRuleContext {
		public String s;
		public BlqContext bloque;
		public ExpcondContext condicion;
		public BlqContext blq() {
			return getRuleContext(BlqContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Repeat_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterRepeat_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitRepeat_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitRepeat_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_stmtContext repeat_stmt() throws RecognitionException {
		Repeat_stmtContext _localctx = new Repeat_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_repeat_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__22);
			setState(297);
			((Repeat_stmtContext)_localctx).bloque = blq();
			setState(298);
			match(T__23);
			setState(299);
			((Repeat_stmtContext)_localctx).condicion = expcond();
			setState(300);
			match(T__1);

			        ((Repeat_stmtContext)_localctx).s =  "do {\n" +
			             ((Repeat_stmtContext)_localctx).bloque.s +
			             "} while (!(" + ((Repeat_stmtContext)_localctx).condicion.s + "));\n";
			    
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
	public static class For_stmtContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ExpContext inicio;
		public IncContext inc;
		public ExpContext fin;
		public Blq_or_sentContext cuerpo;
		public TerminalNode ID() { return getToken(TraductorPascalParser.ID, 0); }
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Blq_or_sentContext blq_or_sent() {
			return getRuleContext(Blq_or_sentContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFor_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFor_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_for_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__24);
			setState(304);
			((For_stmtContext)_localctx).ID = match(ID);
			setState(305);
			match(T__25);
			setState(306);
			((For_stmtContext)_localctx).inicio = exp();
			setState(307);
			((For_stmtContext)_localctx).inc = inc();
			setState(308);
			((For_stmtContext)_localctx).fin = exp();
			setState(309);
			match(T__21);
			setState(310);
			((For_stmtContext)_localctx).cuerpo = blq_or_sent();

			        if ((((For_stmtContext)_localctx).inc!=null?_input.getText(((For_stmtContext)_localctx).inc.start,((For_stmtContext)_localctx).inc.stop):null).equals("to")) {
			            ((For_stmtContext)_localctx).s =  "for (" + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + " = " + ((For_stmtContext)_localctx).inicio.s + "; " + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + " <= " + ((For_stmtContext)_localctx).fin.s + "; " + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + "++) {\n" +
			                 ((For_stmtContext)_localctx).cuerpo.s +
			                 "}\n";
			        } else { // downto
			            ((For_stmtContext)_localctx).s =  "for (" + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + " = " + ((For_stmtContext)_localctx).inicio.s + "; " + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + " >= " + ((For_stmtContext)_localctx).fin.s + "; " + (((For_stmtContext)_localctx).ID!=null?((For_stmtContext)_localctx).ID.getText():null) + "--) {\n" +
			                 ((For_stmtContext)_localctx).cuerpo.s +
			                 "}\n";
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
	public static class IncContext extends ParserRuleContext {
		public String s;
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_inc);
		try {
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__26);
				 ((IncContext)_localctx).s =  "to"; 
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(T__27);
				 ((IncContext)_localctx).s =  "downto"; 
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
	public static class ExpcondContext extends ParserRuleContext {
		public String s;
		public FactorcondContext e1;
		public OplogContext oplog;
		public ExpcondContext e2;
		public FactorcondContext factorcond;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expcond);
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((ExpcondContext)_localctx).e1 = factorcond();
				setState(320);
				((ExpcondContext)_localctx).oplog = oplog();
				setState(321);
				((ExpcondContext)_localctx).e2 = expcond();

				        ((ExpcondContext)_localctx).s =  ((ExpcondContext)_localctx).e1.s + " " + ((ExpcondContext)_localctx).oplog.s + " " + ((ExpcondContext)_localctx).e2.s;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((ExpcondContext)_localctx).factorcond = factorcond();

				        ((ExpcondContext)_localctx).s =  ((ExpcondContext)_localctx).factorcond.s;
				    
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
	public static class OplogContext extends ParserRuleContext {
		public String s;
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_oplog);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				match(T__28);
				 ((OplogContext)_localctx).s =  "||"; 
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(T__29);
				 ((OplogContext)_localctx).s =  "&&"; 
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
	public static class FactorcondContext extends ParserRuleContext {
		public String s;
		public ExpContext e1;
		public OpcompContext opcomp;
		public ExpContext e2;
		public ExpcondContext ec;
		public FactorcondContext fc;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factorcond);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((FactorcondContext)_localctx).e1 = exp();
				setState(336);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(337);
				((FactorcondContext)_localctx).e2 = exp();

				        ((FactorcondContext)_localctx).s =  ((FactorcondContext)_localctx).e1.s + " " + ((FactorcondContext)_localctx).opcomp.s + " " + ((FactorcondContext)_localctx).e2.s;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				match(T__13);
				setState(341);
				((FactorcondContext)_localctx).ec = expcond();
				setState(342);
				match(T__14);

				        ((FactorcondContext)_localctx).s =  "(" + ((FactorcondContext)_localctx).ec.s + ")";
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(T__30);
				setState(346);
				((FactorcondContext)_localctx).fc = factorcond();

				        ((FactorcondContext)_localctx).s =  "!(" + ((FactorcondContext)_localctx).fc.s + ")";
				    
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
	public static class OpcompContext extends ParserRuleContext {
		public String s;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_opcomp);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__31);
				 ((OpcompContext)_localctx).s =  "<"; 
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(T__32);
				 ((OpcompContext)_localctx).s =  ">"; 
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(T__33);
				 ((OpcompContext)_localctx).s =  "<="; 
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 4);
				{
				setState(357);
				match(T__34);
				 ((OpcompContext)_localctx).s =  ">="; 
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(T__7);
				 ((OpcompContext)_localctx).s =  "=="; 
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
	public static class AsigContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public ExpContext exp;
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
		enterRule(_localctx, 68, RULE_asig);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			((AsigContext)_localctx).ID = match(ID);
			setState(364);
			match(T__25);
			setState(365);
			((AsigContext)_localctx).exp = exp();
			 ((AsigContext)_localctx).s =  (((AsigContext)_localctx).ID!=null?((AsigContext)_localctx).ID.getText():null) + " = " + ((AsigContext)_localctx).exp.s; 
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
		public String s;
		public FactorContext factor;
		public Exp_tailContext exp_tail;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_tailContext exp_tail() {
			return getRuleContext(Exp_tailContext.class,0);
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
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((ExpContext)_localctx).factor = factor();
			setState(369);
			((ExpContext)_localctx).exp_tail = exp_tail();
			 ((ExpContext)_localctx).s =  ((ExpContext)_localctx).factor.s + ((ExpContext)_localctx).exp_tail.s; 
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
	public static class Exp_tailContext extends ParserRuleContext {
		public String s;
		public OpContext op;
		public FactorContext factor;
		public Exp_tailContext exp_tail;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_tailContext exp_tail() {
			return getRuleContext(Exp_tailContext.class,0);
		}
		public Exp_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterExp_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitExp_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitExp_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_tailContext exp_tail() throws RecognitionException {
		Exp_tailContext _localctx = new Exp_tailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_exp_tail);
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((Exp_tailContext)_localctx).op = op();
				setState(373);
				((Exp_tailContext)_localctx).factor = factor();
				setState(374);
				((Exp_tailContext)_localctx).exp_tail = exp_tail();
				 ((Exp_tailContext)_localctx).s =  " " + ((Exp_tailContext)_localctx).op.s + " " + ((Exp_tailContext)_localctx).factor.s + ((Exp_tailContext)_localctx).exp_tail.s; 
				}
				break;
			case T__1:
			case T__7:
			case T__10:
			case T__14:
			case T__18:
			case T__21:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				 ((Exp_tailContext)_localctx).s =  ""; 
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
	public static class OpContext extends ParserRuleContext {
		public String s;
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
		enterRule(_localctx, 74, RULE_op);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(T__35);
				 ((OpContext)_localctx).s =  "+"; 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(T__36);
				 ((OpContext)_localctx).s =  "-"; 
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(T__37);
				 ((OpContext)_localctx).s =  "*"; 
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(T__38);
				 ((OpContext)_localctx).s =  "/"; 
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				match(T__39);
				 ((OpContext)_localctx).s =  "%"; 
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
	public static class FactorContext extends ParserRuleContext {
		public String s;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token ID;
		public SubparamlistContext subparamlist;
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
		enterRule(_localctx, 76, RULE_factor);
		try {
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTINT:
			case CONSTREAL:
			case CONSTLIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				((FactorContext)_localctx).simpvalue = simpvalue();
				 ((FactorContext)_localctx).s =  (((FactorContext)_localctx).simpvalue!=null?_input.getText(((FactorContext)_localctx).simpvalue.start,((FactorContext)_localctx).simpvalue.stop):null); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(T__13);
				setState(396);
				((FactorContext)_localctx).exp = exp();
				setState(397);
				match(T__14);
				 ((FactorContext)_localctx).s =  "(" + ((FactorContext)_localctx).exp.s + ")"; 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				((FactorContext)_localctx).ID = match(ID);
				setState(401);
				((FactorContext)_localctx).subparamlist = subparamlist();
				 ((FactorContext)_localctx).s =  (((FactorContext)_localctx).ID!=null?((FactorContext)_localctx).ID.getText():null) + ((FactorContext)_localctx).subparamlist.s; 
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
		public String s;
		public ExplistContext explist;
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
		enterRule(_localctx, 78, RULE_subparamlist);
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__13);
				setState(407);
				((SubparamlistContext)_localctx).explist = explist();
				setState(408);
				match(T__14);
				 ((SubparamlistContext)_localctx).s =  "(" + ((SubparamlistContext)_localctx).explist.s + ")"; 
				}
				break;
			case T__1:
			case T__7:
			case T__10:
			case T__14:
			case T__18:
			case T__21:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				 ((SubparamlistContext)_localctx).s =  ""; 
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
	public static class ExplistContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public Explist_tailContext explist_tail;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_tailContext explist_tail() {
			return getRuleContext(Explist_tailContext.class,0);
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
		enterRule(_localctx, 80, RULE_explist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			((ExplistContext)_localctx).exp = exp();
			setState(415);
			((ExplistContext)_localctx).explist_tail = explist_tail();
			 ((ExplistContext)_localctx).s =  ((ExplistContext)_localctx).exp.s + ((ExplistContext)_localctx).explist_tail.s; 
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
	public static class Explist_tailContext extends ParserRuleContext {
		public String s;
		public ExpContext exp;
		public Explist_tailContext explist_tail;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_tailContext explist_tail() {
			return getRuleContext(Explist_tailContext.class,0);
		}
		public Explist_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).enterExplist_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TraductorPascalListener ) ((TraductorPascalListener)listener).exitExplist_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TraductorPascalVisitor ) return ((TraductorPascalVisitor<? extends T>)visitor).visitExplist_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explist_tailContext explist_tail() throws RecognitionException {
		Explist_tailContext _localctx = new Explist_tailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_explist_tail);
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(T__10);
				setState(419);
				((Explist_tailContext)_localctx).exp = exp();
				setState(420);
				((Explist_tailContext)_localctx).explist_tail = explist_tail();
				 ((Explist_tailContext)_localctx).s =  ", " + ((Explist_tailContext)_localctx).exp.s + ((Explist_tailContext)_localctx).explist_tail.s; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				 ((Explist_tailContext)_localctx).s =  ""; 
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
	public static class Proc_callContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public SubparamlistContext subparamlist;
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
		enterRule(_localctx, 84, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			((Proc_callContext)_localctx).ID = match(ID);
			setState(427);
			((Proc_callContext)_localctx).subparamlist = subparamlist();
			 ((Proc_callContext)_localctx).s =  (((Proc_callContext)_localctx).ID!=null?((Proc_callContext)_localctx).ID.getText():null) + ((Proc_callContext)_localctx).subparamlist.s; 
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
		"\u0004\u0001/\u01af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0003\u0000"+
		"Y\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004r\b\u0004\n\u0004\f\u0004u\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0085\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u009a\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00a1"+
		"\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00b4\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00c0\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00db\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00e3\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ee\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00f9\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u010f\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0117\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u011f\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u013e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0148\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u014e\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u015e\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u016a\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u017b\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0187\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0195\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u019d"+
		"\b\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01a9\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0000\u0000+\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0001\u0001\u0000*,\u01a9\u0000"+
		"X\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000\u0000\u0004a\u0001"+
		"\u0000\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000"+
		"\u0000\n\u0084\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000\u0000"+
		"\u000e\u008a\u0001\u0000\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000"+
		"\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000"+
		"\u0016\u00a4\u0001\u0000\u0000\u0000\u0018\u00b3\u0001\u0000\u0000\u0000"+
		"\u001a\u00b5\u0001\u0000\u0000\u0000\u001c\u00bf\u0001\u0000\u0000\u0000"+
		"\u001e\u00c1\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\""+
		"\u00da\u0001\u0000\u0000\u0000$\u00e2\u0001\u0000\u0000\u0000&\u00e4\u0001"+
		"\u0000\u0000\u0000(\u00ed\u0001\u0000\u0000\u0000*\u00ef\u0001\u0000\u0000"+
		"\u0000,\u00f8\u0001\u0000\u0000\u0000.\u010e\u0001\u0000\u0000\u00000"+
		"\u0116\u0001\u0000\u0000\u00002\u0118\u0001\u0000\u0000\u00004\u0122\u0001"+
		"\u0000\u0000\u00006\u0128\u0001\u0000\u0000\u00008\u012f\u0001\u0000\u0000"+
		"\u0000:\u013d\u0001\u0000\u0000\u0000<\u0147\u0001\u0000\u0000\u0000>"+
		"\u014d\u0001\u0000\u0000\u0000@\u015d\u0001\u0000\u0000\u0000B\u0169\u0001"+
		"\u0000\u0000\u0000D\u016b\u0001\u0000\u0000\u0000F\u0170\u0001\u0000\u0000"+
		"\u0000H\u017a\u0001\u0000\u0000\u0000J\u0186\u0001\u0000\u0000\u0000L"+
		"\u0194\u0001\u0000\u0000\u0000N\u019c\u0001\u0000\u0000\u0000P\u019e\u0001"+
		"\u0000\u0000\u0000R\u01a8\u0001\u0000\u0000\u0000T\u01aa\u0001\u0000\u0000"+
		"\u0000VY\u0003\u0002\u0001\u0000WY\u0003\u0004\u0002\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u0001\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0001\u0000\u0000[\\\u0005)\u0000\u0000\\]\u0005\u0002\u0000"+
		"\u0000]^\u0003\u0006\u0003\u0000^_\u0005\u0003\u0000\u0000_`\u0006\u0001"+
		"\uffff\uffff\u0000`\u0003\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000"+
		"\u0000bc\u0005)\u0000\u0000cd\u0005\u0002\u0000\u0000de\u0003\b\u0004"+
		"\u0000ef\u0005\u0003\u0000\u0000fg\u0006\u0002\uffff\uffff\u0000g\u0005"+
		"\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u0005\u0000\u0000"+
		"jk\u0003*\u0015\u0000kl\u0005\u0006\u0000\u0000lm\u0006\u0003\uffff\uffff"+
		"\u0000m\u0007\u0001\u0000\u0000\u0000no\u0003\n\u0005\u0000op\u0006\u0004"+
		"\uffff\uffff\u0000pr\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vw\u0006\u0004"+
		"\uffff\uffff\u0000w\t\u0001\u0000\u0000\u0000xy\u0003\f\u0006\u0000yz"+
		"\u0006\u0005\uffff\uffff\u0000z\u0085\u0001\u0000\u0000\u0000{|\u0003"+
		"\u0014\n\u0000|}\u0006\u0005\uffff\uffff\u0000}\u0085\u0001\u0000\u0000"+
		"\u0000~\u007f\u0003\u001e\u000f\u0000\u007f\u0080\u0006\u0005\uffff\uffff"+
		"\u0000\u0080\u0085\u0001\u0000\u0000\u0000\u0081\u0082\u0003 \u0010\u0000"+
		"\u0082\u0083\u0006\u0005\uffff\uffff\u0000\u0083\u0085\u0001\u0000\u0000"+
		"\u0000\u0084x\u0001\u0000\u0000\u0000\u0084{\u0001\u0000\u0000\u0000\u0084"+
		"~\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u000b"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088"+
		"\u0003\u000e\u0007\u0000\u0088\u0089\u0006\u0006\uffff\uffff\u0000\u0089"+
		"\r\u0001\u0000\u0000\u0000\u008a\u008b\u0005)\u0000\u0000\u008b\u008c"+
		"\u0005\b\u0000\u0000\u008c\u008d\u0003\u0012\t\u0000\u008d\u008e\u0005"+
		"\u0002\u0000\u0000\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090\u0006\u0007"+
		"\uffff\uffff\u0000\u0090\u000f\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		")\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000\u0093\u0094\u0003\u0012"+
		"\t\u0000\u0094\u0095\u0005\u0002\u0000\u0000\u0095\u0096\u0003\u0010\b"+
		"\u0000\u0096\u0097\u0006\b\uffff\uffff\u0000\u0097\u009a\u0001\u0000\u0000"+
		"\u0000\u0098\u009a\u0006\b\uffff\uffff\u0000\u0099\u0091\u0001\u0000\u0000"+
		"\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0011\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0007\u0000\u0000\u0000\u009c\u0013\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\t\u0000\u0000\u009e\u00a0\u0003\u0016\u000b\u0000"+
		"\u009f\u00a1\u0005\u0002\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0006\n\uffff\uffff\u0000\u00a3\u0015\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0003\u001a\r\u0000\u00a5\u00a6\u0005\n\u0000\u0000\u00a6"+
		"\u00a7\u0003(\u0014\u0000\u00a7\u00a8\u0005\u0002\u0000\u0000\u00a8\u00a9"+
		"\u0003\u0018\f\u0000\u00a9\u00aa\u0006\u000b\uffff\uffff\u0000\u00aa\u0017"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0003\u001a\r\u0000\u00ac\u00ad\u0005"+
		"\n\u0000\u0000\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00af\u0005\u0002"+
		"\u0000\u0000\u00af\u00b0\u0003\u0018\f\u0000\u00b0\u00b1\u0006\f\uffff"+
		"\uffff\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b4\u0006\f\uffff"+
		"\uffff\u0000\u00b3\u00ab\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u0019\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005)\u0000"+
		"\u0000\u00b6\u00b7\u0003\u001c\u000e\u0000\u00b7\u00b8\u0006\r\uffff\uffff"+
		"\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u000b\u0000"+
		"\u0000\u00ba\u00bb\u0005)\u0000\u0000\u00bb\u00bc\u0003\u001c\u000e\u0000"+
		"\u00bc\u00bd\u0006\u000e\uffff\uffff\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00c0\u0006\u000e\uffff\uffff\u0000\u00bf\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u001d\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0005\f\u0000\u0000\u00c2\u00c3\u0005)\u0000"+
		"\u0000\u00c3\u00c4\u0003\"\u0011\u0000\u00c4\u00c5\u0005\u0002\u0000\u0000"+
		"\u00c5\u00c6\u0003\u0006\u0003\u0000\u00c6\u00c7\u0005\u0002\u0000\u0000"+
		"\u00c7\u00c8\u0006\u000f\uffff\uffff\u0000\u00c8\u001f\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005\r\u0000\u0000\u00ca\u00cb\u0005)\u0000\u0000"+
		"\u00cb\u00cc\u0003\"\u0011\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd"+
		"\u00ce\u0003(\u0014\u0000\u00ce\u00cf\u0005\u0002\u0000\u0000\u00cf\u00d0"+
		"\u0003\u0006\u0003\u0000\u00d0\u00d1\u0005\u0002\u0000\u0000\u00d1\u00d2"+
		"\u0006\u0010\uffff\uffff\u0000\u00d2!\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0005\u000e\u0000\u0000\u00d4\u00d5\u0003&\u0013\u0000\u00d5\u00d6\u0003"+
		"$\u0012\u0000\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7\u00d8\u0006\u0011"+
		"\uffff\uffff\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00db\u0006"+
		"\u0011\uffff\uffff\u0000\u00da\u00d3\u0001\u0000\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db#\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"\u0002\u0000\u0000\u00dd\u00de\u0003&\u0013\u0000\u00de\u00df\u0003$\u0012"+
		"\u0000\u00df\u00e0\u0006\u0012\uffff\uffff\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0006\u0012\uffff\uffff\u0000\u00e2\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3%\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000\u00e5\u00e6\u0005\n\u0000"+
		"\u0000\u00e6\u00e7\u0003(\u0014\u0000\u00e7\u00e8\u0006\u0013\uffff\uffff"+
		"\u0000\u00e8\'\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005\u0010\u0000\u0000"+
		"\u00ea\u00ee\u0006\u0014\uffff\uffff\u0000\u00eb\u00ec\u0005\u0011\u0000"+
		"\u0000\u00ec\u00ee\u0006\u0014\uffff\uffff\u0000\u00ed\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee)\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0003.\u0017\u0000\u00f0\u00f1\u0003,\u0016\u0000\u00f1"+
		"\u00f2\u0006\u0015\uffff\uffff\u0000\u00f2+\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0003.\u0017\u0000\u00f4\u00f5\u0003,\u0016\u0000\u00f5\u00f6\u0006"+
		"\u0016\uffff\uffff\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0006\u0016\uffff\uffff\u0000\u00f8\u00f3\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9-\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0003D\"\u0000\u00fb\u00fc\u0005\u0002\u0000\u0000\u00fc\u00fd\u0006"+
		"\u0017\uffff\uffff\u0000\u00fd\u010f\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0003T*\u0000\u00ff\u0100\u0005\u0002\u0000\u0000\u0100\u0101\u0006\u0017"+
		"\uffff\uffff\u0000\u0101\u010f\u0001\u0000\u0000\u0000\u0102\u0103\u0003"+
		"2\u0019\u0000\u0103\u0104\u0006\u0017\uffff\uffff\u0000\u0104\u010f\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u00034\u001a\u0000\u0106\u0107\u0006\u0017"+
		"\uffff\uffff\u0000\u0107\u010f\u0001\u0000\u0000\u0000\u0108\u0109\u0003"+
		"6\u001b\u0000\u0109\u010a\u0006\u0017\uffff\uffff\u0000\u010a\u010f\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u00038\u001c\u0000\u010c\u010d\u0006\u0017"+
		"\uffff\uffff\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u00fa\u0001"+
		"\u0000\u0000\u0000\u010e\u00fe\u0001\u0000\u0000\u0000\u010e\u0102\u0001"+
		"\u0000\u0000\u0000\u010e\u0105\u0001\u0000\u0000\u0000\u010e\u0108\u0001"+
		"\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010f/\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0003\u0006\u0003\u0000\u0111\u0112\u0006\u0018"+
		"\uffff\uffff\u0000\u0112\u0117\u0001\u0000\u0000\u0000\u0113\u0114\u0003"+
		".\u0017\u0000\u0114\u0115\u0006\u0018\uffff\uffff\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u0110\u0001\u0000\u0000\u0000\u0116\u0113\u0001"+
		"\u0000\u0000\u0000\u01171\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0012"+
		"\u0000\u0000\u0119\u011a\u0003<\u001e\u0000\u011a\u011b\u0005\u0013\u0000"+
		"\u0000\u011b\u011e\u00030\u0018\u0000\u011c\u011d\u0005\u0014\u0000\u0000"+
		"\u011d\u011f\u00030\u0018\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0121\u0006\u0019\uffff\uffff\u0000\u01213\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\u0015\u0000\u0000\u0123\u0124\u0003<\u001e\u0000\u0124\u0125"+
		"\u0005\u0016\u0000\u0000\u0125\u0126\u00030\u0018\u0000\u0126\u0127\u0006"+
		"\u001a\uffff\uffff\u0000\u01275\u0001\u0000\u0000\u0000\u0128\u0129\u0005"+
		"\u0017\u0000\u0000\u0129\u012a\u0003\u0006\u0003\u0000\u012a\u012b\u0005"+
		"\u0018\u0000\u0000\u012b\u012c\u0003<\u001e\u0000\u012c\u012d\u0005\u0002"+
		"\u0000\u0000\u012d\u012e\u0006\u001b\uffff\uffff\u0000\u012e7\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0005\u0019\u0000\u0000\u0130\u0131\u0005)\u0000"+
		"\u0000\u0131\u0132\u0005\u001a\u0000\u0000\u0132\u0133\u0003F#\u0000\u0133"+
		"\u0134\u0003:\u001d\u0000\u0134\u0135\u0003F#\u0000\u0135\u0136\u0005"+
		"\u0016\u0000\u0000\u0136\u0137\u00030\u0018\u0000\u0137\u0138\u0006\u001c"+
		"\uffff\uffff\u0000\u01389\u0001\u0000\u0000\u0000\u0139\u013a\u0005\u001b"+
		"\u0000\u0000\u013a\u013e\u0006\u001d\uffff\uffff\u0000\u013b\u013c\u0005"+
		"\u001c\u0000\u0000\u013c\u013e\u0006\u001d\uffff\uffff\u0000\u013d\u0139"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013e;\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0003@ \u0000\u0140\u0141\u0003>\u001f"+
		"\u0000\u0141\u0142\u0003<\u001e\u0000\u0142\u0143\u0006\u001e\uffff\uffff"+
		"\u0000\u0143\u0148\u0001\u0000\u0000\u0000\u0144\u0145\u0003@ \u0000\u0145"+
		"\u0146\u0006\u001e\uffff\uffff\u0000\u0146\u0148\u0001\u0000\u0000\u0000"+
		"\u0147\u013f\u0001\u0000\u0000\u0000\u0147\u0144\u0001\u0000\u0000\u0000"+
		"\u0148=\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u001d\u0000\u0000\u014a"+
		"\u014e\u0006\u001f\uffff\uffff\u0000\u014b\u014c\u0005\u001e\u0000\u0000"+
		"\u014c\u014e\u0006\u001f\uffff\uffff\u0000\u014d\u0149\u0001\u0000\u0000"+
		"\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e?\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0003F#\u0000\u0150\u0151\u0003B!\u0000\u0151\u0152\u0003"+
		"F#\u0000\u0152\u0153\u0006 \uffff\uffff\u0000\u0153\u015e\u0001\u0000"+
		"\u0000\u0000\u0154\u0155\u0005\u000e\u0000\u0000\u0155\u0156\u0003<\u001e"+
		"\u0000\u0156\u0157\u0005\u000f\u0000\u0000\u0157\u0158\u0006 \uffff\uffff"+
		"\u0000\u0158\u015e\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u001f\u0000"+
		"\u0000\u015a\u015b\u0003@ \u0000\u015b\u015c\u0006 \uffff\uffff\u0000"+
		"\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u014f\u0001\u0000\u0000\u0000"+
		"\u015d\u0154\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000"+
		"\u015eA\u0001\u0000\u0000\u0000\u015f\u0160\u0005 \u0000\u0000\u0160\u016a"+
		"\u0006!\uffff\uffff\u0000\u0161\u0162\u0005!\u0000\u0000\u0162\u016a\u0006"+
		"!\uffff\uffff\u0000\u0163\u0164\u0005\"\u0000\u0000\u0164\u016a\u0006"+
		"!\uffff\uffff\u0000\u0165\u0166\u0005#\u0000\u0000\u0166\u016a\u0006!"+
		"\uffff\uffff\u0000\u0167\u0168\u0005\b\u0000\u0000\u0168\u016a\u0006!"+
		"\uffff\uffff\u0000\u0169\u015f\u0001\u0000\u0000\u0000\u0169\u0161\u0001"+
		"\u0000\u0000\u0000\u0169\u0163\u0001\u0000\u0000\u0000\u0169\u0165\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016aC\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0005)\u0000\u0000\u016c\u016d\u0005\u001a\u0000"+
		"\u0000\u016d\u016e\u0003F#\u0000\u016e\u016f\u0006\"\uffff\uffff\u0000"+
		"\u016fE\u0001\u0000\u0000\u0000\u0170\u0171\u0003L&\u0000\u0171\u0172"+
		"\u0003H$\u0000\u0172\u0173\u0006#\uffff\uffff\u0000\u0173G\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0003J%\u0000\u0175\u0176\u0003L&\u0000\u0176"+
		"\u0177\u0003H$\u0000\u0177\u0178\u0006$\uffff\uffff\u0000\u0178\u017b"+
		"\u0001\u0000\u0000\u0000\u0179\u017b\u0006$\uffff\uffff\u0000\u017a\u0174"+
		"\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017bI\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0005$\u0000\u0000\u017d\u0187\u0006%\uffff"+
		"\uffff\u0000\u017e\u017f\u0005%\u0000\u0000\u017f\u0187\u0006%\uffff\uffff"+
		"\u0000\u0180\u0181\u0005&\u0000\u0000\u0181\u0187\u0006%\uffff\uffff\u0000"+
		"\u0182\u0183\u0005\'\u0000\u0000\u0183\u0187\u0006%\uffff\uffff\u0000"+
		"\u0184\u0185\u0005(\u0000\u0000\u0185\u0187\u0006%\uffff\uffff\u0000\u0186"+
		"\u017c\u0001\u0000\u0000\u0000\u0186\u017e\u0001\u0000\u0000\u0000\u0186"+
		"\u0180\u0001\u0000\u0000\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0186"+
		"\u0184\u0001\u0000\u0000\u0000\u0187K\u0001\u0000\u0000\u0000\u0188\u0189"+
		"\u0003\u0012\t\u0000\u0189\u018a\u0006&\uffff\uffff\u0000\u018a\u0195"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u000e\u0000\u0000\u018c\u018d"+
		"\u0003F#\u0000\u018d\u018e\u0005\u000f\u0000\u0000\u018e\u018f\u0006&"+
		"\uffff\uffff\u0000\u018f\u0195\u0001\u0000\u0000\u0000\u0190\u0191\u0005"+
		")\u0000\u0000\u0191\u0192\u0003N\'\u0000\u0192\u0193\u0006&\uffff\uffff"+
		"\u0000\u0193\u0195\u0001\u0000\u0000\u0000\u0194\u0188\u0001\u0000\u0000"+
		"\u0000\u0194\u018b\u0001\u0000\u0000\u0000\u0194\u0190\u0001\u0000\u0000"+
		"\u0000\u0195M\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u000e\u0000\u0000"+
		"\u0197\u0198\u0003P(\u0000\u0198\u0199\u0005\u000f\u0000\u0000\u0199\u019a"+
		"\u0006\'\uffff\uffff\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b\u019d"+
		"\u0006\'\uffff\uffff\u0000\u019c\u0196\u0001\u0000\u0000\u0000\u019c\u019b"+
		"\u0001\u0000\u0000\u0000\u019dO\u0001\u0000\u0000\u0000\u019e\u019f\u0003"+
		"F#\u0000\u019f\u01a0\u0003R)\u0000\u01a0\u01a1\u0006(\uffff\uffff\u0000"+
		"\u01a1Q\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u000b\u0000\u0000\u01a3"+
		"\u01a4\u0003F#\u0000\u01a4\u01a5\u0003R)\u0000\u01a5\u01a6\u0006)\uffff"+
		"\uffff\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a9\u0006)\uffff"+
		"\uffff\u0000\u01a8\u01a2\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a9S\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005)\u0000\u0000"+
		"\u01ab\u01ac\u0003N\'\u0000\u01ac\u01ad\u0006*\uffff\uffff\u0000\u01ad"+
		"U\u0001\u0000\u0000\u0000\u0018Xs\u0084\u0099\u00a0\u00b3\u00bf\u00da"+
		"\u00e2\u00ed\u00f8\u010e\u0116\u011e\u013d\u0147\u014d\u015d\u0169\u017a"+
		"\u0186\u0194\u019c\u01a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}