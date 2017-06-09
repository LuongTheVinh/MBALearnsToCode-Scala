package pkg.natnum


abstract class Nat {
  def isZero: Boolean
  def pred: Nat
  def succ = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}


object Zero extends Nat {
  def isZero = true
  def pred = throw new NoSuchElementException("Zero has no predecessor")
  def +(that: Nat) = that
  def -(that: Nat) =
    if (that.isZero) Zero
      else throw new NoSuchElementException("Negative number")
}


class Succ(n: Nat) extends Nat {
  def isZero = false
  def pred = n
  def +(that: Nat) = new Succ(n + that)
  def -(that: Nat) =
    if (that.isZero) this
      else n - that.pred
}
