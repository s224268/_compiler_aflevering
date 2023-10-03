// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OUTPUTS=8, INPUTS=9, 
		HW=10, LATCHES=11, UPDATE=12, SIMULATE=13, BINARY=14, IDENTIFIER=15, COMMENT=16, 
		MULTICOMMENT=17, WS=18;
	public static final int
		RULE_start = 0, RULE_skippable = 1, RULE_prog = 2, RULE_inputs = 3, RULE_outputs = 4, 
		RULE_output = 5, RULE_latches = 6, RULE_latch = 7, RULE_update = 8, RULE_simulate = 9, 
		RULE_stmn = 10, RULE_exp = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "skippable", "prog", "inputs", "outputs", "output", "latches", 
			"latch", "update", "simulate", "stmn", "exp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'='", "'!'", "'&&'", "'||'", "'('", "')'", "'.outputs'", 
			"'.inputs'", "'.hardware'", "'.latches'", "'.update'", "'.simulate'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OUTPUTS", "INPUTS", 
			"HW", "LATCHES", "UPDATE", "SIMULATE", "BINARY", "IDENTIFIER", "COMMENT", 
			"MULTICOMMENT", "WS"
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgContext p;
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((StartContext)_localctx).p = prog();
			setState(25);
			match(EOF);
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
	public static class SkippableContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(implParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(implParser.WS, i);
		}
		public List<TerminalNode> MULTICOMMENT() { return getTokens(implParser.MULTICOMMENT); }
		public TerminalNode MULTICOMMENT(int i) {
			return getToken(implParser.MULTICOMMENT, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(implParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(implParser.COMMENT, i);
		}
		public SkippableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skippable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSkippable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSkippable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSkippable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkippableContext skippable() throws RecognitionException {
		SkippableContext _localctx = new SkippableContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_skippable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 458752L) != 0) );
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
	public static class ProgContext extends ParserRuleContext {
		public Token ident;
		public InputsContext next;
		public TerminalNode HW() { return getToken(implParser.HW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(HW);
			setState(33);
			((ProgContext)_localctx).ident = match(IDENTIFIER);
			setState(34);
			((ProgContext)_localctx).next = inputs();
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
	public static class InputsContext extends ParserRuleContext {
		public Token in;
		public Token ident;
		public OutputsContext next;
		public TerminalNode INPUTS() { return getToken(implParser.INPUTS, 0); }
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			((InputsContext)_localctx).in = match(INPUTS);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				((InputsContext)_localctx).ident = match(IDENTIFIER);
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(42);
			((InputsContext)_localctx).next = outputs();
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
	public static class OutputsContext extends ParserRuleContext {
		public Token out;
		public OutputContext put;
		public LatchesContext next;
		public TerminalNode OUTPUTS() { return getToken(implParser.OUTPUTS, 0); }
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((OutputsContext)_localctx).out = match(OUTPUTS);
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				((OutputsContext)_localctx).put = output();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(50);
			((OutputsContext)_localctx).next = latches();
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
	public static class OutputContext extends ParserRuleContext {
		public Token ident;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((OutputContext)_localctx).ident = match(IDENTIFIER);
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
	public static class LatchesContext extends ParserRuleContext {
		public UpdateContext next;
		public TerminalNode LATCHES() { return getToken(implParser.LATCHES, 0); }
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatches(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatches(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_latches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LATCHES);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(55);
				latch();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			((LatchesContext)_localctx).next = update();
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
	public static class LatchContext extends ParserRuleContext {
		public Token ident1;
		public Token ident2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_latch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			((LatchContext)_localctx).ident1 = match(IDENTIFIER);
			setState(64);
			match(T__0);
			setState(65);
			((LatchContext)_localctx).ident2 = match(IDENTIFIER);
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
	public static class UpdateContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(implParser.UPDATE, 0); }
		public SimulateContext simulate() {
			return getRuleContext(SimulateContext.class,0);
		}
		public List<StmnContext> stmn() {
			return getRuleContexts(StmnContext.class);
		}
		public StmnContext stmn(int i) {
			return getRuleContext(StmnContext.class,i);
		}
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(UPDATE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(68);
				stmn();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			simulate();
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
	public static class SimulateContext extends ParserRuleContext {
		public TerminalNode SIMULATE() { return getToken(implParser.SIMULATE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public TerminalNode BINARY() { return getToken(implParser.BINARY, 0); }
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simulate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(SIMULATE);
			setState(77);
			match(IDENTIFIER);
			setState(78);
			match(T__1);
			setState(79);
			match(BINARY);
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
	public static class StmnContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStmn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStmn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStmn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmnContext stmn() throws RecognitionException {
		StmnContext _localctx = new StmnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(T__1);
			setState(83);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExpContext {
		public Token op;
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ExpContext {
		public Token i;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public IdentContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends ExpContext {
		public ExpContext e1;
		public Token op;
		public ExpContext e2;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenContext extends ExpContext {
		public ExpContext e;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParen(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				((IdentContext)_localctx).i = match(IDENTIFIER);
				}
				break;
			case T__2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				((NotContext)_localctx).op = match(T__2);
				setState(88);
				((NotContext)_localctx).e = exp(4);
				}
				break;
			case T__5:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(T__5);
				setState(90);
				((ParenContext)_localctx).e = exp(0);
				setState(91);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(101);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						((AndContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(95);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(96);
						((AndContext)_localctx).op = match(T__3);
						setState(97);
						((AndContext)_localctx).e2 = exp(4);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						((OrContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						((OrContext)_localctx).op = match(T__4);
						setState(100);
						((OrContext)_localctx).e2 = exp(3);
						}
						break;
					}
					} 
				}
				setState(105);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012k\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u001d\b\u0001\u000b"+
		"\u0001\f\u0001\u001e\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0004\u0003\'\b\u0003\u000b\u0003\f\u0003(\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0004\u0004/\b\u0004\u000b\u0004"+
		"\f\u00040\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\bF\b\b\n\b\f\bI\t\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b^\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000bf\b\u000b\n\u000b\f\u000bi\t\u000b\u0001"+
		"\u000b\u0000\u0001\u0016\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0000\u0001\u0001\u0000\u0010\u0012g\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000"+
		"\u0000\u0006$\u0001\u0000\u0000\u0000\b,\u0001\u0000\u0000\u0000\n4\u0001"+
		"\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000e?\u0001\u0000\u0000"+
		"\u0000\u0010C\u0001\u0000\u0000\u0000\u0012L\u0001\u0000\u0000\u0000\u0014"+
		"Q\u0001\u0000\u0000\u0000\u0016]\u0001\u0000\u0000\u0000\u0018\u0019\u0003"+
		"\u0004\u0002\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u0001\u0001"+
		"\u0000\u0000\u0000\u001b\u001d\u0007\u0000\u0000\u0000\u001c\u001b\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f\u0003\u0001"+
		"\u0000\u0000\u0000 !\u0005\n\u0000\u0000!\"\u0005\u000f\u0000\u0000\""+
		"#\u0003\u0006\u0003\u0000#\u0005\u0001\u0000\u0000\u0000$&\u0005\t\u0000"+
		"\u0000%\'\u0005\u000f\u0000\u0000&%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*+\u0003\b\u0004\u0000+\u0007\u0001\u0000\u0000\u0000"+
		",.\u0005\b\u0000\u0000-/\u0003\n\u0005\u0000.-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000"+
		"\u000012\u0001\u0000\u0000\u000023\u0003\f\u0006\u00003\t\u0001\u0000"+
		"\u0000\u000045\u0005\u000f\u0000\u00005\u000b\u0001\u0000\u0000\u0000"+
		"6:\u0005\u000b\u0000\u000079\u0003\u000e\u0007\u000087\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0003"+
		"\u0010\b\u0000>\r\u0001\u0000\u0000\u0000?@\u0005\u000f\u0000\u0000@A"+
		"\u0005\u0001\u0000\u0000AB\u0005\u000f\u0000\u0000B\u000f\u0001\u0000"+
		"\u0000\u0000CG\u0005\f\u0000\u0000DF\u0003\u0014\n\u0000ED\u0001\u0000"+
		"\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000"+
		"JK\u0003\u0012\t\u0000K\u0011\u0001\u0000\u0000\u0000LM\u0005\r\u0000"+
		"\u0000MN\u0005\u000f\u0000\u0000NO\u0005\u0002\u0000\u0000OP\u0005\u000e"+
		"\u0000\u0000P\u0013\u0001\u0000\u0000\u0000QR\u0005\u000f\u0000\u0000"+
		"RS\u0005\u0002\u0000\u0000ST\u0003\u0016\u000b\u0000T\u0015\u0001\u0000"+
		"\u0000\u0000UV\u0006\u000b\uffff\uffff\u0000V^\u0005\u000f\u0000\u0000"+
		"WX\u0005\u0003\u0000\u0000X^\u0003\u0016\u000b\u0004YZ\u0005\u0006\u0000"+
		"\u0000Z[\u0003\u0016\u000b\u0000[\\\u0005\u0007\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000]U\u0001\u0000\u0000\u0000]W\u0001\u0000\u0000\u0000]Y\u0001"+
		"\u0000\u0000\u0000^g\u0001\u0000\u0000\u0000_`\n\u0003\u0000\u0000`a\u0005"+
		"\u0004\u0000\u0000af\u0003\u0016\u000b\u0004bc\n\u0002\u0000\u0000cd\u0005"+
		"\u0005\u0000\u0000df\u0003\u0016\u000b\u0003e_\u0001\u0000\u0000\u0000"+
		"eb\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000h\u0017\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000\b\u001e(0:G]eg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}