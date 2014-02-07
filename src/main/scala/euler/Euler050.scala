package euler

import util.Common._

object Euler050 extends App {
  
  val ps = primes.takeWhile(_ < 1000000)
  val primeSet = ps.toSet

  val upperLimit =
    Stream.from(1).find(n => ps.take(n).sum > 1000000).get -1

  def result:Int = {
    for (i <- upperLimit to 1 by -1) yield {
      ps.takeWhile(_ < 5000).sliding(i).foreach{ n =>
        val total = n.sum
        if (total < 1000000 && primeSet(total))
          return total
      }
    }
    0
  }

  println(result)
}