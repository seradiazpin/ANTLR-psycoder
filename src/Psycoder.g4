grammar Psycoder;

//PARA VER LOS VISITORS
//http://stackoverflow.com/questions/15610183/if-else-statements-in-antlr-using-listeners
//https://github.com/bkiers/Mu



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

element : 'funcion' element_pri
        | 'estructura' ID cmp_declaration 'fin_estructura'
        ;

element_pri: type ID '(' params ')' 'hacer' cmp_declaration 'fin_funcion'
           | ID ID '(' params ')' 'hacer' cmp_declaration 'fin_funcion'
           ;

params  : mandatory_params
        |
        ;

mandatory_params    : type ID mandatory_params_pri
                    | ID ID mandatory_params_pri
                    ;

mandatory_params_pri    : ',' mandatory_params
                        |
                        ;
assign   : identifier_id assign_fun
         | type ID assign_pri
         ;

assign_pri  : '=' expression assign_pri_pri
            | assign_pri_pri
            |
            ;

assign_pri_pri  : ',' ID assign_id
                |
                ;

assign_id   : '=' expression assign_pri_pri
            | assign_pri_pri
            |
            ;

assign_special  : '=' expression
                | ID assign_pri
                ;

assign_fun  : '('args_fun')'
            | assign_special
            ;

args_fun    : expression args_fun_pri
            |
            ;

args_fun_pri    : ',' expression args_fun_pri
                |
                ;

type    : 'entero'
        | 'real'
        | 'booleano'
        | 'cadena'
        | 'caracter'
        ;

declaration : assign ';'
            | if_declaration
            | read_declaration
            | print_declaration
            | while_declaration
            | for_declaration
            | dowhile_declaration
            | switch_declaration
            | break_declaration
            | return_declaration
            ;


if_declaration  :'si' '('expression ')' 'entonces' cmp_declaration declaration_if;
read_declaration    : 'leer' '('identifier')'';';
print_declaration   : 'imprimir' '(' str_struct ')' ';';
while_declaration   : 'mientras' '('expression ')' 'hacer' cmp_declaration 'fin_mientras';
for_declaration     : 'para' '('assign';'expression ';'end_loop')' 'hacer' cmp_declaration 'fin_para';
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

cmp_declaration   : declaration cmp_declaration
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
    :   primary
    |   expression '.' identifier
    |   ID '('args_fun')'
    |   <assoc=right> '!' expression
    |   expression ('*'|'/'|'%') expression
    |   expression ('+'|'-') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   expression '&&' expression
    |   expression '||' expression
    |   <assoc=right> identifier '=' expression
    ;

primary : '(' expression ')'
        | terminal_value
        ;

identifier_id   : ID identifier_id_pri;
identifier_id_pri   : '.' identifier_id
                    |
                    ;
identifier  : ID identifier_pri;
identifier_pri  : '.' identifier
                |
                ;


terminal_value    : identifier
                  | TK_ENTERO
                  | TK_REAL
                  | TK_CADENA
                  | TK_CARACTER
                  | 'verdadero'
                  | 'falso'
                  ;

