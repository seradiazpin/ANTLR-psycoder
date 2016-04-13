// Generated from src/Psycoder.g4 by ANTLR 4.5.3
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
	 * Enter a parse tree produced by {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PsycoderParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PsycoderParser.ElementContext ctx);
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
	 * Enter a parse tree produced by {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PsycoderParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PsycoderParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_pri}.
	 * @param ctx the parse tree
	 */
	void enterAssign_pri(PsycoderParser.Assign_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_pri}.
	 * @param ctx the parse tree
	 */
	void exitAssign_pri(PsycoderParser.Assign_priContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_pri_pri}.
	 * @param ctx the parse tree
	 */
	void enterAssign_pri_pri(PsycoderParser.Assign_pri_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_pri_pri}.
	 * @param ctx the parse tree
	 */
	void exitAssign_pri_pri(PsycoderParser.Assign_pri_priContext ctx);
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
	 * Enter a parse tree produced by {@link PsycoderParser#assign_special}.
	 * @param ctx the parse tree
	 */
	void enterAssign_special(PsycoderParser.Assign_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_special}.
	 * @param ctx the parse tree
	 */
	void exitAssign_special(PsycoderParser.Assign_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#assign_fun}.
	 * @param ctx the parse tree
	 */
	void enterAssign_fun(PsycoderParser.Assign_funContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#assign_fun}.
	 * @param ctx the parse tree
	 */
	void exitAssign_fun(PsycoderParser.Assign_funContext ctx);
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
	 * Enter a parse tree produced by {@link PsycoderParser#case_l}.
	 * @param ctx the parse tree
	 */
	void enterCase_l(PsycoderParser.Case_lContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#case_l}.
	 * @param ctx the parse tree
	 */
	void exitCase_l(PsycoderParser.Case_lContext ctx);
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
	 * Enter a parse tree produced by {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PsycoderParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PsycoderParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PsycoderParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PsycoderParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#identifier_id}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_id(PsycoderParser.Identifier_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#identifier_id}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_id(PsycoderParser.Identifier_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PsycoderParser#identifier_id_pri}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_id_pri(PsycoderParser.Identifier_id_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#identifier_id_pri}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_id_pri(PsycoderParser.Identifier_id_priContext ctx);
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
	 * Enter a parse tree produced by {@link PsycoderParser#identifier_pri}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_pri(PsycoderParser.Identifier_priContext ctx);
	/**
	 * Exit a parse tree produced by {@link PsycoderParser#identifier_pri}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_pri(PsycoderParser.Identifier_priContext ctx);
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