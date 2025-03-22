// Generated from D:/workplace/opswat_assignment/OPSWAT Assignment/src/main/java/com/opswat/part3/ANTLR4/SimpleScript.g4 by ANTLR 4.13.2
package com.opswat.part3.ANTLR4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, ADD=2, SUBTRACT=3, EXIT=4, STRING=5, NUMBER=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "ADD", "SUBTRACT", "EXIT", "STRING", "NUMBER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'add'", "'subtract'", "'exit'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "ADD", "SUBTRACT", "EXIT", "STRING", "NUMBER", "WS"
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


	public SimpleScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SimpleScript.g4"; }

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
		"\u0004\u0000\u0007<\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0005\u0004*\b\u0004\n\u0004\f\u0004-\t\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0004\u00052\b\u0005\u000b\u0005\f\u00053\u0001"+
		"\u0006\u0004\u00067\b\u0006\u000b\u0006\f\u00068\u0001\u0006\u0001\u0006"+
		"\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u0001\u0000\u0003\u0002\u0000\"\"\\\\\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  >\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000"+
		"\u0000\u0000\u0003\u0015\u0001\u0000\u0000\u0000\u0005\u0019\u0001\u0000"+
		"\u0000\u0000\u0007\"\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000"+
		"\u000b1\u0001\u0000\u0000\u0000\r6\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005p\u0000\u0000\u0010\u0011\u0005r\u0000\u0000\u0011\u0012\u0005i"+
		"\u0000\u0000\u0012\u0013\u0005n\u0000\u0000\u0013\u0014\u0005t\u0000\u0000"+
		"\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0016\u0005a\u0000\u0000\u0016"+
		"\u0017\u0005d\u0000\u0000\u0017\u0018\u0005d\u0000\u0000\u0018\u0004\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005s\u0000\u0000\u001a\u001b\u0005u\u0000"+
		"\u0000\u001b\u001c\u0005b\u0000\u0000\u001c\u001d\u0005t\u0000\u0000\u001d"+
		"\u001e\u0005r\u0000\u0000\u001e\u001f\u0005a\u0000\u0000\u001f \u0005"+
		"c\u0000\u0000 !\u0005t\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005"+
		"e\u0000\u0000#$\u0005x\u0000\u0000$%\u0005i\u0000\u0000%&\u0005t\u0000"+
		"\u0000&\b\u0001\u0000\u0000\u0000\'+\u0005\"\u0000\u0000(*\b\u0000\u0000"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0005\"\u0000\u0000/\n\u0001\u0000\u0000\u000002"+
		"\u0007\u0001\u0000\u000010\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u00004\f\u0001\u0000"+
		"\u0000\u000057\u0007\u0002\u0000\u000065\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9:\u0001\u0000\u0000\u0000:;\u0006\u0006\u0000\u0000;\u000e\u0001\u0000"+
		"\u0000\u0000\u0004\u0000+38\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}