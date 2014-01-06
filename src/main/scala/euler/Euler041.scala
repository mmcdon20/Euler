package euler

import util.Implicit._

object Euler041 extends App {
  val range     = (123 to 321) ++ (1234 to 4321) ++ (12345 to 54321) ++ (123456 to 654321) ++ (1234567 to 7654321)
  val pandigits = range.par.filter(_.isPandigit)
  val primes    = pandigits.filter(_.isPrime)
  println(primes max)
}
