package euler

import util.Common._

object Euler002 extends App {
  val result = fibs.takeWhile(_ <= 4000000).filter(_ % 2 == 0).sum
  println(result)
}
