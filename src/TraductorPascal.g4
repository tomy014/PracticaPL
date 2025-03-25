grammar TraductorPascal;

// REGLAS SINTÁCTICAS

// Programa principal
prg: 'program' ID ';' blq '.' { System.out.println("#include <stdio.h>\nint main() {"); };
blq: dcllist 'begin' sentlist 'end' { System.out.println("return 0;\n}"); };
dcllist: dcl dcllist | ;
sentlist: sent sentlist | sent;



// Zona de declaraciones
dcl: defcte | defvar | defproc | deffun;
defcte: 'const' ctelist;
ctelist: ID '=' simpvalue ';' | ctelist ID '=' simpvalue ';';
simpvalue: CONSTINT | CONSTREAL | CONSTLIT;
defvar: 'var' defvarlist ';';
defvarlist: varlist ':' tbas | defvarlist ';' varlist ':' tbas;
varlist: ID | ID ',' varlist;
defproc: 'procedure' ID formal_paramlist ';' blq ';';
deffun: 'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist: '(' formal_param ')' | ;
formal_param: varlist ':' tbas | varlist ':' tbas ';' formal_param;
tbas: 'INTEGER' { System.out.print("int "); } | 'REAL' { System.out.print("float "); };



// Zona de sentencias
sent: asig ';' | proc_call ';';
asig: ID ':=' exp { System.out.println($ID.text + " = " + $exp.text + ";"); };
exp: exp op exp | factor;
op: oparit;
oparit: '+' | '-' | '*' | 'div' { System.out.print("/"); } | 'mod' { System.out.print("%"); };
factor: simpvalue | '(' exp ')' | ID subparamlist;
subparamlist: '(' explist ')' | ;
explist: exp | exp ',' explist;
proc_call: ID subparamlist { System.out.println($ID.text + "();"); };

// Definiciones léxicas
fragment Letras: [a-zA-Z];
fragment Digitos: [0-9];

ID: Letras (Letras | Digitos | '_')*;
CONSTINT: [+-]? Digitos+;
CONSTREAL: [+-]? Digitos+ '.' Digitos+ ([eE] [+-]? Digitos+)? | [eE]+ ([+-]? Digitos+)?; //para permitir que exista solo exponencial
CONSTLIT: '\'' (~['\r\n\\])* '\''; //corregir que permita una barra en el comentario

// Ignorar comentarios y espacios en blanco
LINE: '{' ~('}')* '}' -> skip;
COMMENT: '(*' .*? '*)' -> skip;

IGNORE: [ \t\r\n]+ -> skip;


//Parte opcional
// Zona de sentencias de control de flujo


// Zona de librerías y programas

