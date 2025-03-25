grammar TraductorPascalPruebaC;

// Programa principal
prg: 'program' ID ';' blq '.' { System.out.println("#include <stdio.h>\nint main() {"); };
blq: dcllist 'begin' sentlist 'end' { System.out.println("return 0;\n}"); };
dcllist: dcl dcllist | ;
sentlist: sent sentlist | ;

// Zona de declaraciones
dcl: defcte | defvar | defproc | deffun;
defcte: 'const' ctelist;
ctelist: ID '=' simpvalue ';' ctelist | ID '=' simpvalue ';';
simpvalue: CONSTLIT | CONSTREAL | CONSTINT;
defvar: 'var' defvarlist ';';
defvarlist: varlist ':' tbas ';' defvarlist | varlist ':' tbas;
varlist: ID ',' varlist | ID;
defproc: 'procedure' ID formal_paramlist ';' blq ';';
deffun: 'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist: '(' formal_param formal_param_tail ')' | ;
formal_param_tail: ';' formal_param formal_param_tail | ;
formal_param: varlist ':' tbas;
tbas: 'INTEGER' { System.out.print("int "); } | 'REAL' { System.out.print("float "); };

// Zona de sentencias
sent: asig ';' | proc_call ';';
asig: ID ':=' exp { System.out.println($ID.text + " = " + $exp.text + ";"); };
exp: factor exp_tail;
exp_tail: op factor exp_tail | ;
op: '+' | '-' | '*' | 'div' { System.out.print("/"); } | 'mod' { System.out.print("%"); };
factor: simpvalue | '(' exp ')' | ID subparamlist;
subparamlist: '(' explist ')' | ;
explist: exp explist_tail;
explist_tail: ',' exp explist_tail | ;
proc_call: ID subparamlist { System.out.println($ID.text + "();"); };

// Definiciones léxicas
fragment Letras: [a-zA-Z];
fragment Digitos: [0-9];

ID: Letras (Letras | Digitos | '_')*;
CONSTINT: [+-]? Digitos+;
CONSTREAL: [+-]? Digitos* '.' Digitos+ ([eE] [+-]? Digitos+)?;
CONSTLIT: '\'' (~['\r\n])* '\'';

// Ignorar comentarios y espacios en blanco
LINE: '{' ~('}')* '}' -> skip;
COMMENT: '(*' .*? '*)' -> skip;
IGNORE: [ \t\r\n]+ -> skip;
