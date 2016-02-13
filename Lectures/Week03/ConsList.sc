import pkg.conslist.{Cons, Nil, List}


val list = new Cons(1, new Cons(2, new Cons(3, Nil)))

list.nth(0)
list.nth(2)

// list.nth(-1)
// list.nth(3)


val list_0 = List()

val list_1 = List(0)
list_1.nth(0)

val list_2 = List(0, 1)
list_2.nth(0)
list_2.nth(1)
