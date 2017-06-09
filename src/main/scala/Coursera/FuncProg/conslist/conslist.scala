package Coursera.FuncProg.conslist


trait List[+T] {
  // '+' sign to make List type co-variant (sub-typing & super-typing follows T),
  // '-' means contra-variant
  // no '+' nor '-' means non-variant

  def isEmpty: Boolean

  def head: T

  def tail: List[T]

  def apply(n: Int): T =
    if (isEmpty)
      throw new IndexOutOfBoundsException

    else if (n == 0)
      head

    else
      tail(n - 1)

  def prepend[U >: T](elem: U): List[U] =   // >: T is lower bound / sub-type of U; U is super-type
    new Cons(elem, this)
}


object Nil extends List[Nothing] {   // Nothing is sub-type of all types!
  def isEmpty = true

  def head: Nothing =   // Nothing is sub-type of T
    throw new NoSuchElementException("Nil.head")

  def tail: Nothing =   // Nothing is sub-type of List[T]
    throw new NoSuchElementException("Nil.tail")
}


class Cons[T](val head: T, val tail: List[T]) extends List[T] {   // 'val' defines both param & field in the class
  def isEmpty =
    false

  def singleton[T](elem: T) =
    new Cons[T](elem, Nil)
}


// List function to generate a list
object List {
  def apply[T]() =
    Nil

  def apply[T](x0: T) =
    new Cons(x0, Nil)

  def apply[T](x0: T, x1: T): List[T] =
    new Cons(x0, new Cons(x1, Nil))
}
