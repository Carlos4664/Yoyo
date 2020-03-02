package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( %int | %float ) {lexeme=yytext(); return T_dato;}

/* Tipo de dato String */
( %string ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Default */
( default ) {lexeme=yytext(); return Default;}

/* Palabra reservada Ob */
( ob ) {lexeme=yytext(); return Ob;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada Def */
( def ) {lexeme=yytext(); return Def;}

/* Palabra reservada Op */
( op ) {lexeme=yytext(); return Op;}

/* Palabra reservada Wh */
( wh ) {lexeme=yytext(); return Wh;}

/* Palabra reservada Switch */
( switch ) {lexeme=yytext(); return Switch;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Operador Multiplicacion */
( "*" ) {lexeme=yytext(); return Multiplicacion;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "^" | "||" | "-^" | "<" | ">" ) {lexeme=yytext(); return Op_logico;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Dos puntos */
( ":" ) {lexeme=yytext(); return DosPuntos;}

/* Marcador de inicio de algoritmo */
( "start" ) {lexeme=yytext(); return Start;}

/* Marcador de final de algoritmo */
( "end" ) {lexeme=yytext(); return End;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Error de analisis */
 . {return ERROR;}
