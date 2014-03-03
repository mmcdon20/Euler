package euler

import util.Common._

object Euler037 extends App {
  val primeList = primes.takeWhile(_ < 1000000).toList
  val primeSet = primeList.toSet

  def isTruncatablePrime(n: Int)(s: String = n.toString) =
    (1 until s.length).forall(i => primeSet(s.drop(i).toInt) && primeSet(s.take(i).toInt))

  val result = primeList.dropWhile(_ < 10).filter(isTruncatablePrime(_)( )).sum
  println(result)
}
