grammar TraductorPascalV2;

// REGLAS SINTÁCTICAS

// Programa principal
prg: 'program' ID ';' blq '.';
blq: dcllist 'begin' sentlist 'end';
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
tbas: 'INTEGER' | 'REAL';



// Zona de sentencias
sent: asig ';' | proc_call ';';
asig: ID ':=' exp;
exp: exp op exp | factor;
op: oparit;
oparit: '+' | '-' | '*' | 'div' | 'mod';
factor: simpvalue | '(' exp ')' | ID subparamlist;
subparamlist:  | '(' explist ')';
explist: exp | exp ',' explist;
proc_call: ID subparamlist;

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
