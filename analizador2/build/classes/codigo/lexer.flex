package codigo;
import static codigo.Tokens.*;
%%
%class lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%
start {lexeme=yytext();return Start;}
end {lexeme=yytext();return End;}
Int {lexeme=yytext();return Int;}
Float {lexeme=yytext();return Float;}
String {lexeme=yytext();return String;}
Ob {lexeme=yytext();return Ob;}
If {lexeme=yytext();return If;}
Default {lexeme=yytext();return Default;}
Def {lexeme=yytext();return Def;}
Switch {lexeme=yytext();return Switch;}
Op {lexeme=yytext();return Op;}
Wh {lexeme=yytext();return Wh;}
While {lexeme=yytext();return ReservedWord;}
{espacio} {/*Ignore*/}
"\n" {return Linea;}
"=" {lexeme=yytext();return Equal;}
"+" {lexeme=yytext(); return Sum;}
"-" {lexeme=yytext(); return Substraction;}
"*" {lexeme=yytext(); return Multiplication;}
"/" {lexeme=yytext(); return Division;}
"||" {lexeme=yytext(); return Or;}
"^" {lexeme=yytext(); return And;}
"-^" {lexeme=yytext(); return Negative;}
"<" {lexeme=yytext(); return LessThan;}
">" {lexeme=yytext(); return GreatheThan;}
"(" {lexeme=yytext(); return Parenthesis_O;}
")" {lexeme=yytext(); return Parenthesis_C;}
":" {lexeme=yytext();return DoublePoint;}
"%" {lexeme=yytext(); return Init;}

{L}({L}|{D})* {lexeme=yytext(); return Identifier;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Number;}
("(>"{D}<")")|{D}+ {lexeme=yytext();return Number;}
 . {return ERROR;}
