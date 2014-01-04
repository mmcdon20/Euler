package euler

import util.Implicit._

object Euler002 extends App {
  val fibs = (1 to 35)
    .map(_.fib)
    .filter(_ % 2 == 0)
    .filter(_ <= 4000000)
    .sum
  
  println (fibs)
}
