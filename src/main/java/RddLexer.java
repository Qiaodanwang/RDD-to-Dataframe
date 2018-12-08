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
		T__0=1, T__1=2, T__2=3, SC=4, VAL=5, IF=6, ELSE=7, ASSIGN=8, DOT=9, LB=10, 
		RB=11, LP=12, RP=13, COMMA=14, SEMICOLON=15, ARROW=16, OP=17, COMP=18, 
		ID=19, NUMBER=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "DIGIT", "LETTER", "SC", "VAL", "IF", "ELSE", 
		"ASSIGN", "DOT", "LB", "RB", "LP", "RP", "COMMA", "SEMICOLON", "ARROW", 
		"OP", "COMP", "ID", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'range'", "'collect'", "'map'", "'sc'", "'val'", "'if'", "'else'", 
		"'='", "'.'", "'{'", "'}'", "'('", "')'", "','", "';'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SC", "VAL", "IF", "ELSE", "ASSIGN", "DOT", "LB", 
		"RB", "LP", "RP", "COMMA", "SEMICOLON", "ARROW", "OP", "COMP", "ID", "NUMBER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\5\6E\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25t\n\25\3\26\3\26\3\26\7\26y\n\26\f\26\16\26|\13\26\3\27\6\27"+
		"\177\n\27\r\27\16\27\u0080\2\2\30\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23"+
		"\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26\3\2\5"+
		"\5\2C\\aac|\5\2\'\',-//\4\2>>@@\2\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\3/\3\2\2\2\5\65\3\2\2\2\7=\3\2\2\2\tA\3\2\2\2\13D\3\2\2\2\rF\3\2"+
		"\2\2\17I\3\2\2\2\21M\3\2\2\2\23P\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3"+
		"\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#c\3\2\2\2%e\3\2\2"+
		"\2\'h\3\2\2\2)s\3\2\2\2+u\3\2\2\2-~\3\2\2\2/\60\7t\2\2\60\61\7c\2\2\61"+
		"\62\7p\2\2\62\63\7i\2\2\63\64\7g\2\2\64\4\3\2\2\2\65\66\7e\2\2\66\67\7"+
		"q\2\2\678\7n\2\289\7n\2\29:\7g\2\2:;\7e\2\2;<\7v\2\2<\6\3\2\2\2=>\7o\2"+
		"\2>?\7c\2\2?@\7r\2\2@\b\3\2\2\2AB\4\62;\2B\n\3\2\2\2CE\t\2\2\2DC\3\2\2"+
		"\2E\f\3\2\2\2FG\7u\2\2GH\7e\2\2H\16\3\2\2\2IJ\7x\2\2JK\7c\2\2KL\7n\2\2"+
		"L\20\3\2\2\2MN\7k\2\2NO\7h\2\2O\22\3\2\2\2PQ\7g\2\2QR\7n\2\2RS\7u\2\2"+
		"ST\7g\2\2T\24\3\2\2\2UV\7?\2\2V\26\3\2\2\2WX\7\60\2\2X\30\3\2\2\2YZ\7"+
		"}\2\2Z\32\3\2\2\2[\\\7\177\2\2\\\34\3\2\2\2]^\7*\2\2^\36\3\2\2\2_`\7+"+
		"\2\2` \3\2\2\2ab\7.\2\2b\"\3\2\2\2cd\7=\2\2d$\3\2\2\2ef\7?\2\2fg\7@\2"+
		"\2g&\3\2\2\2hi\t\3\2\2i(\3\2\2\2jk\7?\2\2kt\7?\2\2lt\t\4\2\2mn\7#\2\2"+
		"nt\7?\2\2op\7@\2\2pt\7?\2\2qr\7>\2\2rt\7?\2\2sj\3\2\2\2sl\3\2\2\2sm\3"+
		"\2\2\2so\3\2\2\2sq\3\2\2\2t*\3\2\2\2uz\5\13\6\2vy\5\13\6\2wy\5\t\5\2x"+
		"v\3\2\2\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{,\3\2\2\2|z\3\2\2\2"+
		"}\177\5\t\5\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081.\3\2\2\2\b\2Dsxz\u0080\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}