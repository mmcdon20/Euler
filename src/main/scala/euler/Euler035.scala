package euler

import util.Common._

object Euler035 extends App {
  val primeSet = primes.takeWhile(_ < 1000000).toSet

  def rotations(n: Int) = {
    val s = n.toString
    (0 until s.length).map(swap(s,_))
  }

  def swap(s: String, n: Int) = {
    val (a,b) = s.splitAt(n)
    (b+a).toInt
  }

  def isCircularPrime(n: Int) =
    if (n == 2 || n.toString.forall(_.asDigit % 2 == 1))
      rotations(n).forall(primeSet)
    else false

  val result = (1 until 1000000).count(isCircularPrime)
  println(result)
}
