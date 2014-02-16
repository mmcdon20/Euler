package euler

import scala.math.abs

object Euler044 extends App {
  def pentagonal(n: Int) = n*(3*n-1)/2
  def pentPair(a: Int, b: Int) = pentSet(a-b) && pentSet(a+b)

  val pentNumbers = Stream.from(1).map(pentagonal)
  val pentList = pentNumbers.take(3000).toList
  val pentSet = pentList.toSet

  val result = for {
    a <- pentList
    b <- pentList.takeWhile(_ < a)
    if pentPair(a,b)
  } yield abs(a-b)

  println(result min)
}
