package Euler

import Util.Common._

object Euler050 extends App {
  
  val primes = (1 to 500000).filter(isPrime(_))
  
  // incomplete
  
  primes foreach println
}