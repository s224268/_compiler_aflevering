// Generated from impl.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, IDENTIFIER=7, FLOAT=8, 
		WHITESPACE=9, COMMENT=10, LONGCOMMENT=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "IDENTIFIER", "FLOAT", 
			"WHITESPACE", "COMMENT", "LONGCOMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "IDENTIFIER", "FLOAT", "WHITESPACE", 
			"COMMENT", "LONGCOMMENT"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\u0004\u0000\u000bY\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0005\u0006&\b\u0006\n\u0006\f\u0006)\t\u0006\u0001\u0007"+
		"\u0004\u0007,\b\u0007\u000b\u0007\f\u0007-\u0001\u0007\u0001\u0007\u0004"+
		"\u00072\b\u0007\u000b\u0007\f\u00073\u0003\u00076\b\u0007\u0001\b\u0004"+
		"\b9\b\b\u000b\b\f\b:\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tC\b\t\n\t\f\tF\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\nP\b\n\n\n\f\nS\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0001\u0000"+
		"\u0007\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\t"+
		"\n  \u0001\u0000\n\n\u0001\u0000**\u0001\u0000//`\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0001\u0017\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000"+
		"\u0005\u001b\u0001\u0000\u0000\u0000\u0007\u001d\u0001\u0000\u0000\u0000"+
		"\t\u001f\u0001\u0000\u0000\u0000\u000b!\u0001\u0000\u0000\u0000\r#\u0001"+
		"\u0000\u0000\u0000\u000f+\u0001\u0000\u0000\u0000\u00118\u0001\u0000\u0000"+
		"\u0000\u0013>\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0005*\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0005/\u0000\u0000\u001a\u0004\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"+\u0000\u0000\u001c\u0006\u0001\u0000\u0000\u0000\u001d\u001e\u0005-\u0000"+
		"\u0000\u001e\b\u0001\u0000\u0000\u0000\u001f \u0005(\u0000\u0000 \n\u0001"+
		"\u0000\u0000\u0000!\"\u0005)\u0000\u0000\"\f\u0001\u0000\u0000\u0000#"+
		"\'\u0007\u0000\u0000\u0000$&\u0007\u0001\u0000\u0000%$\u0001\u0000\u0000"+
		"\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000(\u000e\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000"+
		"*,\u0007\u0002\u0000\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.5\u0001\u0000"+
		"\u0000\u0000/1\u0005.\u0000\u000002\u0007\u0002\u0000\u000010\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000046\u0001\u0000\u0000\u00005/\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u00006\u0010\u0001\u0000\u0000\u000079\u0007\u0003"+
		"\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<=\u0006\b\u0000\u0000=\u0012\u0001\u0000\u0000\u0000>?\u0005/\u0000\u0000"+
		"?@\u0005/\u0000\u0000@D\u0001\u0000\u0000\u0000AC\b\u0004\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000"+
		"\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000FD\u0001\u0000"+
		"\u0000\u0000GH\u0006\t\u0000\u0000H\u0014\u0001\u0000\u0000\u0000IJ\u0005"+
		"/\u0000\u0000JK\u0005*\u0000\u0000KQ\u0001\u0000\u0000\u0000LP\b\u0005"+
		"\u0000\u0000MN\u0005*\u0000\u0000NP\b\u0006\u0000\u0000OL\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000TU\u0005*\u0000\u0000UV\u0005/\u0000\u0000V"+
		"W\u0001\u0000\u0000\u0000WX\u0006\n\u0000\u0000X\u0016\u0001\u0000\u0000"+
		"\u0000\t\u0000\'-35:DOQ\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}