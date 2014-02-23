package euler

object Euler097 extends App {
  val n = BigInt(2).modPow(7830457,10000000000L) * 28433 + 1
  val result = n.toString.takeRight(10)
  println(result)
}
