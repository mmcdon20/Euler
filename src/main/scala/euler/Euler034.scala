package Euler

import main.util.Implicit._

object Euler034 extends App {
  def isSumOfFactDigits(n:BigInt) = n == n.getDigits.map(_.factorial).sum
  val numbers = (3 to 1000000).filter(isSumOfFactDigits(_))
  println (numbers sum)
}
