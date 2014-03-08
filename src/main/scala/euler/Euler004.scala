package euler

import util.Implicit._

object Euler004 extends App {
  val items = for (i <- 100 to 999; j <- i+1 to 999; if (i*j).isPalindrome)
    yield i*j
  println(items max)
}
