package euler

import util.Common._

object Euler005 extends App {
  val result = (1 to 20).foldLeft(1L)(lcm(_,_))
  println(result)
}
