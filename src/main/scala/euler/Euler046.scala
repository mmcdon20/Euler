package euler

import util.Common._

object Euler046 extends App {
  val ps  = primes.takeWhile(_ < 100000)
  val tss = Stream.from(1).map(n => n*n*2)
  val ocs = Stream.from(2).filter(n => n%2 != 0 && !ps.takeWhile(_ <= n).contains(n))

  def goldbach(n: Int): Boolean = {
    for (p <- ps; t <- tss.takeWhile(p + _ <= n); if p + t == n)
      return false
    true
  }

  val result = ocs.find(goldbach)

  println(result.get)
}
