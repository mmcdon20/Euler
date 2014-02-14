package euler

object Euler016 extends App {
  val result = BigInt(2).pow(1000).toString.map(_.asDigit).sum
  println(result)
}