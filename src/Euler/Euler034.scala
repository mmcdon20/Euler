package Euler

import Util.Common._

object Euler034 extends App {
  def isSumOfFactDigits(n:BigInt) = n == getDigits(n).map(factorial(_)).sum
  val numbers = (3 to 1000000).filter(isSumOfFactDigits(_))
  println (numbers sum)
}
