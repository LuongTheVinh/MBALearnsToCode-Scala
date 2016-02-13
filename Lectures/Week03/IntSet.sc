import pkg.intset.{Empty, NonEmpty}


val t1 = new NonEmpty(3, Empty, Empty)
val t2 = t1 incl 4

t1 contains 3
t2 contains 3

val t3 = t1 incl 5
val tu = t2 union t3
