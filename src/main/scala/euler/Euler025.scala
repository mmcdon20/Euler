package euler

import util.Common._

object Euler025 extends App {
  val result = fibs.indexWhere(_.toString.length >= 1000)
  println(result)
}
