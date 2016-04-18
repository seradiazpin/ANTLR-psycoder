grammar Psycoder;

//PARA VER LOS VISITORS
//http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners
//https://github.com/bkiers/Mu

/*
    Se agrego ID a type
*/


COMMENT : '/*' .*? '*/' -> channel(HIDDEN) ;
WS : [ \t\n\r]+ -> channel(HIDDEN) ;
LineComment: '//' ~[\r\n]* -> channel(HIDDEN);
ID : [a-zA-Z_]+ [a-zA-Z0-9_]* ;
TK_ENTERO   : '-'?[0-9]+ ;
TK_REAL : '-'?[0-9]+'.'[0-9]+;
TK_CADENA   : '"' (~'"'|'\\"')* '"';
TK_CARACTER : '\''(|.)'\'';



program : element* 'funcion_principal' cmp_declaration 'fin_principal' EOF
        |
        ;

element : 'funcion' function_declaration                    #functionElement
        | 'estructura' ID struct_declaration 'fin_estructura'  #structElement
        ;

struct_declaration
        : (type ID ';')+
        ;

function_declaration: type ID '(' params ')' 'hacer' cmp_declaration 'fin_funcion'
           ;

params  : mandatory_params?
        ;

mandatory_params    : type ID mandatory_params_pri
                    ;

mandatory_params_pri    : ',' mandatory_params
                        |
                        ;

assign   : type assign_type #typedAssign
         | assign_id        #unTypedAssign
         ;

assign_type  : ID ('=' expression)? assign_type_pri
            ;

assign_type_pri  : ',' assign_type
                |
                ;

assign_id   : identifier '=' expression assign_id_pri
            ;

assign_id_pri  : ',' assign_id
               |
               ;

type    : 'entero'
        | 'real'
        | 'booleano'
        | 'cadena'
        | 'caracter'
        | ID
        ;

declaration : assign ';'
            | if_declaration
            | read_declaration
            | print_declaration
            | while_declaration
            | for_declaration
            | dowhile_declaration
            | switch_declaration
            | return_declaration
            | break_declaration
            ;


if_declaration  :'si' '('expression ')' 'entonces' cmp_declaration declaration_if;
read_declaration    : 'leer' '('identifier')'';';
print_declaration   : 'imprimir' '(' str_struct ')' ';';
while_declaration   : 'mientras' '(' expression ')' 'hacer' cmp_declaration 'fin_mientras';
for_declaration     : 'para' '('type? ID '=' expression';'expression ';'end_loop')' 'hacer' cmp_declaration 'fin_para';
dowhile_declaration : 'hacer' cmp_declaration 'mientras''('expression ')' ';';
switch_declaration  : 'seleccionar' '('identifier')' 'entre' case_l 'fin_seleccionar';
break_declaration   : 'romper'';';
return_declaration  : 'retornar' expression ';';


declaration_if  : 'fin_si'
                | 'si_no' cmp_declaration 'fin_si'
                ;

end_loop    : ID
            | TK_ENTERO
            | TK_REAL
            ;

str_struct  : expression str_struct_pri;

str_struct_pri  : ',' str_struct
                |
                ;

case_l    : 'caso' terminal_value ':' cmp_declaration case_l
        | 'defecto' ':' cmp_declaration
        |
        ;

cmp_declaration : declaration cmp_declaration
                |
                ;

/*
expression : terminal_value exp_pri
    | '('exp')' exp_pri
    | '!' '('exp')' exp_pri
    | '-''('exp')' exp_pri
    ;

exp_pri : '||' expression exp_pri
        | '&&' expression exp_pri
        | '+' expression exp_pri
        | '-' expression exp_pri
        | '*' expression exp_pri
        | '/' expression exp_pri
        | '<' expression exp_pri
        | '!=' expression exp_pri
        | '<=' expression exp_pri
        | '>' expression exp_pri
        | '>=' expression exp_pri
        | '%' expression exp_pri
        | '!=' expression exp_pri
        | '==' expression exp_pri
        |
        ;
*/

expression
    :   primary                                             #primaryExp
    |   function_call '.' identifier                        #functionDotOpExp
    |   function_call                                       #functionExp
    |   <assoc=right> '!' expression                        #negExp
    |   expression op=('*'|'/'|'%') expression              #multiplicationExp
    |   expression op=('+'|'-') expression                  #additionExp
    |   expression op=('<=' | '>=' | '>' | '<') expression  #relationalExp
    |   expression op=('==' | '!=') expression              #equalityExp
    |   expression '&&' expression                          #andExp
    |   expression '||' expression                          #orExp
    |   <assoc=right> identifier '=' expression             #assigExp
    ;

primary : '(' expression ')' #parenPriExp
        | terminal_value #terminalPriExp
        ;

function_call
    :  ID '('args_fun')'
    ;

args_fun : expression args_fun_pri
         |
         ;

args_fun_pri : ',' args_fun
             |
             ;


identifier  : ID ('.' ID)*;


terminal_value    : identifier  #id_terminal
                  | TK_ENTERO   #entero_terminal
                  | TK_REAL     #real_terminal
                  | TK_CADENA   #cadena_terminal
                  | TK_CARACTER #caracter_terminal
                  | 'verdadero' #verdadero_terminal
                  | 'falso'     #falso_terminal
                  ;

