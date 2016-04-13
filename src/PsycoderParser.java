// Generated from src/Psycoder.g4 by ANTLR 4.5.3
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
		RULE_expression = 31, RULE_primary = 32, RULE_identifier_id = 33, RULE_identifier_id_pri = 34, 
		RULE_identifier = 35, RULE_identifier_pri = 36, RULE_terminal_value = 37;
	public static final String[] ruleNames = {
		"program", "element", "function_declaration", "params", "mandatory_params", 
		"mandatory_params_pri", "assign", "assign_pri", "assign_pri_pri", "assign_id", 
		"assign_special", "assign_fun", "args_fun", "args_fun_pri", "type", "declaration", 
		"if_declaration", "read_declaration", "print_declaration", "while_declaration", 
		"for_declaration", "dowhile_declaration", "switch_declaration", "break_declaration", 
		"return_declaration", "declaration_if", "end_loop", "str_struct", "str_struct_pri", 
		"case_l", "cmp_declaration", "expression", "primary", "identifier_id", 
		"identifier_id_pri", "identifier", "identifier_pri", "terminal_value"
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
			setState(88);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(76);
					element();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(T__0);
				setState(83);
				cmp_declaration();
				setState(84);
				match(T__1);
				setState(85);
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
			setState(97);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(T__2);
				setState(91);
				function_declaration();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(T__3);
				setState(93);
				match(ID);
				setState(94);
				cmp_declaration();
				setState(95);
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
			setState(99);
			type();
			setState(100);
			match(ID);
			setState(101);
			match(T__5);
			setState(102);
			params();
			setState(103);
			match(T__6);
			setState(104);
			match(T__7);
			setState(105);
			cmp_declaration();
			setState(106);
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
			setState(110);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
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
			setState(112);
			type();
			setState(113);
			match(ID);
			setState(114);
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
			setState(119);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__9);
				setState(117);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				type();
				setState(122);
				match(ID);
				setState(123);
				assign_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(ID);
				setState(126);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__10);
				setState(130);
				expression(0);
				setState(131);
				assign_pri_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
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
			setState(141);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__9);
				setState(138);
				match(ID);
				setState(139);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__10);
				setState(144);
				expression(0);
				setState(145);
				assign_pri_pri();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
			setState(155);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__10);
				setState(152);
				expression(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(ID);
				setState(154);
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
			setState(162);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__5);
				setState(158);
				args_fun();
				setState(159);
				match(T__6);
				}
				break;
			case T__10:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
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
			setState(168);
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
				setState(164);
				expression(0);
				setState(165);
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
			setState(175);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__9);
				setState(171);
				expression(0);
				setState(172);
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
			setState(177);
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
			setState(191);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				assign();
				setState(180);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				if_declaration();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
				read_declaration();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				print_declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				while_declaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				for_declaration();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(187);
				dowhile_declaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(188);
				switch_declaration();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 9);
				{
				setState(189);
				break_declaration();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 10);
				{
				setState(190);
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
			setState(193);
			match(T__17);
			setState(194);
			match(T__5);
			setState(195);
			expression(0);
			setState(196);
			match(T__6);
			setState(197);
			match(T__18);
			setState(198);
			cmp_declaration();
			setState(199);
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
			setState(201);
			match(T__19);
			setState(202);
			match(T__5);
			setState(203);
			identifier();
			setState(204);
			match(T__6);
			setState(205);
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
			setState(207);
			match(T__20);
			setState(208);
			match(T__5);
			setState(209);
			str_struct();
			setState(210);
			match(T__6);
			setState(211);
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
			setState(213);
			match(T__21);
			setState(214);
			match(T__5);
			setState(215);
			expression(0);
			setState(216);
			match(T__6);
			setState(217);
			match(T__7);
			setState(218);
			cmp_declaration();
			setState(219);
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
			setState(221);
			match(T__23);
			setState(222);
			match(T__5);
			setState(223);
			assign();
			setState(224);
			match(T__16);
			setState(225);
			expression(0);
			setState(226);
			match(T__16);
			setState(227);
			end_loop();
			setState(228);
			match(T__6);
			setState(229);
			match(T__7);
			setState(230);
			cmp_declaration();
			setState(231);
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
			setState(233);
			match(T__7);
			setState(234);
			cmp_declaration();
			setState(235);
			match(T__21);
			setState(236);
			match(T__5);
			setState(237);
			expression(0);
			setState(238);
			match(T__6);
			setState(239);
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
			setState(241);
			match(T__25);
			setState(242);
			match(T__5);
			setState(243);
			identifier();
			setState(244);
			match(T__6);
			setState(245);
			match(T__26);
			setState(246);
			case_l();
			setState(247);
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
			setState(249);
			match(T__28);
			setState(250);
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
			setState(252);
			match(T__29);
			setState(253);
			expression(0);
			setState(254);
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
			setState(261);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__30);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__31);
				setState(258);
				cmp_declaration();
				setState(259);
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
			setState(263);
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
			setState(265);
			expression(0);
			setState(266);
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
			setState(271);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__9);
				setState(269);
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
			setState(283);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(T__32);
				setState(274);
				terminal_value();
				setState(275);
				match(T__33);
				setState(276);
				cmp_declaration();
				setState(277);
				case_l();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__34);
				setState(280);
				match(T__33);
				setState(281);
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
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				declaration();
				setState(286);
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
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Args_funContext args_fun() {
			return getRuleContext(Args_funContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitExpression(this);
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
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(292);
				primary();
				}
				break;
			case 2:
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__5);
				setState(295);
				args_fun();
				setState(296);
				match(T__6);
				}
				break;
			case 3:
				{
				setState(298);
				match(T__36);
				setState(299);
				expression(8);
				}
				break;
			case 4:
				{
				setState(300);
				identifier();
				setState(301);
				match(T__10);
				setState(302);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(306);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(307);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(308);
						expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(309);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(310);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(311);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(312);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(313);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(314);
						expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(315);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(316);
						_la = _input.LA(1);
						if ( !(_la==T__46 || _la==T__47) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(317);
						expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319);
						match(T__48);
						setState(320);
						expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(321);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(322);
						match(T__49);
						setState(323);
						expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(325);
						match(T__35);
						setState(326);
						identifier();
						}
						break;
					}
					} 
				}
				setState(331);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Terminal_valueContext terminal_value() {
			return getRuleContext(Terminal_valueContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_primary);
		try {
			setState(337);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__5);
				setState(333);
				expression(0);
				setState(334);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
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
		enterRule(_localctx, 66, RULE_identifier_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ID);
			setState(340);
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
		enterRule(_localctx, 68, RULE_identifier_id_pri);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__35);
				setState(343);
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
		enterRule(_localctx, 70, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ID);
			setState(348);
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
		enterRule(_localctx, 72, RULE_identifier_pri);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(T__35);
				setState(351);
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
		enterRule(_localctx, 74, RULE_terminal_value);
		try {
			setState(362);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Id_terminalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				identifier();
				}
				break;
			case TK_ENTERO:
				_localctx = new Entero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(TK_ENTERO);
				}
				break;
			case TK_REAL:
				_localctx = new Real_terminalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(357);
				match(TK_REAL);
				}
				break;
			case TK_CADENA:
				_localctx = new Cadena_terminalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(358);
				match(TK_CADENA);
				}
				break;
			case TK_CARACTER:
				_localctx = new Caracter_terminalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(359);
				match(TK_CARACTER);
				}
				break;
			case T__50:
				_localctx = new Verdadero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(360);
				match(T__50);
				}
				break;
			case T__51:
				_localctx = new Falso_terminalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
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
		case 6:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u016f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2[\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3d\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5q\n\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\3\f\5\f\u009e\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\16\5\16\u00ab\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00b2\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u0108\n\33\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\5\36\u0112\n\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u011e\n\37\3 \3 \3 \3 \5 \u0124\n \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0133\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u014a\n!\f!\16!\u014d\13!\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u0154\n\"\3#\3#\3#\3$\3$\3$\5$\u015c\n$\3%\3%\3%"+
		"\3&\3&\3&\5&\u0164\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016d\n\'\3\'\2"+
		"\3@(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@"+
		"BDFHJL\2\b\4\2\16\22::\3\2:<\3\2(*\3\2+,\3\2-\60\3\2\61\62\u0178\2Z\3"+
		"\2\2\2\4c\3\2\2\2\6e\3\2\2\2\bp\3\2\2\2\nr\3\2\2\2\fy\3\2\2\2\16\u0081"+
		"\3\2\2\2\20\u0089\3\2\2\2\22\u008f\3\2\2\2\24\u0097\3\2\2\2\26\u009d\3"+
		"\2\2\2\30\u00a4\3\2\2\2\32\u00aa\3\2\2\2\34\u00b1\3\2\2\2\36\u00b3\3\2"+
		"\2\2 \u00c1\3\2\2\2\"\u00c3\3\2\2\2$\u00cb\3\2\2\2&\u00d1\3\2\2\2(\u00d7"+
		"\3\2\2\2*\u00df\3\2\2\2,\u00eb\3\2\2\2.\u00f3\3\2\2\2\60\u00fb\3\2\2\2"+
		"\62\u00fe\3\2\2\2\64\u0107\3\2\2\2\66\u0109\3\2\2\28\u010b\3\2\2\2:\u0111"+
		"\3\2\2\2<\u011d\3\2\2\2>\u0123\3\2\2\2@\u0132\3\2\2\2B\u0153\3\2\2\2D"+
		"\u0155\3\2\2\2F\u015b\3\2\2\2H\u015d\3\2\2\2J\u0163\3\2\2\2L\u016c\3\2"+
		"\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TU\7\3\2\2UV\5> \2VW\7\4\2\2WX\7\2\2\3X[\3\2\2\2Y[\3\2\2\2ZQ\3\2\2"+
		"\2ZY\3\2\2\2[\3\3\2\2\2\\]\7\5\2\2]d\5\6\4\2^_\7\6\2\2_`\7:\2\2`a\5> "+
		"\2ab\7\7\2\2bd\3\2\2\2c\\\3\2\2\2c^\3\2\2\2d\5\3\2\2\2ef\5\36\20\2fg\7"+
		":\2\2gh\7\b\2\2hi\5\b\5\2ij\7\t\2\2jk\7\n\2\2kl\5> \2lm\7\13\2\2m\7\3"+
		"\2\2\2nq\5\n\6\2oq\3\2\2\2pn\3\2\2\2po\3\2\2\2q\t\3\2\2\2rs\5\36\20\2"+
		"st\7:\2\2tu\5\f\7\2u\13\3\2\2\2vw\7\f\2\2wz\5\n\6\2xz\3\2\2\2yv\3\2\2"+
		"\2yx\3\2\2\2z\r\3\2\2\2{|\5\36\20\2|}\7:\2\2}~\5\20\t\2~\u0082\3\2\2\2"+
		"\177\u0080\7:\2\2\u0080\u0082\5\20\t\2\u0081{\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0082\17\3\2\2\2\u0083\u0084\7\r\2\2\u0084\u0085\5@!\2\u0085\u0086"+
		"\5\22\n\2\u0086\u008a\3\2\2\2\u0087\u008a\5\22\n\2\u0088\u008a\3\2\2\2"+
		"\u0089\u0083\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\21"+
		"\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7:\2\2\u008d\u0090\5\24\13\2"+
		"\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23"+
		"\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0093\5@!\2\u0093\u0094\5\22\n\2\u0094"+
		"\u0098\3\2\2\2\u0095\u0098\5\22\n\2\u0096\u0098\3\2\2\2\u0097\u0091\3"+
		"\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099"+
		"\u009a\7\r\2\2\u009a\u009e\5@!\2\u009b\u009c\7:\2\2\u009c\u009e\5\20\t"+
		"\2\u009d\u0099\3\2\2\2\u009d\u009b\3\2\2\2\u009e\27\3\2\2\2\u009f\u00a0"+
		"\7\b\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\t\2\2\u00a2\u00a5\3\2\2\2"+
		"\u00a3\u00a5\5\26\f\2\u00a4\u009f\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\31"+
		"\3\2\2\2\u00a6\u00a7\5@!\2\u00a7\u00a8\5\34\17\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\33\3\2\2"+
		"\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5@!\2\u00ae\u00af\5\34\17\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00ac\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		"\35\3\2\2\2\u00b3\u00b4\t\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\5\16\b\2"+
		"\u00b6\u00b7\7\23\2\2\u00b7\u00c2\3\2\2\2\u00b8\u00c2\5\"\22\2\u00b9\u00c2"+
		"\5$\23\2\u00ba\u00c2\5&\24\2\u00bb\u00c2\5(\25\2\u00bc\u00c2\5*\26\2\u00bd"+
		"\u00c2\5,\27\2\u00be\u00c2\5.\30\2\u00bf\u00c2\5\60\31\2\u00c0\u00c2\5"+
		"\62\32\2\u00c1\u00b5\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1"+
		"\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00bd\3\2"+
		"\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"!\3\2\2\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\7\b\2\2\u00c5\u00c6\5@!\2\u00c6"+
		"\u00c7\7\t\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5> \2\u00c9\u00ca\5\64"+
		"\33\2\u00ca#\3\2\2\2\u00cb\u00cc\7\26\2\2\u00cc\u00cd\7\b\2\2\u00cd\u00ce"+
		"\5H%\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\7\23\2\2\u00d0%\3\2\2\2\u00d1\u00d2"+
		"\7\27\2\2\u00d2\u00d3\7\b\2\2\u00d3\u00d4\58\35\2\u00d4\u00d5\7\t\2\2"+
		"\u00d5\u00d6\7\23\2\2\u00d6\'\3\2\2\2\u00d7\u00d8\7\30\2\2\u00d8\u00d9"+
		"\7\b\2\2\u00d9\u00da\5@!\2\u00da\u00db\7\t\2\2\u00db\u00dc\7\n\2\2\u00dc"+
		"\u00dd\5> \2\u00dd\u00de\7\31\2\2\u00de)\3\2\2\2\u00df\u00e0\7\32\2\2"+
		"\u00e0\u00e1\7\b\2\2\u00e1\u00e2\5\16\b\2\u00e2\u00e3\7\23\2\2\u00e3\u00e4"+
		"\5@!\2\u00e4\u00e5\7\23\2\2\u00e5\u00e6\5\66\34\2\u00e6\u00e7\7\t\2\2"+
		"\u00e7\u00e8\7\n\2\2\u00e8\u00e9\5> \2\u00e9\u00ea\7\33\2\2\u00ea+\3\2"+
		"\2\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\5> \2\u00ed\u00ee\7\30\2\2\u00ee"+
		"\u00ef\7\b\2\2\u00ef\u00f0\5@!\2\u00f0\u00f1\7\t\2\2\u00f1\u00f2\7\23"+
		"\2\2\u00f2-\3\2\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6"+
		"\5H%\2\u00f6\u00f7\7\t\2\2\u00f7\u00f8\7\35\2\2\u00f8\u00f9\5<\37\2\u00f9"+
		"\u00fa\7\36\2\2\u00fa/\3\2\2\2\u00fb\u00fc\7\37\2\2\u00fc\u00fd\7\23\2"+
		"\2\u00fd\61\3\2\2\2\u00fe\u00ff\7 \2\2\u00ff\u0100\5@!\2\u0100\u0101\7"+
		"\23\2\2\u0101\63\3\2\2\2\u0102\u0108\7!\2\2\u0103\u0104\7\"\2\2\u0104"+
		"\u0105\5> \2\u0105\u0106\7!\2\2\u0106\u0108\3\2\2\2\u0107\u0102\3\2\2"+
		"\2\u0107\u0103\3\2\2\2\u0108\65\3\2\2\2\u0109\u010a\t\3\2\2\u010a\67\3"+
		"\2\2\2\u010b\u010c\5@!\2\u010c\u010d\5:\36\2\u010d9\3\2\2\2\u010e\u010f"+
		"\7\f\2\2\u010f\u0112\58\35\2\u0110\u0112\3\2\2\2\u0111\u010e\3\2\2\2\u0111"+
		"\u0110\3\2\2\2\u0112;\3\2\2\2\u0113\u0114\7#\2\2\u0114\u0115\5L\'\2\u0115"+
		"\u0116\7$\2\2\u0116\u0117\5> \2\u0117\u0118\5<\37\2\u0118\u011e\3\2\2"+
		"\2\u0119\u011a\7%\2\2\u011a\u011b\7$\2\2\u011b\u011e\5> \2\u011c\u011e"+
		"\3\2\2\2\u011d\u0113\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"=\3\2\2\2\u011f\u0120\5 \21\2\u0120\u0121\5> \2\u0121\u0124\3\2\2\2\u0122"+
		"\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0122\3\2\2\2\u0124?\3\2\2\2"+
		"\u0125\u0126\b!\1\2\u0126\u0133\5B\"\2\u0127\u0128\7:\2\2\u0128\u0129"+
		"\7\b\2\2\u0129\u012a\5\32\16\2\u012a\u012b\7\t\2\2\u012b\u0133\3\2\2\2"+
		"\u012c\u012d\7\'\2\2\u012d\u0133\5@!\n\u012e\u012f\5H%\2\u012f\u0130\7"+
		"\r\2\2\u0130\u0131\5@!\3\u0131\u0133\3\2\2\2\u0132\u0125\3\2\2\2\u0132"+
		"\u0127\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u014b\3\2"+
		"\2\2\u0134\u0135\f\t\2\2\u0135\u0136\t\4\2\2\u0136\u014a\5@!\n\u0137\u0138"+
		"\f\b\2\2\u0138\u0139\t\5\2\2\u0139\u014a\5@!\t\u013a\u013b\f\7\2\2\u013b"+
		"\u013c\t\6\2\2\u013c\u014a\5@!\b\u013d\u013e\f\6\2\2\u013e\u013f\t\7\2"+
		"\2\u013f\u014a\5@!\7\u0140\u0141\f\5\2\2\u0141\u0142\7\63\2\2\u0142\u014a"+
		"\5@!\6\u0143\u0144\f\4\2\2\u0144\u0145\7\64\2\2\u0145\u014a\5@!\5\u0146"+
		"\u0147\f\f\2\2\u0147\u0148\7&\2\2\u0148\u014a\5H%\2\u0149\u0134\3\2\2"+
		"\2\u0149\u0137\3\2\2\2\u0149\u013a\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0140"+
		"\3\2\2\2\u0149\u0143\3\2\2\2\u0149\u0146\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014cA\3\2\2\2\u014d\u014b\3\2\2\2"+
		"\u014e\u014f\7\b\2\2\u014f\u0150\5@!\2\u0150\u0151\7\t\2\2\u0151\u0154"+
		"\3\2\2\2\u0152\u0154\5L\'\2\u0153\u014e\3\2\2\2\u0153\u0152\3\2\2\2\u0154"+
		"C\3\2\2\2\u0155\u0156\7:\2\2\u0156\u0157\5F$\2\u0157E\3\2\2\2\u0158\u0159"+
		"\7&\2\2\u0159\u015c\5D#\2\u015a\u015c\3\2\2\2\u015b\u0158\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015cG\3\2\2\2\u015d\u015e\7:\2\2\u015e\u015f\5J&\2\u015f"+
		"I\3\2\2\2\u0160\u0161\7&\2\2\u0161\u0164\5H%\2\u0162\u0164\3\2\2\2\u0163"+
		"\u0160\3\2\2\2\u0163\u0162\3\2\2\2\u0164K\3\2\2\2\u0165\u016d\5H%\2\u0166"+
		"\u016d\7;\2\2\u0167\u016d\7<\2\2\u0168\u016d\7=\2\2\u0169\u016d\7>\2\2"+
		"\u016a\u016d\7\65\2\2\u016b\u016d\7\66\2\2\u016c\u0165\3\2\2\2\u016c\u0166"+
		"\3\2\2\2\u016c\u0167\3\2\2\2\u016c\u0168\3\2\2\2\u016c\u0169\3\2\2\2\u016c"+
		"\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016dM\3\2\2\2\33QZcpy\u0081\u0089"+
		"\u008f\u0097\u009d\u00a4\u00aa\u00b1\u00c1\u0107\u0111\u011d\u0123\u0132"+
		"\u0149\u014b\u0153\u015b\u0163\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}