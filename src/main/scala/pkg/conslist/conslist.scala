package pkg.conslist


trait List[T] {

  def isEmpty: Boolean
  def head: T
  def tail: List[T]

  def nth(n: Int): T =
    if (n == 0) head else tail.nth(n - 1)
}


class Nil[T] extends List[T] {
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}


class Cons[T](val head: T, val tail: List[T]) extends List[T] {

  def isEmpty = false

  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
}
