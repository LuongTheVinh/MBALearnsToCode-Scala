def mapReduce(
               mapFunc: Int => Double)(
                reduceFunc: (Double, Double) => Double,
                reduceAccForEmpty: Double)(
                  fromInt: Int,
                  toInt: Int): Double = {

  def recursive_reduce(acc: Double, i: Int): Double =
    if (i > toInt) acc
      else recursive_reduce(reduceFunc(acc, mapFunc(i)), i + 1)

  recursive_reduce(reduceAccForEmpty, fromInt)

}


// Sum of Integers from 10 to 20
mapReduce(x => x)((x, y) => x + y, 0)(10, 20)


// Sum of Cubes of Integers from 2 to 4
mapReduce(x => x * x * x)((x, y) => x + y, 0)(2, 4)

// 0!
mapReduce(x => x)((x, y) => x * y, 1)(1, 0)


// 6!
mapReduce(x => x)((x, y) => x * y, 1)(1, 6)
