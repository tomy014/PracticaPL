grammar TraductorPascal;

// REGLAS SINTÁCTICAS

// Programa principal
prg: 'program' ID ';' blq '.';
blq: dcllist 'begin' sentlist 'end';
dcllist:  | dcllist dcl;
sentlist: sent | sentlist sent;



// Zona de declaraciones
dcl: defcte | defvar | defproc | deffun;
defcte: 'const' ctelist;
ctelist: ID '=' simpvalue ';'
       | ctelist ID '=' simpvalue ';';
simpvalue: CONSTINT | CONSTREAL | CONSTLIT;
defvar: 'var' defvarlist ';';
defvarlist: varlist ':' tbas
          | defvarlist ';' varlist ':' tbas;
varlist: ID | ID ',' varlist;
defproc: 'procedure' ID formal_paramlist ';' blq ';';
deffun: 'function' ID formal_paramlist ':' tbas ';' blq ';';
formal_paramlist:  | '(' formal_param ')';
formal_param: varlist ':' tbas
            | varlist ':' tbas ';' formal_param;
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


