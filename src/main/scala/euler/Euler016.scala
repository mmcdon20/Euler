package euler

object Euler016 extends App {
  val x = BigInt(2).pow(1000).toString.toList.map(_.toInt-48).sum
  println(x)
}