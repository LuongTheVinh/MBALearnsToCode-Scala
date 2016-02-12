abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
  def union(that: IntSet): IntSet
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {

  override def toString = "{" + left + elem + right + "}"

  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this

  def union(that: IntSet): IntSet =
    ((left union right) union that) incl elem
}


object Empty extends IntSet {

  override def toString = "."

  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  def union(that: IntSet): IntSet = that
}


val t1 = new NonEmpty(3, Empty, Empty)
val t2 = t1 incl 4

t1 contains 3
t2 contains 3

val t3 = t1 incl 5
val tu = t2 union t3
