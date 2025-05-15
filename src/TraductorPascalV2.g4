grammar TraductorPascalV2;

// Programa principal
prg: 'program' ID ';' blq '.' {
    System.out.println("#include <stdio.h>\nint main() {");
    System.out.println($blq.s);
    System.out.println("return 0;\n}");
};
blq returns [String s]: dcllist 'begin' sentlist 'end' { $s = $dcllist.s + $sentlist.s; };
dcllist returns [String s]: dcl dcllistP { $s = $dcl.s + $dcllistP.s; };
dcllistP returns [String s]: dcl dcllistP { $s = $dcl.s + $dcllistP.s; } | { $s = ""; };
sentlist returns [String s]: sent sentlistP { $s = $sent.s + $sentlistP.s; };
sentlistP returns [String s]: sent sentlistP { $s = $sent.s + $sentlistP.s; } | { $s = ""; };

// Zona de declaraciones
dcl returns [String s]
    : defcte { $s = $defcte.s; }
    | defvar { $s = $defvar.s; }
    | defproc { $s = $defproc.s; }
    | deffun { $s = $deffun.s; };
defcte returns [String s]: 'const' ctelist { $s = "// Const declarations\n" + $ctelist.s; System.out.println($s); };
ctelist returns [String s]: ID '=' simpvalue ';' ctelistP { $s = "const " + $ID.text + " = " + $simpvalue.text + ";\n" + $ctelistP.s; };
ctelistP returns [String s]: ID '=' simpvalue ';' ctelistP { $s = "const " + $ID.text + " = " + $simpvalue.text + ";\n" + $ctelistP.s; } | { $s = ""; };
simpvalue: CONSTLIT | CONSTREAL | CONSTINT;
defvar returns [String s]: 'var' defvarlist ';' { $s = $defvarlist.s + ";"; System.out.println($s); };
defvarlist returns [String s]: varlist ':' tbas ';' defvarlistP { $s = $tbas.s + " " + $varlist.s + ";\n" + $defvarlistP.s; };
defvarlistP returns [String s]: varlist ':' tbas ';' defvarlistP { $s = $tbas.s + " " + $varlist.s + ";\n" + $defvarlistP.s; } | { $s = ""; };
varlist returns [String s]: ID varlistP { $s = $ID.text + $varlistP.s; };
varlistP returns [String s]: ',' ID varlistP { $s = ", " + $ID.text + $varlistP.s; } | { $s = ""; };
defproc returns [String s]: 'procedure' ID formal_paramlist ';' blq ';' {
  $s = "void " + $ID.text + $formal_paramlist.s + " {\n" + $blq.s + "}\n";
};
deffun returns [String s]: 'function' ID formal_paramlist ':' tbas ';' blq ';' {
  $s = $tbas.s + " " + $ID.text + $formal_paramlist.s + " {\n" + $blq.s + "}\n";
};
formal_paramlist returns [String s]: '(' formal_param formal_param_tail ')' { $s = "(" + $formal_param.s + ")"; } | { $s = "()"; };
formal_param_tail returns [String s]: ';' formal_param formal_param_tail { $s = ", " + $formal_param.s + $formal_param_tail.s; } | { $s = ""; };
formal_param returns [String s]: varlist ':' tbas { $s = $tbas.s + " " + $varlist.s; };
tbas returns [String s]: 'INTEGER' { $s = "int"; } | 'REAL' { $s = "float"; };

// Zona de sentencias
sent returns [String s]: asig ';' { $s = $asig.s + ";\n"; } | proc_call ';' { $s = $proc_call.s + ";\n"; };
asig returns [String s]: ID ':=' exp { $s = $ID.text + " = " + $exp.s; };
exp returns[String s]: factor exp_tail { $s = $factor.s + $exp_tail.s; };
exp_tail returns[String s]: op factor exp_tail { $s = $op.s + $factor.s + $exp_tail.s; } | { $s = ""; };
op returns[String s]: '+' { $s = "+"; } | '-' { $s = "-"; } | '*' { $s = "*"; } | 'div' { $s = "/"; } | 'mod' { $s = "%"; };
factor returns[String s]: simpvalue { $s = $simpvalue.text; } | '(' exp ')' { $s = "(" + $exp.s + ")"; } | ID subparamlist { $s = $ID.text + $subparamlist.s; };
subparamlist returns[String s]: '(' explist ')' { $s = "(" + $explist.s + ")"; } | { $s = ""; };
explist returns[String s]: exp explist_tail { $s = $exp.s + $explist_tail.s; };
explist_tail returns[String s]: ',' exp explist_tail { $s = "," + $exp.s + $explist_tail.s; } | { $s = ""; };
proc_call returns[String s]: ID subparamlist { $s = $ID.text + $subparamlist.s; };

// Definiciones léxicas
fragment Letras: [a-zA-Z];
fragment Digitos: [0-9];

ID: Letras (Letras | Digitos | '_')*;
CONSTINT: [+-]? Digitos+;
CONSTREAL: [+-]? Digitos* '.' Digitos+ ([eE] [+-]? Digitos+)?;
CONSTLIT: '\'' ( ~[\\'\r\n] | '\\\'' )* '\'';

// Ignorar comentarios y espacios en blanco
LINE: '{' ~('}')* '}' -> skip;
COMMENT: '(*' .*? '*)' -> skip;
IGNORE: [ \t\r\n]+ -> skip;