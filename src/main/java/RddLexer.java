// Generated from /Users/jordan/Desktop/512/project-part2/src/main/java/Rdd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RddLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, SC=2, ID=3, NUMBER=4, VAL=5, IF=6, ELSE=7, ASSIGN=8, DOT=9, 
		OP=10, COMP=11, COMMA=12, SEMICOLON=13, ARROW=14, LB=15, RB=16, LP=17, 
		RP=18, RANGE=19, COLLECT=20, MAP=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACE", "SC", "ID", "NUMBER", "VAL", "IF", "ELSE", "ASSIGN", "DOT", 
		"OP", "COMP", "COMMA", "SEMICOLON", "ARROW", "LB", "RB", "LP", "RP", "RANGE", 
		"COLLECT", "MAP"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'sc'", null, null, "'val'", "'if'", "'else'", "'='", "'.'", 
		null, null, "','", "';'", "'=>'", "'{'", "'}'", "'('", "')'", "'range'", 
		"'collect'", "'map'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "SC", "ID", "NUMBER", "VAL", "IF", "ELSE", "ASSIGN", 
		"DOT", "OP", "COMP", "COMMA", "SEMICOLON", "ARROW", "LB", "RB", "LP", 
		"RP", "RANGE", "COLLECT", "MAP"
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


	public RddLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rdd.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\6\4;\n\4\r\4\16\4<\7\4?\n\4\f\4\16\4"+
		"B\13\4\3\5\6\5E\n\5\r\5\16\5F\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\fd\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"\3\2\6\5\2\13\f\16\17\"\"\4\2C\\c|\5\2\'\',-//\4\2>>@@\2\u008e\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3.\3\2\2\2\5\64\3\2\2\2\7\67"+
		"\3\2\2\2\tD\3\2\2\2\13H\3\2\2\2\rL\3\2\2\2\17O\3\2\2\2\21T\3\2\2\2\23"+
		"V\3\2\2\2\25X\3\2\2\2\27c\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2"+
		"\37l\3\2\2\2!n\3\2\2\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)z\3\2\2\2+\u0082"+
		"\3\2\2\2-/\t\2\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61"+
		"\62\3\2\2\2\62\63\b\2\2\2\63\4\3\2\2\2\64\65\7u\2\2\65\66\7e\2\2\66\6"+
		"\3\2\2\2\67@\t\3\2\28?\t\3\2\29;\4\62;\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2"+
		"<=\3\2\2\2=?\3\2\2\2>8\3\2\2\2>:\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"A\b\3\2\2\2B@\3\2\2\2CE\4\62;\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2"+
		"\2G\n\3\2\2\2HI\7x\2\2IJ\7c\2\2JK\7n\2\2K\f\3\2\2\2LM\7k\2\2MN\7h\2\2"+
		"N\16\3\2\2\2OP\7g\2\2PQ\7n\2\2QR\7u\2\2RS\7g\2\2S\20\3\2\2\2TU\7?\2\2"+
		"U\22\3\2\2\2VW\7\60\2\2W\24\3\2\2\2XY\t\4\2\2Y\26\3\2\2\2Z[\7?\2\2[d\7"+
		"?\2\2\\d\t\5\2\2]^\7#\2\2^d\7?\2\2_`\7@\2\2`d\7?\2\2ab\7>\2\2bd\7?\2\2"+
		"cZ\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c_\3\2\2\2ca\3\2\2\2d\30\3\2\2\2ef\7.\2"+
		"\2f\32\3\2\2\2gh\7=\2\2h\34\3\2\2\2ij\7?\2\2jk\7@\2\2k\36\3\2\2\2lm\7"+
		"}\2\2m \3\2\2\2no\7\177\2\2o\"\3\2\2\2pq\7*\2\2q$\3\2\2\2rs\7+\2\2s&\3"+
		"\2\2\2tu\7t\2\2uv\7c\2\2vw\7p\2\2wx\7i\2\2xy\7g\2\2y(\3\2\2\2z{\7e\2\2"+
		"{|\7q\2\2|}\7n\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7e\2\2\u0080\u0081\7"+
		"v\2\2\u0081*\3\2\2\2\u0082\u0083\7o\2\2\u0083\u0084\7c\2\2\u0084\u0085"+
		"\7r\2\2\u0085,\3\2\2\2\t\2\60<>@Fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}