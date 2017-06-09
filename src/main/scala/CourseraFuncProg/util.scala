package pkg


import scala.annotation.tailrec


object util {
  def abs(x: Double): Double =
    if (x < 0) -x else x


  def sqrt(x: Double, tol: Double = 1e-3): Double = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x < tol

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(guess = 1)
  }


  @tailrec
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)


  def factorial(n: Int): Int = {
    def loop(acc: Int, m: Int): Int =
      if (m == 0) acc else loop(acc = m * acc, m = m - 1)

    loop(acc = 1, m = n)
  }


  def rangeMapRed
        (map: Int => Long,
         red: (Long, Long) => Long = (x, y) => x + y,
         zero: Int = 0)
        (a: Int,
         b: Int): Long = {
    @tailrec
    def loop(soFar: Long, a: Int): Long =
      if (a > b)
        soFar

      else
        loop(soFar = red(map(a), soFar), a = a + 1)

    loop(soFar = zero, a = a)
  }
}
