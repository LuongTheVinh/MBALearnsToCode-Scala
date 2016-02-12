import math.abs


val ClosenessRelTol = 1e-3


def fixedPoint(func: Double => Double)(firstGuess: Double): Double = {

  def isClose(x: Double, y: Double) =
    abs((x - y) / x) < ClosenessRelTol

  def recursiveGuess(guess: Double): Double = {

    val nextGuess = func(guess)

    if (isClose(guess, nextGuess)) guess else recursiveGuess(nextGuess)

  }

  recursiveGuess(firstGuess)
}


fixedPoint((x: Double) => 1 + x / 2)(.0)


fixedPoint(guess => (guess + 2.0 / guess) / 2)(1.0)
