package euler

import util.Common._

object Euler047 extends App {
  def fourPrimeFactors(n: Int) = primeSet.count(n%_ == 0) == 4
  val primeSet = primes.takeWhile(_ < 1000).toSet
  val result = Stream.from(1).sliding(4).find(_.forall(fourPrimeFactors))
  println(result.get(0))
}
