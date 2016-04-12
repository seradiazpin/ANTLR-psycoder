// Generated from src/Psycoder.g4 by ANTLR 4.5.3
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
	 * Visit a parse tree produced by {@link PsycoderParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(PsycoderParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#element_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_pri(PsycoderParser.Element_priContext ctx);
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
	 * Visit a parse tree produced by {@link PsycoderParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(PsycoderParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_pri(PsycoderParser.Assign_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_pri_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_pri_pri(PsycoderParser.Assign_pri_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_id(PsycoderParser.Assign_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_special(PsycoderParser.Assign_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#assign_fun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_fun(PsycoderParser.Assign_funContext ctx);
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
	 * Visit a parse tree produced by {@link PsycoderParser#case_l}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_l(PsycoderParser.Case_lContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#cmp_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_declaration(PsycoderParser.Cmp_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PsycoderParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PsycoderParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#identifier_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_id(PsycoderParser.Identifier_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#identifier_id_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_id_pri(PsycoderParser.Identifier_id_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PsycoderParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#identifier_pri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_pri(PsycoderParser.Identifier_priContext ctx);
	/**
	 * Visit a parse tree produced by {@link PsycoderParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_value(PsycoderParser.Terminal_valueContext ctx);
}