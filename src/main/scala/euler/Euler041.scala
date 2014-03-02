package euler

import util.Implicit._

object Euler041 extends App {
  val range = (3 to 7)
    .map("123456789".combinations)
    .flatten.map(_.permutations)
    .flatten.map(_.toInt)

  val pandigitPrimes =
    range.filter(n => n.isPandigit && n.isPrime)

  println(pandigitPrimes max)
}
