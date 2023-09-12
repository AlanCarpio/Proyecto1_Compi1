package AnalizadorJson;
import java_cup.runtime.Symbol; 

%%
%{ 
// Codigo Usuarios

%} 
%class Scanner_Json
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%init{ 
    yyline = 1; 
    yychar = 1; 
%init} 
DOSPUT = ":"
LLAVE_IZQ = "{"
LLAVE_DER = "}"
COMA = ","
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
NOMBRE_DATO = \"[^\"]*\"
DECIMAL=[0-9]+("."[  |0-9]+)?

%%

<YYINITIAL> {DOSPUT} {return new Symbol(Parser_JsonSym.DOSPUT, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_IZQ} {return new Symbol(Parser_JsonSym.LLAVE_IZQ, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_DER} {return new Symbol(Parser_JsonSym.LLAVE_DER, yyline, yycolumn,yytext());}
<YYINITIAL> {NOMBRE_DATO} {return new Symbol(Parser_JsonSym.NOMBRE_DATO, yyline, yycolumn,yytext());}
<YYINITIAL> {DECIMAL} {return new Symbol(Parser_JsonSym.DECIMAL, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA} {return new Symbol(Parser_JsonSym.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {SPACE} {} 
<YYINITIAL> {ENTER} {} 

. {
    System.out.println("Este es un error lexico: "+yytext()+
    ", en la linea: "+yyline+", en la columna: "+yychar);
}
