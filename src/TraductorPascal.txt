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
asig returns[String s] : ID ':=' exp { System.out.println($ID.text + " = " + $exp.text + ";"); };
exp: exp op exp | factor;
op: oparit;
oparit returns[String s] : '+' {$s = "+"} | '-' {$s = "-"} | '*' {$s = "*"} | 'div' {$s = "/"}  | 'mod' {$s = "%"} ;
factor returns[String s] : simpvalue {$s = $simpvalue.text;} | '(' exp ')' {$s = "("+$exp.text+")";} | ID subparamlist {$s = $ID.text + $subparamlist.text;};
subparamlist returns[String s] : '(' explist ')' {$s = "("+$explist.s+")";} | {$s = "";};
explist returns[String s] : exp | exp ',' explist;
proc_call returns[String s] : ID subparamlist { $s = $ID.text + $subparamlist.s;};

// Definiciones léxicas
fragment Letras: [a-zA-Z];
fragment Digitos: [0-9];

ID: Letras (Letras | Digitos | '_')*;
CONSTINT: [+-]? Digitos+;
CONSTREAL: [+-]? Digitos+ '.' Digitos+ ([eE] [+-]? Digitos+)? | [eE]+ ([+-]? Digitos+)?;
CONSTLIT: '\'' ( ~[\\'\r\n] | '\\\'')* '\'';

// Ignorar comentarios y espacios en blanco
LINE: '{' ~('}')* '}' -> skip;
COMMENT: '(*' .*? '*)' -> skip;

IGNORE: [ \t\r\n]+ -> skip;


//Parte opcional
// Zona de sentencias de control de flujo


// Zona de librerías y programas

