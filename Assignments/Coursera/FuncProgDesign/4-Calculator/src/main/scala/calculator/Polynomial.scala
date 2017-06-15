package calculator


import math.sqrt


object Polynomial {
  def computeDelta(a: Signal[Double], b: Signal[Double],
      c: Signal[Double]): Signal[Double] = {
    Signal(
      b() * b() - 4 * a() * c()
    )
  }

  def computeSolutions(a: Signal[Double], b: Signal[Double],
      c: Signal[Double], delta: Signal[Double]): Signal[Set[Double]] = {
    Signal({
      val d = delta()

      if (d > 0) {
        val r = sqrt(d)

        Set(
          (-b() + r ) / (2 * a()),
          (-b() - r) / (2 * a())
        )
      } else if (d == 0)
        Set(-b() / (2 * a()))

      else
        Set()
    })
  }
}
