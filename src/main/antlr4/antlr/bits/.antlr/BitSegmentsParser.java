// Generated from /home/hosain/Desktop/BitLexerApp/src/main/antlr4/antlr/bits/BitSegments.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BitSegmentsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BIT=1, WS=2;
	public static final int
		RULE_input = 0, RULE_segment = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "segment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BIT", "WS"
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
	public String getGrammarFileName() { return "BitSegments.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BitSegmentsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public TerminalNode EOF() { return getToken(BitSegmentsParser.EOF, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			segment();
			setState(8);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIT) {
				{
				{
				setState(5);
				segment();
				}
				}
				setState(10);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(11);
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
	public static class SegmentContext extends ParserRuleContext {
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
	 
		public SegmentContext() { }
		public void copyFrom(SegmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoBitsContext extends SegmentContext {
		public List<TerminalNode> BIT() { return getTokens(BitSegmentsParser.BIT); }
		public TerminalNode BIT(int i) {
			return getToken(BitSegmentsParser.BIT, i);
		}
		public TwoBitsContext(SegmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThreeBitsContext extends SegmentContext {
		public List<TerminalNode> BIT() { return getTokens(BitSegmentsParser.BIT); }
		public TerminalNode BIT(int i) {
			return getToken(BitSegmentsParser.BIT, i);
		}
		public ThreeBitsContext(SegmentContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OneBitContext extends SegmentContext {
		public TerminalNode BIT() { return getToken(BitSegmentsParser.BIT, 0); }
		public OneBitContext(SegmentContext ctx) { copyFrom(ctx); }
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_segment);
		try {
			setState(19);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ThreeBitsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(BIT);
				setState(14);
				match(BIT);
				setState(15);
				match(BIT);
				}
				break;
			case 2:
				_localctx = new TwoBitsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(BIT);
				setState(17);
				match(BIT);
				}
				break;
			case 3:
				_localctx = new OneBitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(18);
				match(BIT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0002\u0016\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0005\u0000\u0007\b\u0000\n\u0000\f\u0000\n\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000\u0016\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\u0013\u0001\u0000\u0000\u0000\u0004\b\u0003\u0002\u0001\u0000"+
		"\u0005\u0007\u0003\u0002\u0001\u0000\u0006\u0005\u0001\u0000\u0000\u0000"+
		"\u0007\n\u0001\u0000\u0000\u0000\b\u0006\u0001\u0000\u0000\u0000\b\t\u0001"+
		"\u0000\u0000\u0000\t\u000b\u0001\u0000\u0000\u0000\n\b\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0001\u0000\u0000\u000f"+
		"\u0014\u0005\u0001\u0000\u0000\u0010\u0011\u0005\u0001\u0000\u0000\u0011"+
		"\u0014\u0005\u0001\u0000\u0000\u0012\u0014\u0005\u0001\u0000\u0000\u0013"+
		"\r\u0001\u0000\u0000\u0000\u0013\u0010\u0001\u0000\u0000\u0000\u0013\u0012"+
		"\u0001\u0000\u0000\u0000\u0014\u0003\u0001\u0000\u0000\u0000\u0002\b\u0013";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}