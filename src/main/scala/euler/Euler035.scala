package euler

import util.Implicit._

object Euler035 extends App {
  def rotations(n: Int) =
    (0 until n.toString.length)
      .map(i => (n.toString.drop(i) + n.toString.take(i)).toInt)

  def isCircularPrime(n: Int) =
    !rotations(n).exists(!_.isPrime)

  val result = (1 until 1000000).par.count(isCircularPrime)
  println(result)
}
