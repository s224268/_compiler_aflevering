// Generated from cc.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ccLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OUTPUTS=8, INPUTS=9, 
		HW=10, LATCHES=11, UPDATE=12, SIMULATE=13, BINARY=14, IDENTIFIER=15, COMMENT=16, 
		MULTICOMMENT=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OUTPUTS", "INPUTS", 
			"HW", "LATCHES", "UPDATE", "SIMULATE", "BINARY", "IDENTIFIER", "COMMENT", 
			"MULTICOMMENT", "WS"
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


	public ccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "cc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\rn\b\r\u000b\r\f\ro\u0001\u000e\u0001\u000e\u0005\u000et\b\u000e\n\u000e"+
		"\f\u000ew\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f}\b\u000f\n\u000f\f\u000f\u0080\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u008a\b\u0010\n\u0010\f\u0010\u008d\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u0095"+
		"\b\u0011\u000b\u0011\f\u0011\u0096\u0001\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0007\u0001\u00000"+
		"1\u0002\u0000AZaz\u0003\u000009AZaz\u0001\u0000\n\n\u0001\u0000**\u0001"+
		"\u0000//\u0003\u0000\t\n\r\r  \u009f\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000"+
		"\u0005*\u0001\u0000\u0000\u0000\u0007,\u0001\u0000\u0000\u0000\t/\u0001"+
		"\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r4\u0001\u0000\u0000"+
		"\u0000\u000f6\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000\u0013"+
		"G\u0001\u0000\u0000\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017Z\u0001"+
		"\u0000\u0000\u0000\u0019b\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000"+
		"\u0000\u001dq\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000\u0000!"+
		"\u0083\u0001\u0000\u0000\u0000#\u0094\u0001\u0000\u0000\u0000%&\u0005"+
		"-\u0000\u0000&\'\u0005>\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()"+
		"\u0005=\u0000\u0000)\u0004\u0001\u0000\u0000\u0000*+\u0005!\u0000\u0000"+
		"+\u0006\u0001\u0000\u0000\u0000,-\u0005&\u0000\u0000-.\u0005&\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005|\u0000\u000001\u0005|\u0000\u0000"+
		"1\n\u0001\u0000\u0000\u000023\u0005(\u0000\u00003\f\u0001\u0000\u0000"+
		"\u000045\u0005)\u0000\u00005\u000e\u0001\u0000\u0000\u000067\u0005.\u0000"+
		"\u000078\u0005o\u0000\u000089\u0005u\u0000\u00009:\u0005t\u0000\u0000"+
		":;\u0005p\u0000\u0000;<\u0005u\u0000\u0000<=\u0005t\u0000\u0000=>\u0005"+
		"s\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005.\u0000\u0000@A\u0005"+
		"i\u0000\u0000AB\u0005n\u0000\u0000BC\u0005p\u0000\u0000CD\u0005u\u0000"+
		"\u0000DE\u0005t\u0000\u0000EF\u0005s\u0000\u0000F\u0012\u0001\u0000\u0000"+
		"\u0000GH\u0005.\u0000\u0000HI\u0005h\u0000\u0000IJ\u0005a\u0000\u0000"+
		"JK\u0005r\u0000\u0000KL\u0005d\u0000\u0000LM\u0005w\u0000\u0000MN\u0005"+
		"a\u0000\u0000NO\u0005r\u0000\u0000OP\u0005e\u0000\u0000P\u0014\u0001\u0000"+
		"\u0000\u0000QR\u0005.\u0000\u0000RS\u0005l\u0000\u0000ST\u0005a\u0000"+
		"\u0000TU\u0005t\u0000\u0000UV\u0005c\u0000\u0000VW\u0005h\u0000\u0000"+
		"WX\u0005e\u0000\u0000XY\u0005s\u0000\u0000Y\u0016\u0001\u0000\u0000\u0000"+
		"Z[\u0005.\u0000\u0000[\\\u0005u\u0000\u0000\\]\u0005p\u0000\u0000]^\u0005"+
		"d\u0000\u0000^_\u0005a\u0000\u0000_`\u0005t\u0000\u0000`a\u0005e\u0000"+
		"\u0000a\u0018\u0001\u0000\u0000\u0000bc\u0005.\u0000\u0000cd\u0005s\u0000"+
		"\u0000de\u0005i\u0000\u0000ef\u0005m\u0000\u0000fg\u0005u\u0000\u0000"+
		"gh\u0005l\u0000\u0000hi\u0005a\u0000\u0000ij\u0005t\u0000\u0000jk\u0005"+
		"e\u0000\u0000k\u001a\u0001\u0000\u0000\u0000ln\u0007\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000p\u001c\u0001\u0000\u0000\u0000qu\u0007"+
		"\u0001\u0000\u0000rt\u0007\u0002\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\u001e\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005"+
		"/\u0000\u0000yz\u0005/\u0000\u0000z~\u0001\u0000\u0000\u0000{}\b\u0003"+
		"\u0000\u0000|{\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000"+
		"~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u0006"+
		"\u000f\u0000\u0000\u0082 \u0001\u0000\u0000\u0000\u0083\u0084\u0005/\u0000"+
		"\u0000\u0084\u0085\u0005*\u0000\u0000\u0085\u008b\u0001\u0000\u0000\u0000"+
		"\u0086\u008a\b\u0004\u0000\u0000\u0087\u0088\u0005*\u0000\u0000\u0088"+
		"\u008a\b\u0005\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005*\u0000\u0000\u008f\u0090\u0005/\u0000\u0000\u0090\u0091\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0006\u0010\u0000\u0000\u0092\"\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0007\u0006\u0000\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0006\u0011\u0000\u0000\u0099$\u0001\u0000\u0000\u0000"+
		"\u0007\u0000ou~\u0089\u008b\u0096\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}