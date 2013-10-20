package Euler

import Util.Implicit._

object Euler020 extends App {
  val answer = 100.factorial.getDigits.sum
  println(answer)
}