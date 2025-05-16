program Factorial;
var
    num, resultado: INTEGER;

function CalcularFactorial(n: INTEGER): INTEGER;
var
    i, fact: INTEGER;
begin
    fact := 1;
    for i := 1 to n do
        fact := fact * i;
    CalcularFactorial := fact;

begin
    num := 5;
    resultado := CalcularFactorial(num);
end.
