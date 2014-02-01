package euler

import util.Common.primes

object Euler003 extends App {
  println(primes.take(1000).filter(600851475143L % _ == 0).max)
}
