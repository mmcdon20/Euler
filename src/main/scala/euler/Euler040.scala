package euler

object Euler040 extends App {

  val numbers   = (0 to 1000000).mkString("")
  val positions = List(1, 10, 100, 1000, 10000, 100000, 1000000)
  val result    = for (n <- positions) yield numbers(n).asDigit

  println(result product)

}
