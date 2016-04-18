// Generated from Psycoder.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PsycoderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PsycoderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PsycoderParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionElement(PsycoderParser.FunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structElement}
	 * labeled alternative in {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructElement(PsycoderParser.StructElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#struct_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_declaration(PsycoderParser.Struct_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(PsycoderParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PsycoderParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#mandatory_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory_params(PsycoderParser.Mandatory_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#mandatory_params_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMandatory_params_pri(PsycoderParser.Mandatory_params_priContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedAssign(PsycoderParser.TypedAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unTypedAssign}
	 * labeled alternative in {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnTypedAssign(PsycoderParser.UnTypedAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_type(PsycoderParser.Assign_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_type_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_type_pri(PsycoderParser.Assign_type_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_id(PsycoderParser.Assign_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_id_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_id_pri(PsycoderParser.Assign_id_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PsycoderParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PsycoderParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#if_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_declaration(PsycoderParser.If_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#read_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_declaration(PsycoderParser.Read_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#print_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_declaration(PsycoderParser.Print_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#while_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_declaration(PsycoderParser.While_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#for_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_declaration(PsycoderParser.For_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#dowhile_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile_declaration(PsycoderParser.Dowhile_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#switch_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_declaration(PsycoderParser.Switch_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#break_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_declaration(PsycoderParser.Break_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#return_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_declaration(PsycoderParser.Return_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#declaration_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_if(PsycoderParser.Declaration_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#end_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_loop(PsycoderParser.End_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#str_struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_struct(PsycoderParser.Str_structContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#str_struct_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStr_struct_pri(PsycoderParser.Str_struct_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#cmp_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_declaration(PsycoderParser.Cmp_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicationExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationExp(PsycoderParser.MultiplicationExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(PsycoderParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExp(PsycoderParser.EqualityExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDotOpExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDotOpExp(PsycoderParser.FunctionDotOpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(PsycoderParser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(PsycoderParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExp(PsycoderParser.RelationalExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(PsycoderParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additionExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExp(PsycoderParser.AdditionExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assigExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigExp(PsycoderParser.AssigExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExp}
	 * labeled alternative in {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExp(PsycoderParser.FunctionExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPriExp(PsycoderParser.ParenPriExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code terminalPriExp}
	 * labeled alternative in {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminalPriExp(PsycoderParser.TerminalPriExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PsycoderParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#args_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_fun(PsycoderParser.Args_funContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#args_fun_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_fun_pri(PsycoderParser.Args_fun_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PsycoderParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_terminal(PsycoderParser.Id_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntero_terminal(PsycoderParser.Entero_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_terminal(PsycoderParser.Real_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadena_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena_terminal(PsycoderParser.Cadena_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caracter_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaracter_terminal(PsycoderParser.Caracter_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code verdadero_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerdadero_terminal(PsycoderParser.Verdadero_terminalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falso_terminal}
	 * labeled alternative in {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalso_terminal(PsycoderParser.Falso_terminalContext ctx);
}