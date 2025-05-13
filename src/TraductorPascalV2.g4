grammar TraductorPascalV2;

// Programa principal
prg: 'program' ID ';' blq '.' { System.out.println("#include <stdio.h>\nint main() {"); };
blq: dcllist 'begin' sentlist 'end' { System.out.println("return 0;\n}"); };
dcllist: dcl dcllistP;
dcllistP: dcl dcllistP | ;
sentlist: sent sentlistP;
sentlistP: sent sentlistP | ;

// Zona de declaraciones
dcl: defcte | defvar | defproc | deffun;
defcte: 'const' ctelist;
ctelist: ID '=' simpvalue ';' ctelistP;
ctelistP: ID '=' simpvalue ';' ctelistP | ;
simpvalue: CONSTLIT | CONSTREAL | CONSTINT;
defvar: 'var' defvarlist ';';
defvarlist: varlist ':' tbas ';' defvarlistP;
defvarlistP: varlist ':' tbas ';' defvarlistP | ;
varlist: ID varlistP;
varlistP: ',' ID varlistP | ;
defproc: 'procedure' ID formal_paramlist ';' blq ';';
deffun: 'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist: '(' formal_param formal_param_tail ')' | ;
formal_param_tail: ';' formal_param formal_param_tail | ;
formal_param: varlist ':' tbas;
tbas: 'INTEGER' { System.out.print("int "); } | 'REAL' { System.out.print("float "); };

// Zona de sentencias
sent: asig ';' | proc_call ';';
asig: ID ':=' exp { System.out.println($ID.text + " = " + $exp.s + ";"); };
exp returns[String s]: factor exp_tail { $s = $factor.s + $exp_tail.s; };
exp_tail returns[String s]: op factor exp_tail { $s = $op.s + $factor.s + $exp_tail.s; } | { $s = ""; };
op returns[String s]: '+' { $s = "+"; } | '-' { $s = "-"; } | '*' { $s = "*"; } | 'div' { $s = "/"; } | 'mod' { $s = "%"; };
factor returns[String s]: simpvalue { $s = $simpvalue.text; } | '(' exp ')' { $s = "(" + $exp.s + ")"; } | ID subparamlist { $s = $ID.text + $subparamlist.s; };
subparamlist returns[String s]: '(' explist ')' { $s = "(" + $explist.s + ")"; } | { $s = ""; };
explist returns[String s]: exp explist_tail { $s = $exp.s + $explist_tail.s; };
explist_tail returns[String s]: ',' exp explist_tail { $s = "," + $exp.s + $explist_tail.s; } | { $s = ""; };
proc_call returns[String s]: ID subparamlist { System.out.println($ID.text + $subparamlist.s + ";"); $s = ""; };

// Definiciones léxicas
fragment Letras: [a-zA-Z];
fragment Digitos: [0-9];

ID: Letras (Letras | Digitos | '_')*;
CONSTINT: [+-]? Digitos+;
CONSTREAL: [+-]? Digitos* '.' Digitos+ ([eE] [+-]? Digitos+)?;
CONSTLIT: '\'' ( ~[\\'\r\n] | '\\' )* '\'';

// Ignorar comentarios y espacios en blanco
LINE: '{' ~('}')* '}' -> skip;
COMMENT: '(*' .*? '*)' -> skip;
IGNORE: [ \t\r\n]+ -> skip;
