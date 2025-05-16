program Test5;
 const max = 10; min = 1;
 var resultado : INTEGER;
 procedure operaciones (a:INTEGER; b:INTEGER) : REAL;
 begin
   resultado := a + b - a * b div a mod b ;
   nada(resultado);
 end;

 function nada(resultado:INTEGER):INTEGER;
 begin
    a := nada;
 end;

 begin
    a := 5;
    b := 5;
    operaciones(a,b);
 end.