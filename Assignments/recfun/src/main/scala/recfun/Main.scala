package recfun


import scala.annotation.{switch, tailrec}


object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    if ((c == 0) || (c == r))
      1

    else
      pascal(c = c - 1, r = r - 1) +
        pascal(c = c, r = r - 1)
  
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def netNOpenBrackets(acc: Int, charList: List[Char]): Int =
      if (acc < 0)
        -1

      else if (charList.isEmpty)
        acc

      else
        netNOpenBrackets(
          acc = acc +
            ((charList.head: @switch) match {
               case '(' => 1
               case ')' => -1
               case _ => 0
             }),
          charList = charList.tail
        )

    netNOpenBrackets(
      acc = 0,
      charList = chars
    ) == 0
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int], sorted: Boolean = false): Int = {
    if (money < 0)
      0

    else if (money == 0)
      1

    else if (coins.isEmpty)
      0

    else {
      val sortedCoins = if (sorted) coins else coins.sorted

      countChange(
        money = money - sortedCoins.head,
        coins = sortedCoins,
        sorted = true
      ) +
        countChange(
          money = money,
          coins = sortedCoins.tail,
          sorted = true
        )
    }
  }
}
