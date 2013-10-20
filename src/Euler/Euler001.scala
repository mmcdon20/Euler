package Euler

object Euler001 extends App {
  val n = (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).sum
  println(n)
}
