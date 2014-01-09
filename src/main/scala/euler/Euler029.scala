package euler

import scala.math.pow

object Euler029 extends App {
  val items =
    for (a <- 2 to 100; b <- 2 to 100) yield pow(a,b)

  println(items.distinct.size)
}
