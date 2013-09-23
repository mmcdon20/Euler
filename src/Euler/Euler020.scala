package Euler

import Util.Common._

object Euler020 extends Application {
  val answer = getDigits(factorial(100)).sum
  println(answer)
}