package euler

import util.Implicit._

object Euler037 extends App {
  def isTruncatablePrime(n: Int): Boolean =
    !(1 until n.toString.length).exists { i =>
      !(n.toString.drop(i).toInt.isPrime &&
        n.toString.take(i).toInt.isPrime)
    } && n.isPrime

  val x = (10 to 1000000).filter(isTruncatablePrime).sum
  println(x)
}
