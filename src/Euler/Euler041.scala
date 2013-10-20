package Euler

import Util.Common._

object Euler041 extends App {
  val pandigits3 = (123 to 321).filter(x => isPandigit(x.toString,3))
  val pandigits4 = (1234 to 4321).filter(x => isPandigit(x.toString,4))
  val pandigits5 = (12345 to 54321).filter(x => isPandigit(x.toString,5))
  val pandigits6 = (123456 to 654321).filter(x => isPandigit(x.toString,6))
  val pandigits7 = (1234567 to 7654321).filter(x => isPandigit(x.toString,7))
  
  val all = pandigits3 ++ pandigits4 ++ pandigits5 ++ pandigits6 ++ pandigits7
  val primes = all.filter(isPrime(_))

  println(primes max)
}
