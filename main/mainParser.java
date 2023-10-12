// Generated from main.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class mainParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, COMMENT=15, MULTILINE_COMMENT=16, 
		CIRCUITNAME=17, ID=18, BINARY=19, WHITESPACE=20;
	public static final int
		RULE_start = 0, RULE_hardware = 1, RULE_input = 2, RULE_output = 3, RULE_latches = 4, 
		RULE_update = 5, RULE_simulate = 6, RULE_latch = 7, RULE_assignment_stmt = 8, 
		RULE_simulate_stmt = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hardware", "input", "output", "latches", "update", "simulate", 
			"latch", "assignment_stmt", "simulate_stmt", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware '", "'.inputs'", "' '", "'.outputs'", "'.latches'", 
			"'.update'", "'.simulate'", "'->'", "'='", "'('", "')'", "'!'", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "COMMENT", "MULTILINE_COMMENT", "CIRCUITNAME", "ID", 
			"BINARY", "WHITESPACE"
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
	public String getGrammarFileName() { return "main.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mainParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends StartContext {
		public TerminalNode EOF() { return getToken(mainParser.EOF, 0); }
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public LatchesContext latches() {
			return getRuleContext(LatchesContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public SimulateContext simulate() {
			return getRuleContext(SimulateContext.class,0);
		}
		public BeginContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitBegin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			_localctx = new BeginContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(22);
			hardware();
			setState(23);
			input();
			setState(24);
			output();
			setState(25);
			latches();
			setState(26);
			update();
			setState(27);
			simulate();
			}
			setState(29);
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
	public static class HardwareContext extends ParserRuleContext {
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
	 
		public HardwareContext() { }
		public void copyFrom(HardwareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HardwareProgContext extends HardwareContext {
		public TerminalNode CIRCUITNAME() { return getToken(mainParser.CIRCUITNAME, 0); }
		public HardwareProgContext(HardwareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterHardwareProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitHardwareProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitHardwareProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hardware);
		try {
			_localctx = new HardwareProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(CIRCUITNAME);
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
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InsContext extends InputContext {
		public Token ins;
		public List<TerminalNode> ID() { return getTokens(mainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mainParser.ID, i);
		}
		public InsContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterIns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitIns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitIns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input);
		int _la;
		try {
			int _alt;
			_localctx = new InsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(T__1);
			setState(42); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(35);
						match(T__2);
						}
						} 
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(41);
				((InsContext)_localctx).ins = match(ID);
				}
				}
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
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
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutsContext extends OutputContext {
		public Token outs;
		public List<TerminalNode> ID() { return getTokens(mainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mainParser.ID, i);
		}
		public OutsContext(OutputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterOuts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitOuts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitOuts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_output);
		int _la;
		try {
			int _alt;
			_localctx = new OutsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__3);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(47);
						match(T__2);
						}
						} 
					}
					setState(52);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				setState(53);
				((OutsContext)_localctx).outs = match(ID);
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==ID );
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
		public LatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latches; }
	 
		public LatchesContext() { }
		public void copyFrom(LatchesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LatsContext extends LatchesContext {
		public List<LatchContext> latch() {
			return getRuleContexts(LatchContext.class);
		}
		public LatchContext latch(int i) {
			return getRuleContext(LatchContext.class,i);
		}
		public LatsContext(LatchesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterLats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitLats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitLats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchesContext latches() throws RecognitionException {
		LatchesContext _localctx = new LatchesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latches);
		int _la;
		try {
			int _alt;
			_localctx = new LatsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__4);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(59);
					match(T__2);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				latch();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
	 
		public UpdateContext() { }
		public void copyFrom(UpdateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UdtContext extends UpdateContext {
		public List<Assignment_stmtContext> assignment_stmt() {
			return getRuleContexts(Assignment_stmtContext.class);
		}
		public Assignment_stmtContext assignment_stmt(int i) {
			return getRuleContext(Assignment_stmtContext.class,i);
		}
		public UdtContext(UpdateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterUdt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitUdt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitUdt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update);
		int _la;
		try {
			int _alt;
			_localctx = new UdtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__5);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(71);
					match(T__2);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				assignment_stmt();
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
	 
		public SimulateContext() { }
		public void copyFrom(SimulateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpContext extends SimulateContext {
		public List<Simulate_stmtContext> simulate_stmt() {
			return getRuleContexts(Simulate_stmtContext.class);
		}
		public Simulate_stmtContext simulate_stmt(int i) {
			return getRuleContext(Simulate_stmtContext.class,i);
		}
		public SimpContext(SimulateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterSimp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitSimp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitSimp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simulate);
		int _la;
		try {
			int _alt;
			_localctx = new SimpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__6);
			setState(86);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(83);
					match(T__2);
					}
					} 
				}
				setState(88);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				simulate_stmt();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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
		public LatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latch; }
	 
		public LatchContext() { }
		public void copyFrom(LatchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LatContext extends LatchContext {
		public Token lat1;
		public Token lat2;
		public List<TerminalNode> ID() { return getTokens(mainParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mainParser.ID, i);
		}
		public LatContext(LatchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterLat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitLat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitLat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchContext latch() throws RecognitionException {
		LatchContext _localctx = new LatchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_latch);
		int _la;
		try {
			_localctx = new LatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((LatContext)_localctx).lat1 = match(ID);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(95);
				match(T__2);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__7);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(102);
				match(T__2);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
			((LatContext)_localctx).lat2 = match(ID);
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
	public static class Assignment_stmtContext extends ParserRuleContext {
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
	 
		public Assignment_stmtContext() { }
		public void copyFrom(Assignment_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsstmtContext extends Assignment_stmtContext {
		public Token var;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(mainParser.ID, 0); }
		public AsstmtContext(Assignment_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterAsstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitAsstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitAsstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment_stmt);
		int _la;
		try {
			_localctx = new AsstmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((AsstmtContext)_localctx).var = match(ID);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(111);
				match(T__2);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
			match(T__8);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(118);
				match(T__2);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			expression(0);
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
	public static class Simulate_stmtContext extends ParserRuleContext {
		public Simulate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate_stmt; }
	 
		public Simulate_stmtContext() { }
		public void copyFrom(Simulate_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SstmtContext extends Simulate_stmtContext {
		public Token var;
		public TerminalNode BINARY() { return getToken(mainParser.BINARY, 0); }
		public TerminalNode ID() { return getToken(mainParser.ID, 0); }
		public SstmtContext(Simulate_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterSstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitSstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitSstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simulate_stmtContext simulate_stmt() throws RecognitionException {
		Simulate_stmtContext _localctx = new Simulate_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simulate_stmt);
		int _la;
		try {
			_localctx = new SstmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((SstmtContext)_localctx).var = match(ID);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(133);
			match(T__8);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(134);
				match(T__2);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ExpressionContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends ExpressionContext {
		public Token var;
		public TerminalNode ID() { return getToken(mainParser.ID, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OGContext extends ExpressionContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OGContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterOG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitOG(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitOG(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExpressionContext {
		public ExpressionContext e;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegateContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EllerContext extends ExpressionContext {
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EllerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).enterEller(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mainListener ) ((mainListener)listener).exitEller(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mainVisitor ) return ((mainVisitor<? extends T>)visitor).visitEller(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				((VarContext)_localctx).var = match(ID);
				}
				break;
			case T__9:
				{
				_localctx = new ConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(T__9);
				setState(145);
				((ConditionContext)_localctx).e = expression(0);
				setState(146);
				match(T__10);
				}
				break;
			case T__11:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(T__11);
				setState(149);
				((NegateContext)_localctx).e = expression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(182);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new OGContext(new ExpressionContext(_parentctx, _parentState));
						((OGContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(156);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(153);
								match(T__2);
								}
								} 
							}
							setState(158);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						}
						setState(159);
						match(T__12);
						setState(163);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(160);
								match(T__2);
								}
								} 
							}
							setState(165);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
						}
						setState(166);
						((OGContext)_localctx).e2 = expression(3);
						}
						break;
					case 2:
						{
						_localctx = new EllerContext(new ExpressionContext(_parentctx, _parentState));
						((EllerContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(171);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(168);
								match(T__2);
								}
								} 
							}
							setState(173);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
						}
						setState(174);
						match(T__13);
						setState(178);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1+1 ) {
								{
								{
								setState(175);
								match(T__2);
								}
								} 
							}
							setState(180);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						}
						setState(181);
						((EllerContext)_localctx).e2 = expression(2);
						}
						break;
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002\u0001\u0002\u0004\u0002"+
		"+\b\u0002\u000b\u0002\f\u0002,\u0001\u0003\u0001\u0003\u0005\u00031\b"+
		"\u0003\n\u0003\f\u00034\t\u0003\u0001\u0003\u0004\u00037\b\u0003\u000b"+
		"\u0003\f\u00038\u0001\u0004\u0001\u0004\u0005\u0004=\b\u0004\n\u0004\f"+
		"\u0004@\t\u0004\u0001\u0004\u0004\u0004C\b\u0004\u000b\u0004\f\u0004D"+
		"\u0001\u0005\u0001\u0005\u0005\u0005I\b\u0005\n\u0005\f\u0005L\t\u0005"+
		"\u0001\u0005\u0004\u0005O\b\u0005\u000b\u0005\f\u0005P\u0001\u0006\u0001"+
		"\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006\u0001\u0006\u0004"+
		"\u0006[\b\u0006\u000b\u0006\f\u0006\\\u0001\u0007\u0001\u0007\u0005\u0007"+
		"a\b\u0007\n\u0007\f\u0007d\t\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"h\b\u0007\n\u0007\f\u0007k\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0005\bq\b\b\n\b\f\bt\t\b\u0001\b\u0001\b\u0005\bx\b\b\n\b\f\b{\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t\u0081\b\t\n\t\f\t\u0084\t\t\u0001"+
		"\t\u0001\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0097"+
		"\b\n\u0001\n\u0001\n\u0005\n\u009b\b\n\n\n\f\n\u009e\t\n\u0001\n\u0001"+
		"\n\u0005\n\u00a2\b\n\n\n\f\n\u00a5\t\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u00aa\b\n\n\n\f\n\u00ad\t\n\u0001\n\u0001\n\u0005\n\u00b1\b\n\n\n\f\n"+
		"\u00b4\t\n\u0001\n\u0005\n\u00b7\b\n\n\n\f\n\u00ba\t\n\u0001\n\t&2>JV"+
		"\u009c\u00a3\u00ab\u00b2\u0001\u0014\u000b\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0000\u0000\u00c8\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004\"\u0001\u0000\u0000\u0000"+
		"\u0006.\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nF\u0001\u0000"+
		"\u0000\u0000\fR\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000"+
		"\u0010n\u0001\u0000\u0000\u0000\u0012~\u0001\u0000\u0000\u0000\u0014\u0096"+
		"\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018"+
		"\u0003\u0004\u0002\u0000\u0018\u0019\u0003\u0006\u0003\u0000\u0019\u001a"+
		"\u0003\b\u0004\u0000\u001a\u001b\u0003\n\u0005\u0000\u001b\u001c\u0003"+
		"\f\u0006\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0000"+
		"\u0000\u0001\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000"+
		"\u0000 !\u0005\u0011\u0000\u0000!\u0003\u0001\u0000\u0000\u0000\"*\u0005"+
		"\u0002\u0000\u0000#%\u0005\u0003\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)+\u0005\u0012"+
		"\u0000\u0000*&\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-\u0005\u0001\u0000\u0000"+
		"\u0000.6\u0005\u0004\u0000\u0000/1\u0005\u0003\u0000\u00000/\u0001\u0000"+
		"\u0000\u000014\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000035\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"57\u0005\u0012\u0000\u000062\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u0007\u0001"+
		"\u0000\u0000\u0000:>\u0005\u0005\u0000\u0000;=\u0005\u0003\u0000\u0000"+
		"<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\t\u0001\u0000\u0000\u0000FJ\u0005\u0006\u0000\u0000GI\u0005\u0003\u0000"+
		"\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000MO\u0003\u0010\b\u0000NM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"Q\u000b\u0001\u0000\u0000\u0000RV\u0005\u0007\u0000\u0000SU\u0005\u0003"+
		"\u0000\u0000TS\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000Y[\u0003\u0012\t\u0000ZY\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]\r\u0001\u0000\u0000\u0000^b\u0005\u0012\u0000\u0000_a\u0005"+
		"\u0003\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ce\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000ei\u0005\b\u0000\u0000fh\u0005\u0003\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0012\u0000\u0000m\u000f\u0001\u0000\u0000"+
		"\u0000nr\u0005\u0012\u0000\u0000oq\u0005\u0003\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uy\u0005\t\u0000\u0000vx\u0005\u0003\u0000\u0000wv\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0003\u0014"+
		"\n\u0000}\u0011\u0001\u0000\u0000\u0000~\u0082\u0005\u0012\u0000\u0000"+
		"\u007f\u0081\u0005\u0003\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u0089\u0005\t\u0000\u0000\u0086"+
		"\u0088\u0005\u0003\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088"+
		"\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0001\u0000\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0013\u0000\u0000\u008d"+
		"\u0013\u0001\u0000\u0000\u0000\u008e\u008f\u0006\n\uffff\uffff\u0000\u008f"+
		"\u0097\u0005\u0012\u0000\u0000\u0090\u0091\u0005\n\u0000\u0000\u0091\u0092"+
		"\u0003\u0014\n\u0000\u0092\u0093\u0005\u000b\u0000\u0000\u0093\u0097\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\f\u0000\u0000\u0095\u0097\u0003\u0014"+
		"\n\u0003\u0096\u008e\u0001\u0000\u0000\u0000\u0096\u0090\u0001\u0000\u0000"+
		"\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u00b8\u0001\u0000\u0000"+
		"\u0000\u0098\u009c\n\u0002\u0000\u0000\u0099\u009b\u0005\u0003\u0000\u0000"+
		"\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a3\u0005\r\u0000\u0000\u00a0\u00a2\u0005\u0003\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00b7\u0003\u0014\n\u0003\u00a7\u00ab\n\u0001\u0000\u0000\u00a8\u00aa"+
		"\u0005\u0003\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u000e\u0000\u0000\u00af\u00b1"+
		"\u0005\u0003\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u0014\n\u0002\u00b6\u0098\u0001"+
		"\u0000\u0000\u0000\u00b6\u00a7\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001"+
		"\u0000\u0000\u0000\u0017&,28>DJPV\\biry\u0082\u0089\u0096\u009c\u00a3"+
		"\u00ab\u00b2\u00b6\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}