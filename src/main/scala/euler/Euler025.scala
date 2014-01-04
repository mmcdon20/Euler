package euler

import util.Common._

object Euler025 extends App {
  def count(n: Int = 1): Int =
    if (fib(n).toString.length < 1000) count(n+1) else n
  println(count())
}
