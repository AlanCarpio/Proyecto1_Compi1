package AnalizadorStatPy;
import java_cup.runtime.Symbol;
import Model.DoublyLinkedList;
import Model.Symbols; 

%%

%{
    public DoublyLinkedList List_Error_Scanner = new DoublyLinkedList();
    public DoublyLinkedList List_Tokens_Scanner = new DoublyLinkedList();
%}

%class Scanner  // definir como trabajara el scanner 
%cup            // trabajar con cup 
%public         // tipo publico
%line           // conteo de lineas - linea por linea
%column           // caracter por caracter
%unicode        // tipo de codigicacion para que acepte la  ñ u otro caracter
%ignorecase     // case insensitive que acepta tanto mayus como minus
%init{ 
    yyline = 1; 
    yycolumn = 1;
%init} 
//simbolos
PAR_IZQ   = "("
PAR_DER   = ")"
COR_IZQ  = "["
COR_DER  = "]" 
LLAVE_IZQ = "{"
LLAVE_DER = "}"
DOBLECOR = "[]"

//----------
MAS = "+"
MENOS = "-"
POR = "*"
DIV = "/"
PTCOMA = ";"
DOSPUT = ":"
PUNTO = "."
IGUAL = "="
DOBLEIGUAL = "=="
DOLLAR = "$"
COMA = ","
MENOR = "<"
MAYOR = ">"
DISTINTO = "!="
//palabras reservadas
// Funciones
VOID = "void"
MAIN = "main"
DEFINIR_GLOVALES = "definirglobales"
GRAFICA_BARRAS = "graficabarras"
GRAFICA_PIE = "graficapie"
// grafica Barras variables
TITULO = "titulo"
EJEX = "ejex"
VALORES = "valores"
TITULOX = "titulox"
TITULOY = "tituloy"
// AND OR 
AND = "&&"
OR = "||"
NOT = "!"

//buquels y if y switch
IF = "if"
ELSE = "else"
WHILE = "while"
DO = "do"
CASE = "case"
SWITCH = "switch"
BRAKE = "break"
DEFAULT = "default"
CONSOLE = "console"
WRITE = "write"
FOR = "for"
// Tipos de datos
STRING = "string"
INT = "int"
CHAR = "char"
BOOL = "bool"
//---------
TRUE = "true"
FALSE = "false"
DOUBLE = "double"
NEWVALOR = "newvalor"

//expresiones
ENTERO  = [0-9]+   
DECIMAL = [0-9]+("."[  |0-9]+)?
DATO_STRING  = \"[^\"]*\"
DATO_CHAR = \'[^']\'
NOMBRE_DATO = [a-zA-z0-9]+
COMEN_1 = \/\/[^\n]*\n
COMEN_2 = "/*"([a-zA-Z0-9]+|[^*])*?"*/"
SPACE   = [\ \r\t\f\t]
ENTER   = [\ \n]
%%
<YYINITIAL> {DOBLEIGUAL}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DOBLEIGUAL"));return new Symbol(sym.DOBLEIGUAL, yyline, yycolumn,yytext());} 
<YYINITIAL> {AND}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"AND"));return new Symbol(sym.AND, yyline, yycolumn,yytext());} 
<YYINITIAL> {OR}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"OR"));return new Symbol(sym.OR, yyline, yycolumn,yytext());} 
<YYINITIAL> {NOT}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"NOT"));return new Symbol(sym.NOT, yyline, yycolumn,yytext());} 
<YYINITIAL> {DOBLECOR}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DOBLECOR"));return new Symbol(sym.DOBLECOR, yyline, yycolumn,yytext());} 
<YYINITIAL> {GRAFICA_PIE}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"GRAFICA_PIE"));return new Symbol(sym.GRAFICA_PIE, yyline, yycolumn,yytext());} 
<YYINITIAL> {TITULO}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"TITULO"));return new Symbol(sym.TITULO, yyline, yycolumn,yytext());} 
<YYINITIAL> {EJEX}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"EJEX"));return new Symbol(sym.EJEX, yyline, yycolumn,yytext());} 
<YYINITIAL> {VALORES}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"VALORES"));return new Symbol(sym.VALORES, yyline, yycolumn,yytext());} 
<YYINITIAL> {TITULOX}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"TITULOX"));return new Symbol(sym.TITULOX, yyline, yycolumn,yytext());} 
<YYINITIAL> {TITULOY}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"TITULOY"));return new Symbol(sym.TITULOY, yyline, yycolumn,yytext());} 
//Simbolos
<YYINITIAL> {GRAFICA_BARRAS}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"GRAFICA_BARRAS"));return new Symbol(sym.GRAFICA_BARRAS, yyline, yycolumn,yytext());} 
<YYINITIAL> {DEFINIR_GLOVALES}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DEFINIR_GLOVALES"));return new Symbol(sym.DEFINIR_GLOVALES, yyline, yycolumn,yytext());}
<YYINITIAL> {NEWVALOR}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"NEWVALOR"));return new Symbol(sym.NEWVALOR, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_IZQ}   {  List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"PAR_IZQ"));return new Symbol(sym.PAR_IZQ, yyline, yycolumn,yytext());}
<YYINITIAL> {PAR_DER}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"PAR_DER"));return new Symbol(sym.PAR_DER, yyline, yycolumn,yytext()); }
<YYINITIAL> {COR_IZQ}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"COR_IZQ"));return new Symbol(sym.COR_IZQ, yyline, yycolumn,yytext());}
<YYINITIAL> {COR_DER}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"COR_DER"));return new Symbol(sym.COR_DER, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_IZQ}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"LLAVE_IZQ"));return new Symbol(sym.LLAVE_IZQ, yyline, yycolumn,yytext());}
<YYINITIAL> {LLAVE_DER}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"LLAVE_DER"));return new Symbol(sym.LLAVE_DER, yyline, yycolumn,yytext());}
<YYINITIAL> {PTCOMA}    {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"PTCOMA"));return new Symbol(sym.PTCOMA, yyline, yycolumn,yytext());}
<YYINITIAL> {MAS}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"MAS"));return new Symbol(sym.MAS, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOS}     {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"MENOS"));return new Symbol(sym.MENOS, yyline, yycolumn,yytext());}
<YYINITIAL> {POR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"POR"));return new Symbol(sym.POR, yyline, yycolumn,yytext());}
<YYINITIAL> {DIV}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DIV"));return new Symbol(sym.DIV, yyline, yycolumn,yytext());}
<YYINITIAL> {DOSPUT}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DOSPUT"));return new Symbol(sym.DOSPUT, yyline, yycolumn,yytext());}
<YYINITIAL> {PUNTO}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"PUNTO"));return new Symbol(sym.PUNTO, yyline, yycolumn,yytext());}
<YYINITIAL> {IGUAL}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"IGUAL"));return new Symbol(sym.IGUAL, yyline, yycolumn,yytext());}
<YYINITIAL> {DOLLAR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DOLLAR"));return new Symbol(sym.DOLLAR, yyline, yycolumn,yytext());}
<YYINITIAL> {COMA}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"COMA"));return new Symbol(sym.COMA, yyline, yycolumn,yytext());}
<YYINITIAL> {MENOR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"MENOR"));return new Symbol(sym.MENOR, yyline, yycolumn,yytext());}
<YYINITIAL> {MAYOR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"MAYOR"));return new Symbol(sym.MAYOR, yyline, yycolumn,yytext());}
<YYINITIAL> {DISTINTO}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DISTINTO"));return new Symbol(sym.DISTINTO, yyline, yycolumn,yytext());}
//Palabras Reservadas 
// Funciones
<YYINITIAL> {VOID}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"VOID"));return new Symbol(sym.VOID, yyline, yycolumn,yytext());}
<YYINITIAL> {MAIN}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"MAIN"));return new Symbol(sym.MAIN, yyline, yycolumn,yytext());}
<YYINITIAL> {IF}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"IF"));return new Symbol(sym.IF, yyline, yycolumn,yytext());}
<YYINITIAL> {ELSE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"ELSE"));return new Symbol(sym.ELSE, yyline, yycolumn,yytext());}
<YYINITIAL> {WHILE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"WHILE"));return new Symbol(sym.WHILE, yyline, yycolumn,yytext());}
<YYINITIAL> {DO}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DO"));return new Symbol(sym.DO, yyline, yycolumn,yytext());}
<YYINITIAL> {CASE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"CASE"));return new Symbol(sym.CASE, yyline, yycolumn,yytext());}
<YYINITIAL> {SWITCH}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"SWITCH"));return new Symbol(sym.SWITCH, yyline, yycolumn,yytext());}
<YYINITIAL> {BRAKE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"BRAKE"));return new Symbol(sym.BRAKE, yyline, yycolumn,yytext());}
<YYINITIAL> {DEFAULT}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DEFAULT"));return new Symbol(sym.DEFAULT, yyline, yycolumn,yytext());}
<YYINITIAL> {CONSOLE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"CONSOLE"));return new Symbol(sym.CONSOLE, yyline, yycolumn,yytext());}
<YYINITIAL> {WRITE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"WRITE"));return new Symbol(sym.WRITE, yyline, yycolumn,yytext());}
<YYINITIAL> {FOR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"FOR"));return new Symbol(sym.FOR, yyline, yycolumn,yytext());}
//Tipos de datos
<YYINITIAL> {STRING}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"STRING"));return new Symbol(sym.STRING, yyline, yycolumn,yytext());}
<YYINITIAL> {INT}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"INT"));return new Symbol(sym.INT, yyline, yycolumn,yytext());}
<YYINITIAL> {CHAR}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"CHAR"));return new Symbol(sym.CHAR, yyline, yycolumn,yytext());}
<YYINITIAL> {BOOL}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"BOOL"));return new Symbol(sym.BOOL, yyline, yycolumn,yytext());}
<YYINITIAL> {TRUE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"TRUE"));return new Symbol(sym.TRUE, yyline, yycolumn,yytext());}
<YYINITIAL> {FALSE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"FALSE"));return new Symbol(sym.FALSE, yyline, yycolumn,yytext());}
<YYINITIAL> {DOUBLE}       {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DOUBLE"));return new Symbol(sym.DOUBLE, yyline, yycolumn,yytext());}
//Expresiones Regulares
<YYINITIAL> {DATO_CHAR}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DATO_CHAR"));return new Symbol(sym.DATO_CHAR, yyline, yycolumn,yytext());}
<YYINITIAL> {ENTERO}    {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"ENTERO"));return new Symbol(sym.ENTERO, yyline, yycolumn,yytext());}
<YYINITIAL> {DECIMAL}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DECIMAL"));return new Symbol(sym.DECIMAL, yyline, yycolumn,yytext());}
<YYINITIAL> {DATO_STRING}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DATO_STRING"));return new Symbol(sym.DATO_STRING, yyline, yycolumn,yytext());}
<YYINITIAL> {NOMBRE_DATO}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"NOMBRE_DATO"));return new Symbol(sym.NOMBRE_DATO, yyline, yycolumn,yytext());}
<YYINITIAL> {DEFINIR_GLOVALES}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"DEFINIR_GLOVALES"));return new Symbol(sym.DEFINIR_GLOVALES, yyline, yycolumn,yytext());}
<YYINITIAL> {GRAFICA_BARRAS}   {   List_Tokens_Scanner.Insertar_Symbolo(new Symbols(yyline,yycolumn,yytext(),"GRAFICA_BARRAS"));return new Symbol(sym.GRAFICA_BARRAS, yyline, yycolumn,yytext());}

//Comentarios
<YYINITIAL> {SPACE}     { /*Espacios en blanco, ignorados*/ }
<YYINITIAL> {ENTER}     { /*Saltos de linea, ignorados*/}
<YYINITIAL> {COMEN_1}     { /*Ignora comentarios de una linea*/}
<YYINITIAL> {COMEN_2}     { /*Ignora comentarios multilinea*/}
// Errores Lexicos
<YYINITIAL> . {
        List_Error_Scanner.Insertar_Symbolo(new Symbols(yyline+1,yycolumn+1,yytext()));
        
}