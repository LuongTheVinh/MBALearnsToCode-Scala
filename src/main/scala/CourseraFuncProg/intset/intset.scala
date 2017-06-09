package pkg.intset


abstract class IntSet {
  def contains(x: Int): Boolean

  def incl(x: Int): IntSet

  def union(that: IntSet): IntSet
}


class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  override def toString = "{" + left + elem + right + "}"

  def contains(x: Int): Boolean =
    if (x < elem)
      left contains x

    else if (x > elem)
      right contains x

    else
      true

  def incl(x: Int): IntSet =
    if (x < elem)
      new NonEmpty(elem, left incl x, right)

    else if (x > elem)
      new NonEmpty(elem, left, right incl x)

    else
      this

  def union(that: IntSet): IntSet =
    ((left union right) union that) incl elem
}


object Empty extends IntSet {
  override def toString = "."

  def contains(x: Int): Boolean = false

  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)

  def union(that: IntSet): IntSet = that
}
