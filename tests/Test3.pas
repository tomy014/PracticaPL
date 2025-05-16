program OperacionesAritmeticas;
var
    a, b, suma, resta, producto, division, modulo: INTEGER;

function Sumar(x, y: INTEGER): INTEGER;
begin
    Sumar := x + y;
end;

function Restar(x, y: INTEGER): INTEGER;
begin
    Restar := x - y;
end;

function Multiplicar(x, y: INTEGER): INTEGER;
begin
    Multiplicar := x * y;
end;

function Dividir(x, y: INTEGER): INTEGER;
begin
    Dividir := x div y;
end;

function Modulo(x, y: INTEGER): INTEGER;
begin
    Modulo := x mod y;
end;

begin
    a := 10;
    b := 3;
    suma := Sumar(a, b);
    resta := Restar(a, b);
    producto := Multiplicar(a, b);
    division := Dividir(a, b);
    modulo := Modulo(a, b);
end.
