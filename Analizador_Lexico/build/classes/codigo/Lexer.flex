package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
start |
:end |
%int |
%float |
%string |
Ob |
if |
Default |
Def |
Switch |
Op |
While |
Wh |
while {lexeme=yytext(); return ReservedWord;}
{espacio} {/*Ignore*/}
"/? ?/".* {/*Ignore*/}
"=" {return Equal;}
"+" {return Sum;}
"-" {return Subtraction;}
"*" {return Multiplication;}
"/" {return Division;}
">" {return GreaterThan;}
"<" {return LessThan;}
"||" {return Or;}
"^" {return And;}
"-^" {return Negative;}
{L}({L}|{D})* {lexeme=yytext(); return Identifier;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Number;}
("(>"{D}<")")|{D}+ {lexeme=yytext();return Number;}

 . {return ERROR;}
