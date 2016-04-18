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
		COMMENT=46, WS=47, LineComment=48, ID=49, TK_ENTERO=50, TK_REAL=51, TK_CADENA=52, 
		TK_CARACTER=53, EQ=54, NEQ=55, GT=56, LT=57, GTEQ=58, LTEQ=59, MINUS=60;
	public static final int
		RULE_program = 0, RULE_element = 1, RULE_struct_declaration = 2, RULE_function_declaration = 3, 
		RULE_params = 4, RULE_mandatory_params = 5, RULE_mandatory_params_pri = 6, 
		RULE_assign = 7, RULE_assign_type = 8, RULE_assign_type_pri = 9, RULE_assign_id = 10, 
		RULE_assign_id_pri = 11, RULE_type = 12, RULE_declaration = 13, RULE_if_declaration = 14, 
		RULE_read_declaration = 15, RULE_print_declaration = 16, RULE_while_declaration = 17, 
		RULE_for_declaration = 18, RULE_dowhile_declaration = 19, RULE_switch_declaration = 20, 
		RULE_break_declaration = 21, RULE_return_declaration = 22, RULE_declaration_if = 23, 
		RULE_end_loop = 24, RULE_str_struct = 25, RULE_str_struct_pri = 26, RULE_cmp_declaration = 27, 
		RULE_expression = 28, RULE_expression_bool = 29, RULE_expression_rel = 30, 
		RULE_expression_addition = 31, RULE_expression_product = 32, RULE_primary = 33, 
		RULE_function_call = 34, RULE_args_fun = 35, RULE_args_fun_pri = 36, RULE_identifier = 37, 
		RULE_terminal_value = 38;
	public static final String[] ruleNames = {
		"program", "element", "struct_declaration", "function_declaration", "params", 
		"mandatory_params", "mandatory_params_pri", "assign", "assign_type", "assign_type_pri", 
		"assign_id", "assign_id_pri", "type", "declaration", "if_declaration", 
		"read_declaration", "print_declaration", "while_declaration", "for_declaration", 
		"dowhile_declaration", "switch_declaration", "break_declaration", "return_declaration", 
		"declaration_if", "end_loop", "str_struct", "str_struct_pri", "cmp_declaration", 
		"expression", "expression_bool", "expression_rel", "expression_addition", 
		"expression_product", "primary", "function_call", "args_fun", "args_fun_pri", 
		"identifier", "terminal_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'funcion_principal'", "'fin_principal'", "'funcion'", "'estructura'", 
		"'fin_estructura'", "';'", "'('", "')'", "'hacer'", "'fin_funcion'", "','", 
		"'='", "'entero'", "'real'", "'booleano'", "'cadena'", "'caracter'", "'si'", 
		"'entonces'", "'leer'", "'imprimir'", "'mientras'", "'fin_mientras'", 
		"'para'", "'fin_para'", "'seleccionar'", "'entre'", "'caso'", "':'", "'defecto'", 
		"'fin_seleccionar'", "'romper'", "'retornar'", "'fin_si'", "'si_no'", 
		"'||'", "'.'", "'&&'", "'!'", "'+'", "'*'", "'/'", "'%'", "'verdadero'", 
		"'falso'", null, null, null, null, null, null, null, null, "'=='", "'!='", 
		"'>'", "'<'", "'>='", "'<='", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"WS", "LineComment", "ID", "TK_ENTERO", "TK_REAL", "TK_CADENA", "TK_CARACTER", 
		"EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "MINUS"
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
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionElementContext extends ElementContext {
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public FunctionElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterFunctionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitFunctionElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitFunctionElement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructElementContext extends ElementContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Struct_declarationContext struct_declaration() {
			return getRuleContext(Struct_declarationContext.class,0);
		}
		public StructElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterStructElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitStructElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitStructElement(this);
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
				_localctx = new FunctionElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__2);
				setState(93);
				function_declaration();
				}
				break;
			case T__3:
				_localctx = new StructElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__3);
				setState(95);
				match(ID);
				setState(96);
				struct_declaration();
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

	public static class Struct_declarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PsycoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsycoderParser.ID, i);
		}
		public Struct_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterStruct_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitStruct_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitStruct_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_declarationContext struct_declaration() throws RecognitionException {
		Struct_declarationContext _localctx = new Struct_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_struct_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(101);
				type();
				setState(102);
				match(ID);
				setState(103);
				match(T__5);
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0) );
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
		enterRule(_localctx, 6, RULE_function_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			type();
			setState(110);
			match(ID);
			setState(111);
			match(T__6);
			setState(112);
			params();
			setState(113);
			match(T__7);
			setState(114);
			match(T__8);
			setState(115);
			cmp_declaration();
			setState(116);
			match(T__9);
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
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) {
				{
				setState(118);
				mandatory_params();
				}
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
		enterRule(_localctx, 10, RULE_mandatory_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			type();
			setState(122);
			match(ID);
			setState(123);
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
		enterRule(_localctx, 12, RULE_mandatory_params_pri);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__10);
				setState(126);
				mandatory_params();
				}
				break;
			case T__7:
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
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnTypedAssignContext extends AssignContext {
		public Assign_idContext assign_id() {
			return getRuleContext(Assign_idContext.class,0);
		}
		public UnTypedAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterUnTypedAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitUnTypedAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitUnTypedAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypedAssignContext extends AssignContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Assign_typeContext assign_type() {
			return getRuleContext(Assign_typeContext.class,0);
		}
		public TypedAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterTypedAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitTypedAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitTypedAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new TypedAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				type();
				setState(131);
				assign_type();
				}
				break;
			case 2:
				_localctx = new UnTypedAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				assign_id();
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

	public static class Assign_typeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public Assign_type_priContext assign_type_pri() {
			return getRuleContext(Assign_type_priContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_typeContext assign_type() throws RecognitionException {
		Assign_typeContext _localctx = new Assign_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			setState(139);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(137);
				match(T__11);
				setState(138);
				expression(0);
				}
			}

			setState(141);
			assign_type_pri();
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

	public static class Assign_type_priContext extends ParserRuleContext {
		public Assign_typeContext assign_type() {
			return getRuleContext(Assign_typeContext.class,0);
		}
		public Assign_type_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_type_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_type_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_type_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_type_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_type_priContext assign_type_pri() throws RecognitionException {
		Assign_type_priContext _localctx = new Assign_type_priContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_type_pri);
		try {
			setState(146);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__10);
				setState(144);
				assign_type();
				}
				break;
			case T__5:
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_id_priContext assign_id_pri() {
			return getRuleContext(Assign_id_priContext.class,0);
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
		enterRule(_localctx, 20, RULE_assign_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			identifier();
			setState(149);
			match(T__11);
			setState(150);
			expression(0);
			setState(151);
			assign_id_pri();
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

	public static class Assign_id_priContext extends ParserRuleContext {
		public Assign_idContext assign_id() {
			return getRuleContext(Assign_idContext.class,0);
		}
		public Assign_id_priContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_id_pri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssign_id_pri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssign_id_pri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssign_id_pri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_id_priContext assign_id_pri() throws RecognitionException {
		Assign_id_priContext _localctx = new Assign_id_priContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_id_pri);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__10);
				setState(154);
				assign_id();
				}
				break;
			case T__5:
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
		enterRule(_localctx, 24, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << ID))) != 0)) ) {
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
		public Return_declarationContext return_declaration() {
			return getRuleContext(Return_declarationContext.class,0);
		}
		public Break_declarationContext break_declaration() {
			return getRuleContext(Break_declarationContext.class,0);
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
		enterRule(_localctx, 26, RULE_declaration);
		try {
			setState(172);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				assign();
				setState(161);
				match(T__5);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				if_declaration();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				read_declaration();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				print_declaration();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				while_declaration();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				for_declaration();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				dowhile_declaration();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				switch_declaration();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 9);
				{
				setState(170);
				return_declaration();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 10);
				{
				setState(171);
				break_declaration();
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
		enterRule(_localctx, 28, RULE_if_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__17);
			setState(175);
			match(T__6);
			setState(176);
			expression(0);
			setState(177);
			match(T__7);
			setState(178);
			match(T__18);
			setState(179);
			cmp_declaration();
			setState(180);
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
		enterRule(_localctx, 30, RULE_read_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__19);
			setState(183);
			match(T__6);
			setState(184);
			identifier();
			setState(185);
			match(T__7);
			setState(186);
			match(T__5);
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
		enterRule(_localctx, 32, RULE_print_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			match(T__6);
			setState(190);
			str_struct();
			setState(191);
			match(T__7);
			setState(192);
			match(T__5);
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
		enterRule(_localctx, 34, RULE_while_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__21);
			setState(195);
			match(T__6);
			setState(196);
			expression(0);
			setState(197);
			match(T__7);
			setState(198);
			match(T__8);
			setState(199);
			cmp_declaration();
			setState(200);
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
		public TerminalNode ID() { return getToken(PsycoderParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public End_loopContext end_loop() {
			return getRuleContext(End_loopContext.class,0);
		}
		public Cmp_declarationContext cmp_declaration() {
			return getRuleContext(Cmp_declarationContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		enterRule(_localctx, 36, RULE_for_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__23);
			setState(203);
			match(T__6);
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(204);
				type();
				}
				break;
			}
			setState(207);
			match(ID);
			setState(208);
			match(T__11);
			setState(209);
			expression(0);
			setState(210);
			match(T__5);
			setState(211);
			expression(0);
			setState(212);
			match(T__5);
			setState(213);
			end_loop();
			setState(214);
			match(T__7);
			setState(215);
			match(T__8);
			setState(216);
			cmp_declaration();
			setState(217);
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
		enterRule(_localctx, 38, RULE_dowhile_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(T__8);
			setState(220);
			cmp_declaration();
			setState(221);
			match(T__21);
			setState(222);
			match(T__6);
			setState(223);
			expression(0);
			setState(224);
			match(T__7);
			setState(225);
			match(T__5);
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
		public List<Terminal_valueContext> terminal_value() {
			return getRuleContexts(Terminal_valueContext.class);
		}
		public Terminal_valueContext terminal_value(int i) {
			return getRuleContext(Terminal_valueContext.class,i);
		}
		public List<Cmp_declarationContext> cmp_declaration() {
			return getRuleContexts(Cmp_declarationContext.class);
		}
		public Cmp_declarationContext cmp_declaration(int i) {
			return getRuleContext(Cmp_declarationContext.class,i);
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
		enterRule(_localctx, 40, RULE_switch_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__25);
			setState(228);
			match(T__6);
			setState(229);
			identifier();
			setState(230);
			match(T__7);
			setState(231);
			match(T__26);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__27) {
				{
				{
				setState(232);
				match(T__27);
				setState(233);
				terminal_value();
				setState(234);
				match(T__28);
				setState(235);
				cmp_declaration();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(245);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(242);
				match(T__29);
				setState(243);
				match(T__28);
				setState(244);
				cmp_declaration();
				}
			}

			setState(247);
			match(T__30);
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
		enterRule(_localctx, 42, RULE_break_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__31);
			setState(250);
			match(T__5);
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
		enterRule(_localctx, 44, RULE_return_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__32);
			setState(253);
			expression(0);
			setState(254);
			match(T__5);
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
		enterRule(_localctx, 46, RULE_declaration_if);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__33);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__34);
				setState(258);
				cmp_declaration();
				setState(259);
				match(T__33);
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
		enterRule(_localctx, 48, RULE_end_loop);
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
		public Str_struct_priContext str_struct_pri() {
			return getRuleContext(Str_struct_priContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 50, RULE_str_struct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__38) | (1L << T__43) | (1L << T__44) | (1L << ID) | (1L << TK_ENTERO) | (1L << TK_REAL) | (1L << TK_CADENA) | (1L << TK_CARACTER) | (1L << MINUS))) != 0)) {
				{
				setState(265);
				expression(0);
				}
			}

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
		enterRule(_localctx, 52, RULE_str_struct_pri);
		try {
			setState(273);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(T__10);
				setState(271);
				str_struct();
				}
				break;
			case T__7:
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
		enterRule(_localctx, 54, RULE_cmp_declaration);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				declaration();
				setState(276);
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
	public static class AssigboolContext extends ExpressionContext {
		public Expression_boolContext expression_bool() {
			return getRuleContext(Expression_boolContext.class,0);
		}
		public AssigboolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssigbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssigbool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssigbool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssiaddContext extends ExpressionContext {
		public Expression_additionContext expression_addition() {
			return getRuleContext(Expression_additionContext.class,0);
		}
		public AssiaddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterAssiadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitAssiadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitAssiadd(this);
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
	public static class OrExpContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_boolContext expression_bool() {
			return getRuleContext(Expression_boolContext.class,0);
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
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(282);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new AssigExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				identifier();
				setState(284);
				match(T__11);
				setState(285);
				expression(5);
				}
				break;
			case 3:
				{
				_localctx = new AssigboolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287);
				expression_bool(0);
				}
				break;
			case 4:
				{
				_localctx = new AssiaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				expression_addition(0);
				}
				break;
			case 5:
				{
				_localctx = new FunctionDotOpExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				function_call();
				setState(290);
				match(T__36);
				setState(291);
				identifier();
				}
				break;
			case 6:
				{
				_localctx = new FunctionExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				function_call();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrExpContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(296);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(297);
					match(T__35);
					setState(298);
					expression_bool(0);
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Expression_boolContext extends ParserRuleContext {
		public Expression_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_bool; }
	 
		public Expression_boolContext() { }
		public void copyFrom(Expression_boolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndExpContext extends Expression_boolContext {
		public Expression_boolContext expression_bool() {
			return getRuleContext(Expression_boolContext.class,0);
		}
		public Expression_relContext expression_rel() {
			return getRuleContext(Expression_relContext.class,0);
		}
		public AndExpContext(Expression_boolContext ctx) { copyFrom(ctx); }
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
	public static class OtherandexpContext extends Expression_boolContext {
		public Expression_relContext expression_rel() {
			return getRuleContext(Expression_relContext.class,0);
		}
		public OtherandexpContext(Expression_boolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterOtherandexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitOtherandexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitOtherandexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_boolContext expression_bool() throws RecognitionException {
		return expression_bool(0);
	}

	private Expression_boolContext expression_bool(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_boolContext _localctx = new Expression_boolContext(_ctx, _parentState);
		Expression_boolContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_expression_bool, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OtherandexpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(305);
			expression_rel();
			}
			_ctx.stop = _input.LT(-1);
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpContext(new Expression_boolContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression_bool);
					setState(307);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(308);
					match(T__37);
					setState(309);
					expression_rel();
					}
					} 
				}
				setState(314);
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

	public static class Expression_relContext extends ParserRuleContext {
		public Expression_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_rel; }
	 
		public Expression_relContext() { }
		public void copyFrom(Expression_relContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Terminal_boolContext extends Expression_relContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public Terminal_boolContext(Expression_relContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterTerminal_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitTerminal_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitTerminal_bool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualitylExpContext extends Expression_relContext {
		public Token op;
		public List<Expression_additionContext> expression_addition() {
			return getRuleContexts(Expression_additionContext.class);
		}
		public Expression_additionContext expression_addition(int i) {
			return getRuleContext(Expression_additionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PsycoderParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(PsycoderParser.NEQ, 0); }
		public EqualitylExpContext(Expression_relContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterEqualitylExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitEqualitylExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitEqualitylExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExpContext extends Expression_relContext {
		public Expression_boolContext expression_bool() {
			return getRuleContext(Expression_boolContext.class,0);
		}
		public NegExpContext(Expression_relContext ctx) { copyFrom(ctx); }
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
	public static class RelationalExpContext extends Expression_relContext {
		public Token op;
		public List<Expression_additionContext> expression_addition() {
			return getRuleContexts(Expression_additionContext.class);
		}
		public Expression_additionContext expression_addition(int i) {
			return getRuleContext(Expression_additionContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(PsycoderParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(PsycoderParser.GTEQ, 0); }
		public TerminalNode GT() { return getToken(PsycoderParser.GT, 0); }
		public TerminalNode LT() { return getToken(PsycoderParser.LT, 0); }
		public RelationalExpContext(Expression_relContext ctx) { copyFrom(ctx); }
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

	public final Expression_relContext expression_rel() throws RecognitionException {
		Expression_relContext _localctx = new Expression_relContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expression_rel);
		int _la;
		try {
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new EqualitylExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				expression_addition(0);
				setState(316);
				((EqualitylExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((EqualitylExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(317);
				expression_addition(0);
				}
				break;
			case 2:
				_localctx = new RelationalExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				expression_addition(0);
				setState(320);
				((RelationalExpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
					((RelationalExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(321);
				expression_addition(0);
				}
				break;
			case 3:
				_localctx = new NegExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__38);
				setState(324);
				expression_bool(0);
				}
				break;
			case 4:
				_localctx = new Terminal_boolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				primary();
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

	public static class Expression_additionContext extends ParserRuleContext {
		public Expression_additionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_addition; }
	 
		public Expression_additionContext() { }
		public void copyFrom(Expression_additionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegativeExpContext extends Expression_additionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegativeExpContext(Expression_additionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterNegativeExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitNegativeExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitNegativeExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionExpContext extends Expression_additionContext {
		public Token op;
		public Expression_additionContext expression_addition() {
			return getRuleContext(Expression_additionContext.class,0);
		}
		public Expression_productContext expression_product() {
			return getRuleContext(Expression_productContext.class,0);
		}
		public AdditionExpContext(Expression_additionContext ctx) { copyFrom(ctx); }
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
	public static class OtheropContext extends Expression_additionContext {
		public Expression_productContext expression_product() {
			return getRuleContext(Expression_productContext.class,0);
		}
		public OtheropContext(Expression_additionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterOtherop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitOtherop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitOtherop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_additionContext expression_addition() throws RecognitionException {
		return expression_addition(0);
	}

	private Expression_additionContext expression_addition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_additionContext _localctx = new Expression_additionContext(_ctx, _parentState);
		Expression_additionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_expression_addition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new NegativeExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(329);
				match(MINUS);
				setState(330);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new OtheropContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(331);
				expression_product(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditionExpContext(new Expression_additionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression_addition);
					setState(334);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(335);
					((AdditionExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__39 || _la==MINUS) ) {
						((AdditionExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(336);
					expression_product(0);
					}
					} 
				}
				setState(341);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Expression_productContext extends ParserRuleContext {
		public Expression_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_product; }
	 
		public Expression_productContext() { }
		public void copyFrom(Expression_productContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationExpContext extends Expression_productContext {
		public Token op;
		public Expression_productContext expression_product() {
			return getRuleContext(Expression_productContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MultiplicationExpContext(Expression_productContext ctx) { copyFrom(ctx); }
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
	public static class OtherexpContext extends Expression_productContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public OtherexpContext(Expression_productContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterOtherexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitOtherexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitOtherexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_productContext expression_product() throws RecognitionException {
		return expression_product(0);
	}

	private Expression_productContext expression_product(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_productContext _localctx = new Expression_productContext(_ctx, _parentState);
		Expression_productContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression_product, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new OtherexpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(343);
			primary();
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationExpContext(new Expression_productContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression_product);
					setState(345);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(346);
					((MultiplicationExpContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42))) != 0)) ) {
						((MultiplicationExpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(347);
					primary();
					}
					} 
				}
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Neg_real_terminalContext extends PrimaryContext {
		public TerminalNode TK_REAL() { return getToken(PsycoderParser.TK_REAL, 0); }
		public Neg_real_terminalContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterNeg_real_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitNeg_real_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitNeg_real_terminal(this);
			else return visitor.visitChildren(this);
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
	public static class Neg_entero_terminalContext extends PrimaryContext {
		public TerminalNode TK_ENTERO() { return getToken(PsycoderParser.TK_ENTERO, 0); }
		public Neg_entero_terminalContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).enterNeg_entero_terminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PsycoderListener ) ((PsycoderListener)listener).exitNeg_entero_terminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PsycoderVisitor ) return ((PsycoderVisitor<? extends T>)visitor).visitNeg_entero_terminal(this);
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
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ParenPriExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(T__6);
				setState(354);
				expression(0);
				setState(355);
				match(T__7);
				}
				break;
			case 2:
				_localctx = new TerminalPriExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				terminal_value();
				}
				break;
			case 3:
				_localctx = new Neg_entero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(358);
				match(MINUS);
				setState(359);
				match(TK_ENTERO);
				}
				break;
			case 4:
				_localctx = new Neg_real_terminalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(MINUS);
				setState(361);
				match(TK_REAL);
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
		enterRule(_localctx, 68, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ID);
			setState(365);
			match(T__6);
			setState(366);
			args_fun();
			setState(367);
			match(T__7);
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
		enterRule(_localctx, 70, RULE_args_fun);
		try {
			setState(373);
			switch (_input.LA(1)) {
			case T__6:
			case T__38:
			case T__43:
			case T__44:
			case ID:
			case TK_ENTERO:
			case TK_REAL:
			case TK_CADENA:
			case TK_CARACTER:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				expression(0);
				setState(370);
				args_fun_pri();
				}
				break;
			case T__7:
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
		public Args_funContext args_fun() {
			return getRuleContext(Args_funContext.class,0);
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
		enterRule(_localctx, 72, RULE_args_fun_pri);
		try {
			setState(378);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__10);
				setState(376);
				args_fun();
				}
				break;
			case T__7:
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PsycoderParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PsycoderParser.ID, i);
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
		enterRule(_localctx, 74, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(ID);
			setState(385);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					match(T__36);
					setState(382);
					match(ID);
					}
					} 
				}
				setState(387);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
			setState(395);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Id_terminalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				identifier();
				}
				break;
			case TK_ENTERO:
				_localctx = new Entero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				match(TK_ENTERO);
				}
				break;
			case TK_REAL:
				_localctx = new Real_terminalContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(TK_REAL);
				}
				break;
			case TK_CADENA:
				_localctx = new Cadena_terminalContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(TK_CADENA);
				}
				break;
			case TK_CARACTER:
				_localctx = new Caracter_terminalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				match(TK_CARACTER);
				}
				break;
			case T__43:
				_localctx = new Verdadero_terminalContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(T__43);
				}
				break;
			case T__44:
				_localctx = new Falso_terminalContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(394);
				match(T__44);
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
		case 28:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 29:
			return expression_bool_sempred((Expression_boolContext)_localctx, predIndex);
		case 31:
			return expression_addition_sempred((Expression_additionContext)_localctx, predIndex);
		case 32:
			return expression_product_sempred((Expression_productContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expression_bool_sempred(Expression_boolContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_addition_sempred(Expression_additionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expression_product_sempred(Expression_productContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2]\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3f\n\3\3\4\3\4\3\4\3\4\6\4l\n\4\r\4\16\4m\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\5\6z\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u0083\n\b\3\t"+
		"\3\t\3\t\3\t\5\t\u0089\n\t\3\n\3\n\3\n\5\n\u008e\n\n\3\n\3\n\3\13\3\13"+
		"\3\13\5\13\u0095\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009f\n\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00af\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00d0\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u00f0\n\26"+
		"\f\26\16\26\u00f3\13\26\3\26\3\26\3\26\5\26\u00f8\n\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u0108\n\31"+
		"\3\32\3\32\3\33\5\33\u010d\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u0114\n"+
		"\34\3\35\3\35\3\35\3\35\5\35\u011a\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0129\n\36\3\36\3\36\3\36\7\36"+
		"\u012e\n\36\f\36\16\36\u0131\13\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0139\n\37\f\37\16\37\u013c\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5"+
		" \u0149\n \3!\3!\3!\3!\5!\u014f\n!\3!\3!\3!\7!\u0154\n!\f!\16!\u0157\13"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u015f\n\"\f\"\16\"\u0162\13\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\5#\u016d\n#\3$\3$\3$\3$\3$\3%\3%\3%\3%\5%\u0178\n%\3"+
		"&\3&\3&\5&\u017d\n&\3\'\3\'\3\'\7\'\u0182\n\'\f\'\16\'\u0185\13\'\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u018e\n(\3(\2\6:<@B)\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\b\4\2\17\23\63\63\3\2\63"+
		"\65\3\289\3\2:=\4\2**>>\3\2+-\u019b\2\\\3\2\2\2\4e\3\2\2\2\6k\3\2\2\2"+
		"\bo\3\2\2\2\ny\3\2\2\2\f{\3\2\2\2\16\u0082\3\2\2\2\20\u0088\3\2\2\2\22"+
		"\u008a\3\2\2\2\24\u0094\3\2\2\2\26\u0096\3\2\2\2\30\u009e\3\2\2\2\32\u00a0"+
		"\3\2\2\2\34\u00ae\3\2\2\2\36\u00b0\3\2\2\2 \u00b8\3\2\2\2\"\u00be\3\2"+
		"\2\2$\u00c4\3\2\2\2&\u00cc\3\2\2\2(\u00dd\3\2\2\2*\u00e5\3\2\2\2,\u00fb"+
		"\3\2\2\2.\u00fe\3\2\2\2\60\u0107\3\2\2\2\62\u0109\3\2\2\2\64\u010c\3\2"+
		"\2\2\66\u0113\3\2\2\28\u0119\3\2\2\2:\u0128\3\2\2\2<\u0132\3\2\2\2>\u0148"+
		"\3\2\2\2@\u014e\3\2\2\2B\u0158\3\2\2\2D\u016c\3\2\2\2F\u016e\3\2\2\2H"+
		"\u0177\3\2\2\2J\u017c\3\2\2\2L\u017e\3\2\2\2N\u018d\3\2\2\2PR\5\4\3\2"+
		"QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\3\2\2"+
		"WX\58\35\2XY\7\4\2\2YZ\7\2\2\3Z]\3\2\2\2[]\3\2\2\2\\S\3\2\2\2\\[\3\2\2"+
		"\2]\3\3\2\2\2^_\7\5\2\2_f\5\b\5\2`a\7\6\2\2ab\7\63\2\2bc\5\6\4\2cd\7\7"+
		"\2\2df\3\2\2\2e^\3\2\2\2e`\3\2\2\2f\5\3\2\2\2gh\5\32\16\2hi\7\63\2\2i"+
		"j\7\b\2\2jl\3\2\2\2kg\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\7\3\2\2\2"+
		"op\5\32\16\2pq\7\63\2\2qr\7\t\2\2rs\5\n\6\2st\7\n\2\2tu\7\13\2\2uv\58"+
		"\35\2vw\7\f\2\2w\t\3\2\2\2xz\5\f\7\2yx\3\2\2\2yz\3\2\2\2z\13\3\2\2\2{"+
		"|\5\32\16\2|}\7\63\2\2}~\5\16\b\2~\r\3\2\2\2\177\u0080\7\r\2\2\u0080\u0083"+
		"\5\f\7\2\u0081\u0083\3\2\2\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083"+
		"\17\3\2\2\2\u0084\u0085\5\32\16\2\u0085\u0086\5\22\n\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0089\5\26\f\2\u0088\u0084\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\21\3\2\2\2\u008a\u008d\7\63\2\2\u008b\u008c\7\16\2\2\u008c\u008e\5:\36"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090"+
		"\5\24\13\2\u0090\23\3\2\2\2\u0091\u0092\7\r\2\2\u0092\u0095\5\22\n\2\u0093"+
		"\u0095\3\2\2\2\u0094\u0091\3\2\2\2\u0094\u0093\3\2\2\2\u0095\25\3\2\2"+
		"\2\u0096\u0097\5L\'\2\u0097\u0098\7\16\2\2\u0098\u0099\5:\36\2\u0099\u009a"+
		"\5\30\r\2\u009a\27\3\2\2\2\u009b\u009c\7\r\2\2\u009c\u009f\5\26\f\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009d\3\2\2\2\u009f\31\3\2\2"+
		"\2\u00a0\u00a1\t\2\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\5\20\t\2\u00a3\u00a4"+
		"\7\b\2\2\u00a4\u00af\3\2\2\2\u00a5\u00af\5\36\20\2\u00a6\u00af\5 \21\2"+
		"\u00a7\u00af\5\"\22\2\u00a8\u00af\5$\23\2\u00a9\u00af\5&\24\2\u00aa\u00af"+
		"\5(\25\2\u00ab\u00af\5*\26\2\u00ac\u00af\5.\30\2\u00ad\u00af\5,\27\2\u00ae"+
		"\u00a2\3\2\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a6\3\2\2\2\u00ae\u00a7\3\2"+
		"\2\2\u00ae\u00a8\3\2\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00aa\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\35\3\2\2"+
		"\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3\5:\36\2\u00b3"+
		"\u00b4\7\n\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6\58\35\2\u00b6\u00b7\5"+
		"\60\31\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\7\t\2\2\u00ba"+
		"\u00bb\5L\'\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7\b\2\2\u00bd!\3\2\2\2\u00be"+
		"\u00bf\7\27\2\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\5\64\33\2\u00c1\u00c2"+
		"\7\n\2\2\u00c2\u00c3\7\b\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5"+
		"\u00c6\7\t\2\2\u00c6\u00c7\5:\36\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\7\13"+
		"\2\2\u00c9\u00ca\58\35\2\u00ca\u00cb\7\31\2\2\u00cb%\3\2\2\2\u00cc\u00cd"+
		"\7\32\2\2\u00cd\u00cf\7\t\2\2\u00ce\u00d0\5\32\16\2\u00cf\u00ce\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\7\63\2\2\u00d2"+
		"\u00d3\7\16\2\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\5"+
		":\36\2\u00d6\u00d7\7\b\2\2\u00d7\u00d8\5\62\32\2\u00d8\u00d9\7\n\2\2\u00d9"+
		"\u00da\7\13\2\2\u00da\u00db\58\35\2\u00db\u00dc\7\33\2\2\u00dc\'\3\2\2"+
		"\2\u00dd\u00de\7\13\2\2\u00de\u00df\58\35\2\u00df\u00e0\7\30\2\2\u00e0"+
		"\u00e1\7\t\2\2\u00e1\u00e2\5:\36\2\u00e2\u00e3\7\n\2\2\u00e3\u00e4\7\b"+
		"\2\2\u00e4)\3\2\2\2\u00e5\u00e6\7\34\2\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8"+
		"\5L\'\2\u00e8\u00e9\7\n\2\2\u00e9\u00f1\7\35\2\2\u00ea\u00eb\7\36\2\2"+
		"\u00eb\u00ec\5N(\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee\58\35\2\u00ee\u00f0"+
		"\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f7\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7 "+
		"\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00f8\58\35\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7!\2\2\u00fa+\3\2\2\2\u00fb"+
		"\u00fc\7\"\2\2\u00fc\u00fd\7\b\2\2\u00fd-\3\2\2\2\u00fe\u00ff\7#\2\2\u00ff"+
		"\u0100\5:\36\2\u0100\u0101\7\b\2\2\u0101/\3\2\2\2\u0102\u0108\7$\2\2\u0103"+
		"\u0104\7%\2\2\u0104\u0105\58\35\2\u0105\u0106\7$\2\2\u0106\u0108\3\2\2"+
		"\2\u0107\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0108\61\3\2\2\2\u0109\u010a"+
		"\t\3\2\2\u010a\63\3\2\2\2\u010b\u010d\5:\36\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\5\66\34\2\u010f\65\3\2"+
		"\2\2\u0110\u0111\7\r\2\2\u0111\u0114\5\64\33\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0112\3\2\2\2\u0114\67\3\2\2\2\u0115\u0116\5\34\17"+
		"\2\u0116\u0117\58\35\2\u0117\u011a\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0115"+
		"\3\2\2\2\u0119\u0118\3\2\2\2\u011a9\3\2\2\2\u011b\u011c\b\36\1\2\u011c"+
		"\u0129\5D#\2\u011d\u011e\5L\'\2\u011e\u011f\7\16\2\2\u011f\u0120\5:\36"+
		"\7\u0120\u0129\3\2\2\2\u0121\u0129\5<\37\2\u0122\u0129\5@!\2\u0123\u0124"+
		"\5F$\2\u0124\u0125\7\'\2\2\u0125\u0126\5L\'\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0129\5F$\2\u0128\u011b\3\2\2\2\u0128\u011d\3\2\2\2\u0128\u0121\3\2\2"+
		"\2\u0128\u0122\3\2\2\2\u0128\u0123\3\2\2\2\u0128\u0127\3\2\2\2\u0129\u012f"+
		"\3\2\2\2\u012a\u012b\f\b\2\2\u012b\u012c\7&\2\2\u012c\u012e\5<\37\2\u012d"+
		"\u012a\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2"+
		"\2\2\u0130;\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\b\37\1\2\u0133\u0134"+
		"\5> \2\u0134\u013a\3\2\2\2\u0135\u0136\f\4\2\2\u0136\u0137\7(\2\2\u0137"+
		"\u0139\5> \2\u0138\u0135\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2"+
		"\2\u013a\u013b\3\2\2\2\u013b=\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\5@!\2\u013e\u013f\t\4\2\2\u013f\u0140\5@!\2\u0140\u0149\3\2\2\2\u0141"+
		"\u0142\5@!\2\u0142\u0143\t\5\2\2\u0143\u0144\5@!\2\u0144\u0149\3\2\2\2"+
		"\u0145\u0146\7)\2\2\u0146\u0149\5<\37\2\u0147\u0149\5D#\2\u0148\u013d"+
		"\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0145\3\2\2\2\u0148\u0147\3\2\2\2\u0149"+
		"?\3\2\2\2\u014a\u014b\b!\1\2\u014b\u014c\7>\2\2\u014c\u014f\5:\36\2\u014d"+
		"\u014f\5B\"\2\u014e\u014a\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0155\3\2"+
		"\2\2\u0150\u0151\f\5\2\2\u0151\u0152\t\6\2\2\u0152\u0154\5B\"\2\u0153"+
		"\u0150\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156A\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\b\"\1\2\u0159\u015a"+
		"\5D#\2\u015a\u0160\3\2\2\2\u015b\u015c\f\4\2\2\u015c\u015d\t\7\2\2\u015d"+
		"\u015f\5D#\2\u015e\u015b\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2"+
		"\2\u0160\u0161\3\2\2\2\u0161C\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0164"+
		"\7\t\2\2\u0164\u0165\5:\36\2\u0165\u0166\7\n\2\2\u0166\u016d\3\2\2\2\u0167"+
		"\u016d\5N(\2\u0168\u0169\7>\2\2\u0169\u016d\7\64\2\2\u016a\u016b\7>\2"+
		"\2\u016b\u016d\7\65\2\2\u016c\u0163\3\2\2\2\u016c\u0167\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016dE\3\2\2\2\u016e\u016f\7\63\2\2"+
		"\u016f\u0170\7\t\2\2\u0170\u0171\5H%\2\u0171\u0172\7\n\2\2\u0172G\3\2"+
		"\2\2\u0173\u0174\5:\36\2\u0174\u0175\5J&\2\u0175\u0178\3\2\2\2\u0176\u0178"+
		"\3\2\2\2\u0177\u0173\3\2\2\2\u0177\u0176\3\2\2\2\u0178I\3\2\2\2\u0179"+
		"\u017a\7\r\2\2\u017a\u017d\5H%\2\u017b\u017d\3\2\2\2\u017c\u0179\3\2\2"+
		"\2\u017c\u017b\3\2\2\2\u017dK\3\2\2\2\u017e\u0183\7\63\2\2\u017f\u0180"+
		"\7\'\2\2\u0180\u0182\7\63\2\2\u0181\u017f\3\2\2\2\u0182\u0185\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184M\3\2\2\2\u0185\u0183\3"+
		"\2\2\2\u0186\u018e\5L\'\2\u0187\u018e\7\64\2\2\u0188\u018e\7\65\2\2\u0189"+
		"\u018e\7\66\2\2\u018a\u018e\7\67\2\2\u018b\u018e\7.\2\2\u018c\u018e\7"+
		"/\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d\u0188\3\2\2\2\u018d"+
		"\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2"+
		"\2\2\u018eO\3\2\2\2 S\\emy\u0082\u0088\u008d\u0094\u009e\u00ae\u00cf\u00f1"+
		"\u00f7\u0107\u010c\u0113\u0119\u0128\u012f\u013a\u0148\u014e\u0155\u0160"+
		"\u016c\u0177\u017c\u0183\u018d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}