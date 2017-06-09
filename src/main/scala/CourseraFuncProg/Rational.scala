package pkg


import math.{abs, signum}


class Rational(x: Int, y: Int) {

  // require Denominator to be non-zero
  require(
    y != 0,
    "Denominator must be non-zero!")

  /** define another class constructor with just Numerator,
    assuming Denominator is 1 */
  def this(x: Int) =
    this(x, 1)

  // define function to calculate Greatest Common Divisor
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) abs(a) else gcd(b, a % b)

  // calculate Greatest Common Divisor
  private val g = gcd(x, y)

  // get the sign of Denominator
  private val sgn = signum(y)

  // define simplified Numerator & Denominator
  val numer = sgn * x / g
  val denom = sgn * y / g

  // define how to print the object
  override def toString = numer + "/" + denom

  // define unary operations
  def pos =
    this

  def unary_+ =
    pos

  def neg =
    new Rational(
      - numer,
      denom
    )

  def unary_- =
    neg

  def inv =
    new Rational(
      denom,
      numer
    )

  // define binary operations
  def eq(that: Rational) =
    numer * that.denom == denom * that.numer

  def ==(that: Rational) =
    eq(that)

  def ne(that: Rational) =
    !eq(that)

  def !=(that: Rational) =
    ne(that)

  def gt(that: Rational) =
    denom * that.denom * (that.denom * numer - denom * that.numer) > 0

  def >(that: Rational) =
    gt(that)

  def ge(that: Rational) =
    >(that) || ==(that)

  def >=(that: Rational) =
    ge(that)

  def lt(that: Rational) =
    that.gt(this)

  def <(that: Rational) =
    lt(that)

  def le(that: Rational) =
    <(that) || ==(that)

  def <=(that: Rational) =
    le(that)

  def max(that: Rational) =
    if (>(that)) this else that

  def min(that: Rational) =
    if (<(that)) this else that

  def add(that: Rational) =
    new Rational(
      that.denom * numer + denom * that.numer,
      denom * that.denom
    )

  def +(that: Rational) =
    add(that)

  def sub(that: Rational) =
    this + (-that)

  def -(that: Rational) =
    sub(that)

  def mul(that: Rational) =
    new Rational(
      numer * that.numer,
      denom * that.denom
    )

  def *(that: Rational) =
    mul(that)

  def div(that: Rational) =
    mul(that.inv)

  def /(that: Rational) =
    div(that)
}
