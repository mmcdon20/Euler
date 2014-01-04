package euler

import util.Implicit._

object Euler020 extends App {
  val answer = 100.factorial.getDigits.sum
  println(answer)
}