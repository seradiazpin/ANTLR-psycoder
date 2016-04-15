// Generated from Psycoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PsycoderParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		COMMENT=53, WS=54, LineComment=55, ID=56, TK_ENTERO=57, TK_REAL=58, TK_CADENA=59, 
		TK_CARACTER=60;
	public static final int
		RULE_program = 0, RULE_element = 1, RULE_function_declaration = 2, RULE_params = 3, 
		RULE_mandatory_params = 4, RULE_mandatory_params_pri = 5, RULE_assign = 6, 
		RULE_assign_pri = 7, RULE_assign_pri_pri = 8, RULE_assign_id = 9, RULE_assign_special = 10, 
		RULE_assign_fun = 11, RULE_args_fun = 12, RULE_args_fun_pri = 13, RULE_type = 14, 
		RULE_declaration = 15, RULE_if_declaration = 16, RULE_read_declaration = 17, 
		RULE_print_declaration = 18, RULE_while_declaration = 19, RULE_for_declaration = 20, 
		RULE_dowhile_declaration = 21, RULE_switch_declaration = 22, RULE_break_declaration = 23, 
		RULE_return_declaration = 24, RULE_declaration_if = 25, RULE_end_loop = 26, 
		RULE_str_struct = 27, RULE_str_struct_pri = 28, RULE_case_l = 29, RULE_cmp_declaration = 30, 
		RULE_expression = 31, RULE_function_call = 32, RULE_primary = 33, RULE_identifier_id = 34, 
		RULE_identifier_id_pri = 35, RULE_identifier = 36, RULE_identifier_pri = 37, 
		RULE_terminal_value = 38;
	public static final String[] ruleNames = {
		"program", "element", "function_declaration", "params", "mandatory_params", 
		"mandatory_params_pri", "assign", "assign_pri", "assign_pri_pri", "assign_id", 
		"assign_special", "assign_fun", "args_fun", "args_fun_pri", "type", "declaration", 
		"if_declaration", "read_declaration", "print_declaration", "while_declaration", 
		"for_declaration", "dowhile_declaration", "switch_declaration", "break_declaration", 
		"return_declaration", "declaration_if", "end_loop", "str_struct", "str_struct_pri", 
		"case_l", "cmp_declaration", "expression", "function_call", "primary", 
		"identifier_id", "identifier_id_pri", "identifier", "identifier_pri", 
		"terminal_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'funcion_principal'", "'fin_principal'", "'funcion'", "'estructura'", 
		"'fin_estructura'", "'('", "')'", "'hacer'", "'fin_funcion'", "','", "'='", 
		"'entero'", "'real'", "'booleano'", "'cadena'", "'caracter'", "';'", "'si'", 
		"'entonces'", "'leer'", "'imprimir'", "'mientras'", "'fin_mientras'", 
		"'para'", "'fin_para'", "'seleccionar'", "'entre'", "'fin_seleccionar'", 
		"'romper'", "'retornar'", "'fin_si'", "'si_no'", "'caso'", "':'", "'defecto'", 
		"'.'", "'!'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<='", "'>='", "'>'", 
		"'<'", "'=='", "'!='", "'&&'", "'||'", "'verdadero'", "'falso'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "COMMENT", "WS", "LineComment", "ID", "TK_ENTERO", 
		"TK_REAL", "TK_CADENA", "TK_CARACTER"
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

	@Override
	public String getGrammarFileName() { return "Psycoder.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PsycoderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PsycoderParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(90);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(78);
					element();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(T__0);
				setState(85);
				cmp_declaration();
				setState(86);
				match(T__1);
				setState(87);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ElementContext extends ParserRuleContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__2);
				setState(93);
				function_declaration();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__3);
				setState(95);
				match(ID);
				setState(96);
				cmp_declaration();
				setState(97);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Function_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			type();
			setState(102);
			match(ID);
			setState(103);
			match(T__5);
			setState(104);
			params();
			setState(105);
			match(T__6);
			setState(106);
			match(T__7);
			setState(107);
			cmp_declaration();
			setState(108);
			match(T__8);
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

	public static class ParamsContext extends ParserRuleContext {
		public Mandatory_paramsContext mandatory_params() {
			return getRuleContext(Mandatory_paramsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				mandatory_params();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Mandatory_paramsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Mandatory_params_priContext mandatory_params_pri() {
			return getRuleContext(Mandatory_params_priContext.class,0);
		}
		public Mandatory_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterMandatory_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitMandatory_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitMandatory_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mandatory_paramsContext mandatory_params() throws RecognitionException {
		Mandatory_paramsContext _localctx = new Mandatory_paramsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mandatory_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			type();
			setState(115);
			match(ID);
			setState(116);
			mandatory_params_pri();
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

	public static class Mandatory_params_priContext extends ParserRuleContext {
		public Mandatory_paramsContext mandatory_params() {
			return getRuleContext(Mandatory_paramsContext.class,0);
		}
		public Mandatory_params_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory_params_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterMandatory_params_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitMandatory_params_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitMandatory_params_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mandatory_params_priContext mandatory_params_pri() throws RecognitionException {
		Mandatory_params_priContext _localctx = new Mandatory_params_priContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mandatory_params_pri);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__9);
				setState(119);
				mandatory_params();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AssignContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Assign_priContext assign_pri() {
			return getRuleContext(Assign_priContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				type();
				setState(124);
				match(ID);
				setState(125);
				assign_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(ID);
				setState(128);
				assign_pri();
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

	public static class Assign_priContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_pri_priContext assign_pri_pri() {
			return getRuleContext(Assign_pri_priContext.class,0);
		}
		public Assign_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_priContext assign_pri() throws RecognitionException {
		Assign_priContext _localctx = new Assign_priContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_pri);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(T__10);
				setState(132);
				expression(0);
				setState(133);
				assign_pri_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				assign_pri_pri();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Assign_pri_priContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Assign_idContext assign_id() {
			return getRuleContext(Assign_idContext.class,0);
		}
		public Assign_pri_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_pri_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_pri_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_pri_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_pri_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_pri_priContext assign_pri_pri() throws RecognitionException {
		Assign_pri_priContext _localctx = new Assign_pri_priContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_pri_pri);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__9);
				setState(140);
				match(ID);
				setState(141);
				assign_id();
				}
				break;
			case EOF:
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assign_idContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_pri_priContext assign_pri_pri() {
			return getRuleContext(Assign_pri_priContext.class,0);
		}
		public Assign_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_idContext assign_id() throws RecognitionException {
		Assign_idContext _localctx = new Assign_idContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_id);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__10);
				setState(146);
				expression(0);
				setState(147);
				assign_pri_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				assign_pri_pri();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Assign_specialContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Assign_priContext assign_pri() {
			return getRuleContext(Assign_priContext.class,0);
		}
		public Assign_specialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_special(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_special(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_special(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_specialContext assign_special() throws RecognitionException {
		Assign_specialContext _localctx = new Assign_specialContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_special);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__10);
				setState(154);
				expression(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(ID);
				setState(156);
				assign_pri();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assign_funContext extends ParserRuleContext {
		public Args_funContext args_fun() {
			return getRuleContext(Args_funContext.class,0);
		}
		public Assign_specialContext assign_special() {
			return getRuleContext(Assign_specialContext.class,0);
		}
		public Assign_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_funContext assign_fun() throws RecognitionException {
		Assign_funContext _localctx = new Assign_funContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_fun);
		try {
			setState(164);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__5);
				setState(160);
				args_fun();
				setState(161);
				match(T__6);
				}
				break;
			case T__10:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				assign_special();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Args_funContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Args_fun_priContext args_fun_pri() {
			return getRuleContext(Args_fun_priContext.class,0);
		}
		public Args_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterArgs_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitArgs_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitArgs_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_funContext args_fun() throws RecognitionException {
		Args_funContext _localctx = new Args_funContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_args_fun);
		try {
			setState(170);
			switch (_input.LA(1)) {
			case T__5:
			case T__36:
			case T__50:
			case T__51:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				expression(0);
				setState(167);
				args_fun_pri();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Args_fun_priContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Args_fun_priContext args_fun_pri() {
			return getRuleContext(Args_fun_priContext.class,0);
		}
		public Args_fun_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_fun_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterArgs_fun_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitArgs_fun_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitArgs_fun_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_fun_priContext args_fun_pri() throws RecognitionException {
		Args_fun_priContext _localctx = new Args_fun_priContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args_fun_pri);
		try {
			setState(177);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__9);
				setState(173);
				expression(0);
				setState(174);
				args_fun_pri();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class DeclarationContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_declarationContext if_declaration() {
			return getRuleContext(If_declarationContext.class,0);
		}
		public Read_declarationContext read_declaration() {
			return getRuleContext(Read_declarationContext.class,0);
		}
		public Print_declarationContext print_declaration() {
			return getRuleContext(Print_declarationContext.class,0);
		}
		public While_declarationContext while_declaration() {
			return getRuleContext(While_declarationContext.class,0);
		}
		public For_declarationContext for_declaration() {
			return getRuleContext(For_declarationContext.class,0);
		}
		public Dowhile_declarationContext dowhile_declaration() {
			return getRuleContext(Dowhile_declarationContext.class,0);
		}
		public Switch_declarationContext switch_declaration() {
			return getRuleContext(Switch_declarationContext.class,0);
		}
		public Break_declarationContext break_declaration() {
			return getRuleContext(Break_declarationContext.class,0);
		}
		public Return_declarationContext return_declaration() {
			return getRuleContext(Return_declarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_declaration);
		try {
			setState(193);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				assign();
				setState(182);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				if_declaration();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				read_declaration();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				print_declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
				while_declaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				for_declaration();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				dowhile_declaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(190);
				switch_declaration();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(191);
				break_declaration();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(192);
				return_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class If_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public Declaration_ifContext declaration_if() {
			return getRuleContext(Declaration_ifContext.class,0);
		}
		public If_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterIf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitIf_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitIf_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_declarationContext if_declaration() throws RecognitionException {
		If_declarationContext _localctx = new If_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__17);
			setState(196);
			match(T__5);
			setState(197);
			expression(0);
			setState(198);
			match(T__6);
			setState(199);
			match(T__18);
			setState(200);
			cmp_declaration();
			setState(201);
			declaration_if();
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

	public static class Read_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Read_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterRead_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitRead_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitRead_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_declarationContext read_declaration() throws RecognitionException {
		Read_declarationContext _localctx = new Read_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_read_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__19);
			setState(204);
			match(T__5);
			setState(205);
			identifier();
			setState(206);
			match(T__6);
			setState(207);
			match(T__16);
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

	public static class Print_declarationContext extends ParserRuleContext {
		public Str_structContext str_struct() {
			return getRuleContext(Str_structContext.class,0);
		}
		public Print_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterPrint_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitPrint_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitPrint_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_declarationContext print_declaration() throws RecognitionException {
		Print_declarationContext _localctx = new Print_declarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__20);
			setState(210);
			match(T__5);
			setState(211);
			str_struct();
			setState(212);
			match(T__6);
			setState(213);
			match(T__16);
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

	public static class While_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public While_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterWhile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitWhile_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitWhile_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_declarationContext while_declaration() throws RecognitionException {
		While_declarationContext _localctx = new While_declarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__21);
			setState(216);
			match(T__5);
			setState(217);
			expression(0);
			setState(218);
			match(T__6);
			setState(219);
			match(T__7);
			setState(220);
			cmp_declaration();
			setState(221);
			match(T__22);
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

	public static class For_declarationContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public End_loopContext end_loop() {
			return getRuleContext(End_loopContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public For_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFor_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFor_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFor_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_declarationContext for_declaration() throws RecognitionException {
		For_declarationContext _localctx = new For_declarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__23);
			setState(224);
			match(T__5);
			setState(225);
			assign();
			setState(226);
			match(T__16);
			setState(227);
			expression(0);
			setState(228);
			match(T__16);
			setState(229);
			end_loop();
			setState(230);
			match(T__6);
			setState(231);
			match(T__7);
			setState(232);
			cmp_declaration();
			setState(233);
			match(T__24);
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

	public static class Dowhile_declarationContext extends ParserRuleContext {
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Dowhile_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterDowhile_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitDowhile_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitDowhile_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dowhile_declarationContext dowhile_declaration() throws RecognitionException {
		Dowhile_declarationContext _localctx = new Dowhile_declarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dowhile_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__7);
			setState(236);
			cmp_declaration();
			setState(237);
			match(T__21);
			setState(238);
			match(T__5);
			setState(239);
			expression(0);
			setState(240);
			match(T__6);
			setState(241);
			match(T__16);
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

	public static class Switch_declarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Case_lContext case_l() {
			return getRuleContext(Case_lContext.class,0);
		}
		public Switch_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterSwitch_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitSwitch_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitSwitch_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_declarationContext switch_declaration() throws RecognitionException {
		Switch_declarationContext _localctx = new Switch_declarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switch_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__25);
			setState(244);
			match(T__5);
			setState(245);
			identifier();
			setState(246);
			match(T__6);
			setState(247);
			match(T__26);
			setState(248);
			case_l();
			setState(249);
			match(T__27);
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

	public static class Break_declarationContext extends ParserRuleContext {
		public Break_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterBreak_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitBreak_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitBreak_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_declarationContext break_declaration() throws RecognitionException {
		Break_declarationContext _localctx = new Break_declarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__28);
			setState(252);
			match(T__16);
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

	public static class Return_declarationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Return_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterReturn_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitReturn_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitReturn_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_declarationContext return_declaration() throws RecognitionException {
		Return_declarationContext _localctx = new Return_declarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_return_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__29);
			setState(255);
			expression(0);
			setState(256);
			match(T__16);
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

	public static class Declaration_ifContext extends ParserRuleContext {
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public Declaration_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterDeclaration_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitDeclaration_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitDeclaration_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaration_ifContext declaration_if() throws RecognitionException {
		Declaration_ifContext _localctx = new Declaration_ifContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaration_if);
		try {
			setState(263);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__31);
				setState(260);
				cmp_declaration();
				setState(261);
				match(T__30);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class End_loopContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public TerminalNode TK_ENTERO() { return getToken(PsycoderParser.TK_ENTERO, 0); }
		public TerminalNode TK_REAL() { return getToken(PsycoderParser.TK_REAL, 0); }
		public End_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterEnd_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitEnd_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitEnd_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_loopContext end_loop() throws RecognitionException {
		End_loopContext _localctx = new End_loopContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_end_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Str_structContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Str_struct_priContext str_struct_pri() {
			return getRuleContext(Str_struct_priContext.class,0);
		}
		public Str_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterStr_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitStr_struct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitStr_struct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_structContext str_struct() throws RecognitionException {
		Str_structContext _localctx = new Str_structContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_str_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			expression(0);
			setState(268);
			str_struct_pri();
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

	public static class Str_struct_priContext extends ParserRuleContext {
		public Str_structContext str_struct() {
			return getRuleContext(Str_structContext.class,0);
		}
		public Str_struct_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_str_struct_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterStr_struct_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitStr_struct_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitStr_struct_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Str_struct_priContext str_struct_pri() throws RecognitionException {
		Str_struct_priContext _localctx = new Str_struct_priContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_str_struct_pri);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__9);
				setState(271);
				str_struct();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Case_lContext extends ParserRuleContext {
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public Case_lContext case_l() {
			return getRuleContext(Case_lContext.class,0);
		}
		public Case_lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterCase_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitCase_l(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitCase_l(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_lContext case_l() throws RecognitionException {
		Case_lContext _localctx = new Case_lContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_case_l);
		try {
			setState(285);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(T__32);
				setState(276);
				terminal_value();
				setState(277);
				match(T__33);
				setState(278);
				cmp_declaration();
				setState(279);
				case_l();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(T__34);
				setState(282);
				match(T__33);
				setState(283);
				cmp_declaration();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Cmp_declarationContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public Cmp_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmp_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterCmp_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitCmp_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitCmp_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmp_declarationContext cmp_declaration() throws RecognitionException {
		Cmp_declarationContext _localctx = new Cmp_declarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cmp_declaration);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				declaration();
				setState(288);
				cmp_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class MultiplicationExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultiplicationExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterMultiplicationExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitMultiplicationExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitMultiplicationExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterEqualityExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitEqualityExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitEqualityExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDotOpExpContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionDotOpExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFunctionDotOpExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFunctionDotOpExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFunctionDotOpExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExpContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitPrimaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterNegExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitNegExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitNegExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterRelationalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitRelationalExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitRelationalExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AdditionExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAdditionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAdditionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAdditionExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssigExpContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssigExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssigExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssigExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssigExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExpContext extends ExpressionContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public FunctionExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFunctionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFunctionExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFunctionExp(this);
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
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(294);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new FunctionDotOpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				function_call();
				setState(296);
				match(T__35);
				setState(297);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new FunctionExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				function_call();
				}
				break;
			case 4:
				{
				_localctx = new NegExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(T__36);
				setState(301);
				expression(8);
				}
				break;
			case 5:
				{
				_localctx = new AssigExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				identifier();
				setState(303);
				match(T__10);
				setState(304);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(308);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(309);
						((MultiplicationExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
							((MultiplicationExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(310);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new AdditionExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(312);
						((AdditionExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
							((AdditionExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(313);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(314);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(315);
						((RelationalExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
							((RelationalExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(316);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(317);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(318);
						((EqualityExpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
							((EqualityExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(319);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new AndExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(320);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(321);
						match(T__48);
						setState(322);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(323);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(324);
						match(T__49);
						setState(325);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Args_funContext args_fun() {
			return getRuleContext(Args_funContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(ID);
			setState(332);
			match(T__5);
			setState(333);
			args_fun();
			setState(334);
			match(T__6);
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

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TerminalPriExpContext extends PrimaryContext {
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public TerminalPriExpContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterTerminalPriExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitTerminalPriExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitTerminalPriExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenPriExpContext extends PrimaryContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenPriExpContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterParenPriExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitParenPriExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitParenPriExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_primary);
		try {
			setState(341);
			switch (_input.LA(1)) {
			case T__5:
				_localctx = new ParenPriExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__5);
				setState(337);
				expression(0);
				setState(338);
				match(T__6);
				}
				break;
			case T__50:
			case T__51:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
				_localctx = new TerminalPriExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				terminal_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Identifier_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Identifier_id_priContext identifier_id_pri() {
			return getRuleContext(Identifier_id_priContext.class,0);
		}
		public Identifier_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterIdentifier_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitIdentifier_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitIdentifier_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_idContext identifier_id() throws RecognitionException {
		Identifier_idContext _localctx = new Identifier_idContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_identifier_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			identifier_id_pri();
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

	public static class Identifier_id_priContext extends ParserRuleContext {
		public Identifier_idContext identifier_id() {
			return getRuleContext(Identifier_idContext.class,0);
		}
		public Identifier_id_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_id_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterIdentifier_id_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitIdentifier_id_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitIdentifier_id_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_id_priContext identifier_id_pri() throws RecognitionException {
		Identifier_id_priContext _localctx = new Identifier_id_priContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_identifier_id_pri);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__35);
				setState(347);
				identifier_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Identifier_priContext identifier_pri() {
			return getRuleContext(Identifier_priContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(ID);
			setState(352);
			identifier_pri();
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

	public static class Identifier_priContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Identifier_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterIdentifier_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitIdentifier_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitIdentifier_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_priContext identifier_pri() throws RecognitionException {
		Identifier_priContext _localctx = new Identifier_priContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_identifier_pri);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T__35);
				setState(355);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Terminal_valueContext extends ParserRuleContext {
		public Terminal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_value; }
	 
		public Terminal_valueContext() { }
		public void copyFrom(Terminal_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Real_terminalContext extends Terminal_valueContext {
		public TerminalNode TK_REAL() { return getToken(PsycoderParser.TK_REAL, 0); }
		public Real_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterReal_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitReal_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitReal_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Cadena_terminalContext extends Terminal_valueContext {
		public TerminalNode TK_CADENA() { return getToken(PsycoderParser.TK_CADENA, 0); }
		public Cadena_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterCadena_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitCadena_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitCadena_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Falso_terminalContext extends Terminal_valueContext {
		public Falso_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFalso_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFalso_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFalso_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Id_terminalContext extends Terminal_valueContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Id_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterId_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitId_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitId_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Caracter_terminalContext extends Terminal_valueContext {
		public TerminalNode TK_CARACTER() { return getToken(PsycoderParser.TK_CARACTER, 0); }
		public Caracter_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterCaracter_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitCaracter_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitCaracter_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Verdadero_terminalContext extends Terminal_valueContext {
		public Verdadero_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterVerdadero_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitVerdadero_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitVerdadero_terminal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entero_terminalContext extends Terminal_valueContext {
		public TerminalNode TK_ENTERO() { return getToken(PsycoderParser.TK_ENTERO, 0); }
		public Entero_terminalContext(Terminal_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterEntero_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitEntero_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitEntero_terminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Terminal_valueContext terminal_value() throws RecognitionException {
		Terminal_valueContext _localctx = new Terminal_valueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_terminal_value);
		try {
			setState(366);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Id_terminalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				identifier();
				}
				break;
			case TK_ENTERO:
				_localctx = new Entero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				match(TK_ENTERO);
				}
				break;
			case TK_REAL:
				_localctx = new Real_terminalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(TK_REAL);
				}
				break;
			case TK_CADENA:
				_localctx = new Cadena_terminalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				match(TK_CADENA);
				}
				break;
			case TK_CARACTER:
				_localctx = new Caracter_terminalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(TK_CARACTER);
				}
				break;
			case T__50:
				_localctx = new Verdadero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new Falso_terminalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				match(T__51);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 31:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0173\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5s\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\5\f\u00a0\n"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a7\n\r\3\16\3\16\3\16\3\16\5\16\u00ad\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c4\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u010a\n\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36\u0114\n\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0120\n\37\3 \3 \3 \3 \5 \u0126\n"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0135\n!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0149\n!\f!\16!\u014c\13!\3\""+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0158\n#\3$\3$\3$\3%\3%\3%\5%\u0160"+
		"\n%\3&\3&\3&\3\'\3\'\3\'\5\'\u0168\n\'\3(\3(\3(\3(\3(\3(\3(\5(\u0171\n"+
		"(\3(\2\3@)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLN\2\b\4\2\16\22::\3\2:<\3\2(*\3\2+,\3\2-\60\3\2\61\62\u017b"+
		"\2\\\3\2\2\2\4e\3\2\2\2\6g\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f{\3\2\2\2\16"+
		"\u0083\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2\2\2\24\u0099\3\2\2\2\26\u009f"+
		"\3\2\2\2\30\u00a6\3\2\2\2\32\u00ac\3\2\2\2\34\u00b3\3\2\2\2\36\u00b5\3"+
		"\2\2\2 \u00c3\3\2\2\2\"\u00c5\3\2\2\2$\u00cd\3\2\2\2&\u00d3\3\2\2\2(\u00d9"+
		"\3\2\2\2*\u00e1\3\2\2\2,\u00ed\3\2\2\2.\u00f5\3\2\2\2\60\u00fd\3\2\2\2"+
		"\62\u0100\3\2\2\2\64\u0109\3\2\2\2\66\u010b\3\2\2\28\u010d\3\2\2\2:\u0113"+
		"\3\2\2\2<\u011f\3\2\2\2>\u0125\3\2\2\2@\u0134\3\2\2\2B\u014d\3\2\2\2D"+
		"\u0157\3\2\2\2F\u0159\3\2\2\2H\u015f\3\2\2\2J\u0161\3\2\2\2L\u0167\3\2"+
		"\2\2N\u0170\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7\3\2\2WX\5> \2XY\7\4\2\2YZ\7\2\2\3Z]\3\2\2\2["+
		"]\3\2\2\2\\S\3\2\2\2\\[\3\2\2\2]\3\3\2\2\2^_\7\5\2\2_f\5\6\4\2`a\7\6\2"+
		"\2ab\7:\2\2bc\5> \2cd\7\7\2\2df\3\2\2\2e^\3\2\2\2e`\3\2\2\2f\5\3\2\2\2"+
		"gh\5\36\20\2hi\7:\2\2ij\7\b\2\2jk\5\b\5\2kl\7\t\2\2lm\7\n\2\2mn\5> \2"+
		"no\7\13\2\2o\7\3\2\2\2ps\5\n\6\2qs\3\2\2\2rp\3\2\2\2rq\3\2\2\2s\t\3\2"+
		"\2\2tu\5\36\20\2uv\7:\2\2vw\5\f\7\2w\13\3\2\2\2xy\7\f\2\2y|\5\n\6\2z|"+
		"\3\2\2\2{x\3\2\2\2{z\3\2\2\2|\r\3\2\2\2}~\5\36\20\2~\177\7:\2\2\177\u0080"+
		"\5\20\t\2\u0080\u0084\3\2\2\2\u0081\u0082\7:\2\2\u0082\u0084\5\20\t\2"+
		"\u0083}\3\2\2\2\u0083\u0081\3\2\2\2\u0084\17\3\2\2\2\u0085\u0086\7\r\2"+
		"\2\u0086\u0087\5@!\2\u0087\u0088\5\22\n\2\u0088\u008c\3\2\2\2\u0089\u008c"+
		"\5\22\n\2\u008a\u008c\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0089\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d\u008e\7\f\2\2\u008e\u008f"+
		"\7:\2\2\u008f\u0092\5\24\13\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0094\7\r\2\2\u0094\u0095"+
		"\5@!\2\u0095\u0096\5\22\n\2\u0096\u009a\3\2\2\2\u0097\u009a\5\22\n\2\u0098"+
		"\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\25\3\2\2\2\u009b\u009c\7\r\2\2\u009c\u00a0\5@!\2\u009d\u009e"+
		"\7:\2\2\u009e\u00a0\5\20\t\2\u009f\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5\32\16\2\u00a3\u00a4\7\t"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\5@!\2\u00a9\u00aa\5\34\17"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\33\3\2\2\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5@!\2\u00b0"+
		"\u00b1\5\34\17\2\u00b1\u00b4\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3"+
		"\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\35\3\2\2\2\u00b5\u00b6\t\2\2\2\u00b6"+
		"\37\3\2\2\2\u00b7\u00b8\5\16\b\2\u00b8\u00b9\7\23\2\2\u00b9\u00c4\3\2"+
		"\2\2\u00ba\u00c4\5\"\22\2\u00bb\u00c4\5$\23\2\u00bc\u00c4\5&\24\2\u00bd"+
		"\u00c4\5(\25\2\u00be\u00c4\5*\26\2\u00bf\u00c4\5,\27\2\u00c0\u00c4\5."+
		"\30\2\u00c1\u00c4\5\60\31\2\u00c2\u00c4\5\62\32\2\u00c3\u00b7\3\2\2\2"+
		"\u00c3\u00ba\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3\u00bc\3\2\2\2\u00c3\u00bd"+
		"\3\2\2\2\u00c3\u00be\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7\24\2\2"+
		"\u00c6\u00c7\7\b\2\2\u00c7\u00c8\5@!\2\u00c8\u00c9\7\t\2\2\u00c9\u00ca"+
		"\7\25\2\2\u00ca\u00cb\5> \2\u00cb\u00cc\5\64\33\2\u00cc#\3\2\2\2\u00cd"+
		"\u00ce\7\26\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\5J&\2\u00d0\u00d1\7\t"+
		"\2\2\u00d1\u00d2\7\23\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7\27\2\2\u00d4\u00d5"+
		"\7\b\2\2\u00d5\u00d6\58\35\2\u00d6\u00d7\7\t\2\2\u00d7\u00d8\7\23\2\2"+
		"\u00d8\'\3\2\2\2\u00d9\u00da\7\30\2\2\u00da\u00db\7\b\2\2\u00db\u00dc"+
		"\5@!\2\u00dc\u00dd\7\t\2\2\u00dd\u00de\7\n\2\2\u00de\u00df\5> \2\u00df"+
		"\u00e0\7\31\2\2\u00e0)\3\2\2\2\u00e1\u00e2\7\32\2\2\u00e2\u00e3\7\b\2"+
		"\2\u00e3\u00e4\5\16\b\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6\5@!\2\u00e6\u00e7"+
		"\7\23\2\2\u00e7\u00e8\5\66\34\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\7\n\2"+
		"\2\u00ea\u00eb\5> \2\u00eb\u00ec\7\33\2\2\u00ec+\3\2\2\2\u00ed\u00ee\7"+
		"\n\2\2\u00ee\u00ef\5> \2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\7\b\2\2\u00f1"+
		"\u00f2\5@!\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\7\23\2\2\u00f4-\3\2\2\2\u00f5"+
		"\u00f6\7\34\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\5J&\2\u00f8\u00f9\7\t"+
		"\2\2\u00f9\u00fa\7\35\2\2\u00fa\u00fb\5<\37\2\u00fb\u00fc\7\36\2\2\u00fc"+
		"/\3\2\2\2\u00fd\u00fe\7\37\2\2\u00fe\u00ff\7\23\2\2\u00ff\61\3\2\2\2\u0100"+
		"\u0101\7 \2\2\u0101\u0102\5@!\2\u0102\u0103\7\23\2\2\u0103\63\3\2\2\2"+
		"\u0104\u010a\7!\2\2\u0105\u0106\7\"\2\2\u0106\u0107\5> \2\u0107\u0108"+
		"\7!\2\2\u0108\u010a\3\2\2\2\u0109\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u010a"+
		"\65\3\2\2\2\u010b\u010c\t\3\2\2\u010c\67\3\2\2\2\u010d\u010e\5@!\2\u010e"+
		"\u010f\5:\36\2\u010f9\3\2\2\2\u0110\u0111\7\f\2\2\u0111\u0114\58\35\2"+
		"\u0112\u0114\3\2\2\2\u0113\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114;\3"+
		"\2\2\2\u0115\u0116\7#\2\2\u0116\u0117\5N(\2\u0117\u0118\7$\2\2\u0118\u0119"+
		"\5> \2\u0119\u011a\5<\37\2\u011a\u0120\3\2\2\2\u011b\u011c\7%\2\2\u011c"+
		"\u011d\7$\2\2\u011d\u0120\5> \2\u011e\u0120\3\2\2\2\u011f\u0115\3\2\2"+
		"\2\u011f\u011b\3\2\2\2\u011f\u011e\3\2\2\2\u0120=\3\2\2\2\u0121\u0122"+
		"\5 \21\2\u0122\u0123\5> \2\u0123\u0126\3\2\2\2\u0124\u0126\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0124\3\2\2\2\u0126?\3\2\2\2\u0127\u0128\b!\1\2\u0128"+
		"\u0135\5D#\2\u0129\u012a\5B\"\2\u012a\u012b\7&\2\2\u012b\u012c\5J&\2\u012c"+
		"\u0135\3\2\2\2\u012d\u0135\5B\"\2\u012e\u012f\7\'\2\2\u012f\u0135\5@!"+
		"\n\u0130\u0131\5J&\2\u0131\u0132\7\r\2\2\u0132\u0133\5@!\3\u0133\u0135"+
		"\3\2\2\2\u0134\u0127\3\2\2\2\u0134\u0129\3\2\2\2\u0134\u012d\3\2\2\2\u0134"+
		"\u012e\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u014a\3\2\2\2\u0136\u0137\f\t"+
		"\2\2\u0137\u0138\t\4\2\2\u0138\u0149\5@!\n\u0139\u013a\f\b\2\2\u013a\u013b"+
		"\t\5\2\2\u013b\u0149\5@!\t\u013c\u013d\f\7\2\2\u013d\u013e\t\6\2\2\u013e"+
		"\u0149\5@!\b\u013f\u0140\f\6\2\2\u0140\u0141\t\7\2\2\u0141\u0149\5@!\7"+
		"\u0142\u0143\f\5\2\2\u0143\u0144\7\63\2\2\u0144\u0149\5@!\6\u0145\u0146"+
		"\f\4\2\2\u0146\u0147\7\64\2\2\u0147\u0149\5@!\5\u0148\u0136\3\2\2\2\u0148"+
		"\u0139\3\2\2\2\u0148\u013c\3\2\2\2\u0148\u013f\3\2\2\2\u0148\u0142\3\2"+
		"\2\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014bA\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7:\2\2\u014e"+
		"\u014f\7\b\2\2\u014f\u0150\5\32\16\2\u0150\u0151\7\t\2\2\u0151C\3\2\2"+
		"\2\u0152\u0153\7\b\2\2\u0153\u0154\5@!\2\u0154\u0155\7\t\2\2\u0155\u0158"+
		"\3\2\2\2\u0156\u0158\5N(\2\u0157\u0152\3\2\2\2\u0157\u0156\3\2\2\2\u0158"+
		"E\3\2\2\2\u0159\u015a\7:\2\2\u015a\u015b\5H%\2\u015bG\3\2\2\2\u015c\u015d"+
		"\7&\2\2\u015d\u0160\5F$\2\u015e\u0160\3\2\2\2\u015f\u015c\3\2\2\2\u015f"+
		"\u015e\3\2\2\2\u0160I\3\2\2\2\u0161\u0162\7:\2\2\u0162\u0163\5L\'\2\u0163"+
		"K\3\2\2\2\u0164\u0165\7&\2\2\u0165\u0168\5J&\2\u0166\u0168\3\2\2\2\u0167"+
		"\u0164\3\2\2\2\u0167\u0166\3\2\2\2\u0168M\3\2\2\2\u0169\u0171\5J&\2\u016a"+
		"\u0171\7;\2\2\u016b\u0171\7<\2\2\u016c\u0171\7=\2\2\u016d\u0171\7>\2\2"+
		"\u016e\u0171\7\65\2\2\u016f\u0171\7\66\2\2\u0170\u0169\3\2\2\2\u0170\u016a"+
		"\3\2\2\2\u0170\u016b\3\2\2\2\u0170\u016c\3\2\2\2\u0170\u016d\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u016f\3\2\2\2\u0171O\3\2\2\2\33S\\er{\u0083\u008b"+
		"\u0091\u0099\u009f\u00a6\u00ac\u00b3\u00c3\u0109\u0113\u011f\u0125\u0134"+
		"\u0148\u014a\u0157\u015f\u0167\u0170";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}