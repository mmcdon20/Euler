package euler

import util.Implicit._

object Euler041 extends App {
  val combos = (3 to 7).map(n => (1 to n).permutations.map(_.mkString.toInt)).flatten
  println(combos.filter(_.isPrime).max)
}
