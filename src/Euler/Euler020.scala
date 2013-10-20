package Euler

import Util.Common._

object Euler020 extends App {
  val answer = getDigits(factorial(100)).sum
  println(answer)
}