// Generated from Psycoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PsycoderParser}.
 */
public interface PsycoderListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PsycoderParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PsycoderParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFunctionElement(PsycoderParser.FunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFunctionElement(PsycoderParser.FunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStructElement(PsycoderParser.StructElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStructElement(PsycoderParser.StructElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStruct_declaration(PsycoderParser.Struct_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#struct_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStruct_declaration(PsycoderParser.Struct_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(PsycoderParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(PsycoderParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PsycoderParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PsycoderParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#mandatory_params}.
	 * @param ctx the parse tree
	 */
	void enterMandatory_params(PsycoderParser.Mandatory_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#mandatory_params}.
	 * @param ctx the parse tree
	 */
	void exitMandatory_params(PsycoderParser.Mandatory_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#mandatory_params_pri}.
	 * @param ctx the parse tree
	 */
	void enterMandatory_params_pri(PsycoderParser.Mandatory_params_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#mandatory_params_pri}.
	 * @param ctx the parse tree
	 */
	void exitMandatory_params_pri(PsycoderParser.Mandatory_params_priContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterTypedAssign(PsycoderParser.TypedAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitTypedAssign(PsycoderParser.TypedAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unTypedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterUnTypedAssign(PsycoderParser.UnTypedAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unTypedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitUnTypedAssign(PsycoderParser.UnTypedAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_type}.
	 * @param ctx the parse tree
	 */
	void enterAssign_type(PsycoderParser.Assign_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_type}.
	 * @param ctx the parse tree
	 */
	void exitAssign_type(PsycoderParser.Assign_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_type_pri}.
	 * @param ctx the parse tree
	 */
	void enterAssign_type_pri(PsycoderParser.Assign_type_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_type_pri}.
	 * @param ctx the parse tree
	 */
	void exitAssign_type_pri(PsycoderParser.Assign_type_priContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_id}.
	 * @param ctx the parse tree
	 */
	void enterAssign_id(PsycoderParser.Assign_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_id}.
	 * @param ctx the parse tree
	 */
	void exitAssign_id(PsycoderParser.Assign_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_id_pri}.
	 * @param ctx the parse tree
	 */
	void enterAssign_id_pri(PsycoderParser.Assign_id_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_id_pri}.
	 * @param ctx the parse tree
	 */
	void exitAssign_id_pri(PsycoderParser.Assign_id_priContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PsycoderParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PsycoderParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PsycoderParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PsycoderParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIf_declaration(PsycoderParser.If_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#if_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIf_declaration(PsycoderParser.If_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#read_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRead_declaration(PsycoderParser.Read_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#read_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRead_declaration(PsycoderParser.Read_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#print_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPrint_declaration(PsycoderParser.Print_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#print_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPrint_declaration(PsycoderParser.Print_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWhile_declaration(PsycoderParser.While_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#while_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWhile_declaration(PsycoderParser.While_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFor_declaration(PsycoderParser.For_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#for_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFor_declaration(PsycoderParser.For_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#dowhile_declaration}.
	 * @param ctx the parse tree
	 */
	void enterDowhile_declaration(PsycoderParser.Dowhile_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#dowhile_declaration}.
	 * @param ctx the parse tree
	 */
	void exitDowhile_declaration(PsycoderParser.Dowhile_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#switch_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_declaration(PsycoderParser.Switch_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#switch_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_declaration(PsycoderParser.Switch_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#break_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBreak_declaration(PsycoderParser.Break_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#break_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBreak_declaration(PsycoderParser.Break_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReturn_declaration(PsycoderParser.Return_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#return_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReturn_declaration(PsycoderParser.Return_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#declaration_if}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_if(PsycoderParser.Declaration_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#declaration_if}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_if(PsycoderParser.Declaration_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#end_loop}.
	 * @param ctx the parse tree
	 */
	void enterEnd_loop(PsycoderParser.End_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#end_loop}.
	 * @param ctx the parse tree
	 */
	void exitEnd_loop(PsycoderParser.End_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#str_struct}.
	 * @param ctx the parse tree
	 */
	void enterStr_struct(PsycoderParser.Str_structContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#str_struct}.
	 * @param ctx the parse tree
	 */
	void exitStr_struct(PsycoderParser.Str_structContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#str_struct_pri}.
	 * @param ctx the parse tree
	 */
	void enterStr_struct_pri(PsycoderParser.Str_struct_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#str_struct_pri}.
	 * @param ctx the parse tree
	 */
	void exitStr_struct_pri(PsycoderParser.Str_struct_priContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#cmp_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCmp_declaration(PsycoderParser.Cmp_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#cmp_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCmp_declaration(PsycoderParser.Cmp_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigbool}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssigbool(PsycoderParser.AssigboolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigbool}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssigbool(PsycoderParser.AssigboolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assiadd}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssiadd(PsycoderParser.AssiaddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assiadd}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssiadd(PsycoderParser.AssiaddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDotOpExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDotOpExp(PsycoderParser.FunctionDotOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDotOpExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDotOpExp(PsycoderParser.FunctionDotOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(PsycoderParser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(PsycoderParser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(PsycoderParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(PsycoderParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assigExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssigExp(PsycoderParser.AssigExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assigExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssigExp(PsycoderParser.AssigExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExp(PsycoderParser.FunctionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExp(PsycoderParser.FunctionExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link PsycoderParser#expression_bool}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(PsycoderParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link PsycoderParser#expression_bool}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(PsycoderParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherandexp}
	 * labeled alternative in {@link PsycoderParser#expression_bool}.
	 * @param ctx the parse tree
	 */
	void enterOtherandexp(PsycoderParser.OtherandexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherandexp}
	 * labeled alternative in {@link PsycoderParser#expression_bool}.
	 * @param ctx the parse tree
	 */
	void exitOtherandexp(PsycoderParser.OtherandexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalitylExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void enterEqualitylExp(PsycoderParser.EqualitylExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalitylExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void exitEqualitylExp(PsycoderParser.EqualitylExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExp(PsycoderParser.RelationalExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExp(PsycoderParser.RelationalExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void enterNegExp(PsycoderParser.NegExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void exitNegExp(PsycoderParser.NegExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code terminal_bool}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_bool(PsycoderParser.Terminal_boolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code terminal_bool}
	 * labeled alternative in {@link PsycoderParser#expression_rel}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_bool(PsycoderParser.Terminal_boolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegativeExp}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExp(PsycoderParser.NegativeExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegativeExp}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExp(PsycoderParser.NegativeExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExp}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExp(PsycoderParser.AdditionExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExp}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExp(PsycoderParser.AdditionExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherop}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void enterOtherop(PsycoderParser.OtheropContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherop}
	 * labeled alternative in {@link PsycoderParser#expression_addition}.
	 * @param ctx the parse tree
	 */
	void exitOtherop(PsycoderParser.OtheropContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicationExp}
	 * labeled alternative in {@link PsycoderParser#expression_product}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationExp(PsycoderParser.MultiplicationExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicationExp}
	 * labeled alternative in {@link PsycoderParser#expression_product}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationExp(PsycoderParser.MultiplicationExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code otherexp}
	 * labeled alternative in {@link PsycoderParser#expression_product}.
	 * @param ctx the parse tree
	 */
	void enterOtherexp(PsycoderParser.OtherexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code otherexp}
	 * labeled alternative in {@link PsycoderParser#expression_product}.
	 * @param ctx the parse tree
	 */
	void exitOtherexp(PsycoderParser.OtherexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParenPriExp(PsycoderParser.ParenPriExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParenPriExp(PsycoderParser.ParenPriExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code terminalPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterTerminalPriExp(PsycoderParser.TerminalPriExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code terminalPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitTerminalPriExp(PsycoderParser.TerminalPriExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg_entero_terminal}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNeg_entero_terminal(PsycoderParser.Neg_entero_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg_entero_terminal}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNeg_entero_terminal(PsycoderParser.Neg_entero_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg_real_terminal}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterNeg_real_terminal(PsycoderParser.Neg_real_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg_real_terminal}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitNeg_real_terminal(PsycoderParser.Neg_real_terminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PsycoderParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PsycoderParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#args_fun}.
	 * @param ctx the parse tree
	 */
	void enterArgs_fun(PsycoderParser.Args_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#args_fun}.
	 * @param ctx the parse tree
	 */
	void exitArgs_fun(PsycoderParser.Args_funContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#args_fun_pri}.
	 * @param ctx the parse tree
	 */
	void enterArgs_fun_pri(PsycoderParser.Args_fun_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#args_fun_pri}.
	 * @param ctx the parse tree
	 */
	void exitArgs_fun_pri(PsycoderParser.Args_fun_priContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PsycoderParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PsycoderParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterId_terminal(PsycoderParser.Id_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitId_terminal(PsycoderParser.Id_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterEntero_terminal(PsycoderParser.Entero_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitEntero_terminal(PsycoderParser.Entero_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterReal_terminal(PsycoderParser.Real_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitReal_terminal(PsycoderParser.Real_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cadena_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterCadena_terminal(PsycoderParser.Cadena_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cadena_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitCadena_terminal(PsycoderParser.Cadena_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caracter_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterCaracter_terminal(PsycoderParser.Caracter_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caracter_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitCaracter_terminal(PsycoderParser.Caracter_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code verdadero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterVerdadero_terminal(PsycoderParser.Verdadero_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code verdadero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitVerdadero_terminal(PsycoderParser.Verdadero_terminalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falso_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterFalso_terminal(PsycoderParser.Falso_terminalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falso_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitFalso_terminal(PsycoderParser.Falso_terminalContext ctx);
}