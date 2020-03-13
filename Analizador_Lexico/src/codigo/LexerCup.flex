package codigo;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
      return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
      return new Symbol(type, yyline, yycolumn);
    }
%}
%%
Start {return new Symbol(sym.Start, yychar, yyline, yytext());;}
End {return new Symbol(sym.End, yychar, yyline, yytext());}
Int {return new Symbol(sym.Int, yychar, yyline, yytext());}
Float {return new Symbol(sym.Float, yychar, yyline, yytext());}
String {return new Symbol(sym.String, yychar, yyline, yytext());}
Ob {return new Symbol(sym.Ob, yychar, yyline, yytext());}
If {return new Symbol(sym.If, yychar, yyline, yytext());}
Default {return new Symbol(sym.Default, yychar, yyline, yytext());}
Def {return new Symbol(sym.Def, yychar, yyline, yytext());}
Switch {return new Symbol(sym.Switch, yychar, yyline, yytext());}
Op {return new Symbol(sym.Op, yychar, yyline, yytext());}
While {return new Symbol(sym.While, yychar, yyline, yytext());}
Wh {return new Symbol(sym.Wh, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"/? ?/".* {/*Ignore*/}
"=" {return new Symbol(sym.Equal, yychar, yyline, yytext());}
"+" {return new Symbol(sym.Sum, yychar, yyline, yytext());}
"-" {return new Symbol(sym.Subtraction, yychar, yyline, yytext());}
"*" {return new Symbol(sym.Multiplication, yychar, yyline, yytext());}
"/" {return new Symbol(sym.Division, yychar, yyline, yytext());}
">" {return new Symbol(sym.GreaterThan, yychar, yyline, yytext());;}
"<" {return new Symbol(sym.LessThan, yychar, yyline, yytext());}
"||" {return new Symbol(sym.Or, yychar, yyline, yytext());}
"^" {return new Symbol(sym.And, yychar, yyline, yytext());}
"-^" {return new Symbol(sym.Negative, yychar, yyline, yytext());}
":" {return new Symbol(sym.DoublePoint, yychar, yyline, yytext());}
"(" {return new Symbol(sym.Parenthesis_O, yychar, yyline, yytext());}
")" {return new Symbol(sym.Parenthesis_C, yychar, yyline, yytext());}
"%" {return new Symbol(sym.Init, yychar, yyline, yytext());}
{L}({L}|{D})* {lexeme=yytext(); return Identifier;}
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Number;}
("(>"{D}<")")|{D}+ {lexeme=yytext();return Number;}

 . {return ERROR;}