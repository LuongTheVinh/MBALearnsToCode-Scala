import pkg.conslist.{Cons, Nil}


val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))


list.nth(0)
list.nth(2)
