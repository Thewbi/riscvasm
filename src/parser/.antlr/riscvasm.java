// Generated from c:/aaa_se/rust/riscvasm/src/parser/riscvasm.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class riscvasm extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, ADC=2, ADIW=3, AND=4, ANDI=5, ASR=6, BCLR=7, BLD=8, BRBC=9, BRBS=10, 
		BRCC=11, BRCS=12, BREAK=13, BREQ=14, BRGE=15, BRHC=16, BRHS=17, BRID=18, 
		BRIE=19, BRLO=20, BRLT=21, BRMI=22, BRNE=23, BRPL=24, BRSH=25, BRTC=26, 
		BRTS=27, BRVC=28, BRVS=29, BSET=30, BST=31, CALL=32, CBI=33, CBR=34, CLC=35, 
		CLH=36, CLI=37, CLN=38, CLR=39, CLS=40, CLT=41, CLV=42, CLZ=43, COM=44, 
		CP=45, CPC=46, CPI=47, CPSE=48, DEC=49, DES=50, EICALL=51, EIJMP=52, ELPM=53, 
		EOR=54, FMUL=55, FMULS=56, FMULSU=57, ICALL=58, IJMP=59, IN=60, INC=61, 
		JMP=62, LAC=63, LAS=64, LAT=65, LD=66, LDD=67, LDI=68, LDS=69, LPM=70, 
		LSL=71, LSR=72, MOV=73, MOVW=74, MUL=75, MULS=76, MULSU=77, NEG=78, NOP=79, 
		OR=80, ORI=81, OUT=82, POP=83, PUSH=84, RCALL=85, RET=86, RETI=87, RJMP=88, 
		ROL=89, ROR=90, SBC=91, SBCI=92, SBI=93, SBIC=94, SBIS=95, SBIW=96, SBR=97, 
		SBRC=98, SBRS=99, SEC=100, SEH=101, SEI=102, SEN=103, SER=104, SES=105, 
		SET=106, SEV=107, SEZ=108, SLEEP=109, SPM=110, ST=111, STD=112, STS=113, 
		SUB=114, SUBI=115, SWAP=116, TST=117, WDR=118, XCH=119, ASTERISK=120, 
		AT=121, BYTE=122, BACKSLASH=123, CLOSEING_BRACKET=124, COLON=125, COMMA=126, 
		CSEG=127, DB=128, DEF=129, DEVICE=130, DOT=131, DSEG=132, ELSE=133, END_MACRO=134, 
		ENDIF=135, EQUALS=136, EQU=137, ERROR=138, GT=139, HASH_TAG=140, IF=141, 
		INCLUDE=142, LEFT_SHIFT=143, LT=144, MACRO=145, MINUS=146, OPENING_BRACKET=147, 
		ORG=148, PLUS=149, RIGHT_SHIFT=150, SLASH=151, NEWLINE=152, WS=153, LINE_COMMENT=154, 
		BLOCK_COMMENT=155, DOUBLE_SLASH_LINE_COMMENT=156, STRING=157, CHAR=158, 
		ESCAPED_CHAR=159, NUMBER=160, HEX_NUMBER=161, BINARY_NUMBER=162, IDENTIFIER=163;
	public static final int
		RULE_program = 0, RULE_source_line = 1, RULE_instruction = 2, RULE_mnemonic = 3, 
		RULE_param = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "source_line", "instruction", "mnemonic", "param"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'*'", "'@'", null, "'\\'", "')'", "':'", "','", "'cseg'", "'db'", "'def'", 
			"'device'", "'.'", "'dseg'", "'else'", "'endmacro'", "'endif'", "'='", 
			null, "'error'", "'>'", "'#'", "'if'", "'include'", "'<<'", "'<'", "'macro'", 
			"'-'", "'('", "'org'", "'+'", "'>>'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "ADC", "ADIW", "AND", "ANDI", "ASR", "BCLR", "BLD", "BRBC", 
			"BRBS", "BRCC", "BRCS", "BREAK", "BREQ", "BRGE", "BRHC", "BRHS", "BRID", 
			"BRIE", "BRLO", "BRLT", "BRMI", "BRNE", "BRPL", "BRSH", "BRTC", "BRTS", 
			"BRVC", "BRVS", "BSET", "BST", "CALL", "CBI", "CBR", "CLC", "CLH", "CLI", 
			"CLN", "CLR", "CLS", "CLT", "CLV", "CLZ", "COM", "CP", "CPC", "CPI", 
			"CPSE", "DEC", "DES", "EICALL", "EIJMP", "ELPM", "EOR", "FMUL", "FMULS", 
			"FMULSU", "ICALL", "IJMP", "IN", "INC", "JMP", "LAC", "LAS", "LAT", "LD", 
			"LDD", "LDI", "LDS", "LPM", "LSL", "LSR", "MOV", "MOVW", "MUL", "MULS", 
			"MULSU", "NEG", "NOP", "OR", "ORI", "OUT", "POP", "PUSH", "RCALL", "RET", 
			"RETI", "RJMP", "ROL", "ROR", "SBC", "SBCI", "SBI", "SBIC", "SBIS", "SBIW", 
			"SBR", "SBRC", "SBRS", "SEC", "SEH", "SEI", "SEN", "SER", "SES", "SET", 
			"SEV", "SEZ", "SLEEP", "SPM", "ST", "STD", "STS", "SUB", "SUBI", "SWAP", 
			"TST", "WDR", "XCH", "ASTERISK", "AT", "BYTE", "BACKSLASH", "CLOSEING_BRACKET", 
			"COLON", "COMMA", "CSEG", "DB", "DEF", "DEVICE", "DOT", "DSEG", "ELSE", 
			"END_MACRO", "ENDIF", "EQUALS", "EQU", "ERROR", "GT", "HASH_TAG", "IF", 
			"INCLUDE", "LEFT_SHIFT", "LT", "MACRO", "MINUS", "OPENING_BRACKET", "ORG", 
			"PLUS", "RIGHT_SHIFT", "SLASH", "NEWLINE", "WS", "LINE_COMMENT", "BLOCK_COMMENT", 
			"DOUBLE_SLASH_LINE_COMMENT", "STRING", "CHAR", "ESCAPED_CHAR", "NUMBER", 
			"HEX_NUMBER", "BINARY_NUMBER", "IDENTIFIER"
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
	public String getGrammarFileName() { return "riscvasm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public riscvasm(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<Source_lineContext> source_line() {
			return getRuleContexts(Source_lineContext.class);
		}
		public Source_lineContext source_line(int i) {
			return getRuleContext(Source_lineContext.class,i);
		}
		public TerminalNode EOF() { return getToken(riscvasm.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(riscvasm.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(riscvasm.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(10);
				match(NEWLINE);
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			source_line();
			setState(26);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(20);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(17);
						match(NEWLINE);
						}
						}
						setState(22);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(23);
					source_line();
					}
					} 
				}
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(29);
				match(NEWLINE);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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
	public static class Source_lineContext extends ParserRuleContext {
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public Source_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_line; }
	}

	public final Source_lineContext source_line() throws RecognitionException {
		Source_lineContext _localctx = new Source_lineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_source_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			instruction();
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
	public static class InstructionContext extends ParserRuleContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(riscvasm.COMMA, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			mnemonic();
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(40);
				param();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(41);
					match(COMMA);
					setState(42);
					param();
					}
				}

				}
				break;
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
	public static class MnemonicContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(riscvasm.IDENTIFIER, 0); }
		public MnemonicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic; }
	}

	public final MnemonicContext mnemonic() throws RecognitionException {
		MnemonicContext _localctx = new MnemonicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mnemonic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(IDENTIFIER);
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
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(riscvasm.IDENTIFIER, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(IDENTIFIER);
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
		"\u0004\u0001\u00a34\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0005\u0000\f\b\u0000\n\u0000\f\u0000\u000f\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u0013\b\u0000\n\u0000\f\u0000\u0016\t\u0000\u0001"+
		"\u0000\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000"+
		"\u0005\u0000\u001f\b\u0000\n\u0000\f\u0000\"\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002,\b\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000\u0005\u0000\u0002\u0004"+
		"\u0006\b\u0000\u00004\u0000\r\u0001\u0000\u0000\u0000\u0002%\u0001\u0000"+
		"\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006/\u0001\u0000\u0000"+
		"\u0000\b1\u0001\u0000\u0000\u0000\n\f\u0005\u0098\u0000\u0000\u000b\n"+
		"\u0001\u0000\u0000\u0000\f\u000f\u0001\u0000\u0000\u0000\r\u000b\u0001"+
		"\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u0010\u0001\u0000"+
		"\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u0010\u001a\u0003\u0002\u0001"+
		"\u0000\u0011\u0013\u0005\u0098\u0000\u0000\u0012\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0016\u0001\u0000\u0000\u0000\u0014\u0012\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0017\u0001\u0000\u0000"+
		"\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0017\u0019\u0003\u0002\u0001"+
		"\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000"+
		"\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000"+
		"\u0000\u001b \u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0005\u0098\u0000\u0000\u001e\u001d\u0001\u0000\u0000\u0000"+
		"\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"#$\u0005\u0000\u0000\u0001$\u0001\u0001\u0000\u0000\u0000%&\u0003\u0004"+
		"\u0002\u0000&\u0003\u0001\u0000\u0000\u0000\'-\u0003\u0006\u0003\u0000"+
		"(+\u0003\b\u0004\u0000)*\u0005~\u0000\u0000*,\u0003\b\u0004\u0000+)\u0001"+
		"\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000"+
		"-(\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000"+
		"\u0000\u0000/0\u0005\u00a3\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"12\u0005\u00a3\u0000\u00002\t\u0001\u0000\u0000\u0000\u0006\r\u0014\u001a"+
		" +-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}