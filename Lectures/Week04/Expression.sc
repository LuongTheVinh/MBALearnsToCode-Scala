import pkg.expr.{Num, Sum, Prod}


Sum(Num(1), Num(2))
Prod(Sum(Num(1), Num(2)), Num(3))
Prod(Sum(Num(1), Num(2)), Sum(Num(3), Num(4)))
