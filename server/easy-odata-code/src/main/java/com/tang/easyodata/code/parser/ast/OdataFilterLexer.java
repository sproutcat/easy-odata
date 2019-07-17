// Generated from D:/resoures/workspace-my.4/easy-odata-all/server/easy-odata-code/src/test/resources\OdataFilter.g4 by ANTLR 4.7

package com.tang.easyodata.code.parser.ast;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OdataFilterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, WORD=29, DATATIME=30, STRING=31, 
		NUMBER=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "WORD", "DATATIME", "STRING", "NUMBER", "INT", 
		"EXP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'OR'", "'or'", "'O'", "'o'", "'AND'", "'and'", "'E'", "'e'", "'('", 
		"')'", "'substringof('", "'contains('", "','", "'endswith('", "'startswith('", 
		"'indexof('", "') eq -1'", "'eq'", "'ne'", "'gt'", "'ge'", "'lt'", "'le'", 
		"'ni'", "'in'", "'true'", "'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "WORD", "DATATIME", "STRING", "NUMBER", 
		"WS"
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


	public OdataFilterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OdataFilter.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0110\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\6\36\u00cd\n\36\r\36\16\36\u00ce\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\6\37\u00dc\n\37\r\37\16\37\u00dd\3\37\3\37\3 \3 "+
		"\7 \u00e4\n \f \16 \u00e7\13 \3 \3 \3!\5!\u00ec\n!\3!\3!\3!\6!\u00f1\n"+
		"!\r!\16!\u00f2\5!\u00f5\n!\3!\5!\u00f8\n!\3\"\3\"\3\"\7\"\u00fd\n\"\f"+
		"\"\16\"\u0100\13\"\5\"\u0102\n\"\3#\3#\5#\u0106\n#\3#\3#\3$\6$\u010b\n"+
		"$\r$\16$\u010c\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G#\3\2\t\7\2--\60;C\\aac|\3\2)"+
		")\3\2\62;\3\2\63;\4\2GGgg\4\2--//\6\2\13\f\17\17\"\"..\2\u0118\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5L\3\2\2\2\7O\3"+
		"\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rW\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3"+
		"\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31p\3\2\2\2\33z\3\2\2\2\35|\3\2\2\2\37"+
		"\u0086\3\2\2\2!\u0092\3\2\2\2#\u009b\3\2\2\2%\u00a3\3\2\2\2\'\u00a6\3"+
		"\2\2\2)\u00a9\3\2\2\2+\u00ac\3\2\2\2-\u00af\3\2\2\2/\u00b2\3\2\2\2\61"+
		"\u00b5\3\2\2\2\63\u00b8\3\2\2\2\65\u00bb\3\2\2\2\67\u00c0\3\2\2\29\u00c6"+
		"\3\2\2\2;\u00cc\3\2\2\2=\u00d0\3\2\2\2?\u00e1\3\2\2\2A\u00eb\3\2\2\2C"+
		"\u0101\3\2\2\2E\u0103\3\2\2\2G\u010a\3\2\2\2IJ\7Q\2\2JK\7T\2\2K\4\3\2"+
		"\2\2LM\7q\2\2MN\7t\2\2N\6\3\2\2\2OP\7Q\2\2P\b\3\2\2\2QR\7q\2\2R\n\3\2"+
		"\2\2ST\7C\2\2TU\7P\2\2UV\7F\2\2V\f\3\2\2\2WX\7c\2\2XY\7p\2\2YZ\7f\2\2"+
		"Z\16\3\2\2\2[\\\7G\2\2\\\20\3\2\2\2]^\7g\2\2^\22\3\2\2\2_`\7*\2\2`\24"+
		"\3\2\2\2ab\7+\2\2b\26\3\2\2\2cd\7u\2\2de\7w\2\2ef\7d\2\2fg\7u\2\2gh\7"+
		"v\2\2hi\7t\2\2ij\7k\2\2jk\7p\2\2kl\7i\2\2lm\7q\2\2mn\7h\2\2no\7*\2\2o"+
		"\30\3\2\2\2pq\7e\2\2qr\7q\2\2rs\7p\2\2st\7v\2\2tu\7c\2\2uv\7k\2\2vw\7"+
		"p\2\2wx\7u\2\2xy\7*\2\2y\32\3\2\2\2z{\7.\2\2{\34\3\2\2\2|}\7g\2\2}~\7"+
		"p\2\2~\177\7f\2\2\177\u0080\7u\2\2\u0080\u0081\7y\2\2\u0081\u0082\7k\2"+
		"\2\u0082\u0083\7v\2\2\u0083\u0084\7j\2\2\u0084\u0085\7*\2\2\u0085\36\3"+
		"\2\2\2\u0086\u0087\7u\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7v\2\2\u008b\u008c\7u\2\2\u008c\u008d\7y\2\2"+
		"\u008d\u008e\7k\2\2\u008e\u008f\7v\2\2\u008f\u0090\7j\2\2\u0090\u0091"+
		"\7*\2\2\u0091 \3\2\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094\u0095"+
		"\7f\2\2\u0095\u0096\7g\2\2\u0096\u0097\7z\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7h\2\2\u0099\u009a\7*\2\2\u009a\"\3\2\2\2\u009b\u009c\7+\2\2\u009c"+
		"\u009d\7\"\2\2\u009d\u009e\7g\2\2\u009e\u009f\7s\2\2\u009f\u00a0\7\"\2"+
		"\2\u00a0\u00a1\7/\2\2\u00a1\u00a2\7\63\2\2\u00a2$\3\2\2\2\u00a3\u00a4"+
		"\7g\2\2\u00a4\u00a5\7s\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8"+
		"\7g\2\2\u00a8(\3\2\2\2\u00a9\u00aa\7i\2\2\u00aa\u00ab\7v\2\2\u00ab*\3"+
		"\2\2\2\u00ac\u00ad\7i\2\2\u00ad\u00ae\7g\2\2\u00ae,\3\2\2\2\u00af\u00b0"+
		"\7n\2\2\u00b0\u00b1\7v\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\60\3\2\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7k\2\2\u00b7\62"+
		"\3\2\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7p\2\2\u00ba\64\3\2\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7w\2\2\u00be\u00bf\7g\2\2"+
		"\u00bf\66\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7"+
		"n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7g\2\2\u00c58\3\2\2\2\u00c6\u00c7"+
		"\7p\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7n\2\2\u00ca"+
		":\3\2\2\2\u00cb\u00cd\t\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2"+
		"\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7"+
		"f\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7g\2\2\u00d8"+
		"\u00d9\7)\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\n\3\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e0\7)\2\2\u00e0>\3\2\2\2\u00e1\u00e5\7)\2\2\u00e2"+
		"\u00e4\n\3\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\7)\2\2\u00e9@\3\2\2\2\u00ea\u00ec\7/\2\2\u00eb\u00ea\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f4\5C\"\2\u00ee\u00f0\7\60"+
		"\2\2\u00ef\u00f1\t\4\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00ee\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\5E#\2\u00f7\u00f6"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8B\3\2\2\2\u00f9\u0102\7\62\2\2\u00fa"+
		"\u00fe\t\5\2\2\u00fb\u00fd\t\4\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0102\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u00f9\3\2\2\2\u0101\u00fa\3\2\2\2\u0102D\3\2\2\2"+
		"\u0103\u0105\t\6\2\2\u0104\u0106\t\7\2\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5C\"\2\u0108F\3\2\2\2\u0109\u010b"+
		"\t\b\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b$\2\2\u010fH\3\2\2\2\16"+
		"\2\u00ce\u00dd\u00e5\u00eb\u00f2\u00f4\u00f7\u00fe\u0101\u0105\u010c\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
