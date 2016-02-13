package pkg.conslist


trait List[+T] { // "+" sign to make List type co-variant

  def isEmpty: Boolean
  def head: T
  def tail: List[T]

  def nth(n: Int): T =
    if (isEmpty) throw new IndexOutOfBoundsException
      else if (n == 0) head
      else tail.nth(n - 1)

  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}


object Nil extends List[Nothing] { // Nothing is sub-type of all types!
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}


class Cons[T](val head: T, val tail: List[T]) extends List[T] {

  def isEmpty = false

  def singleton[T](elem: T) = new Cons[T](elem, Nil)
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
