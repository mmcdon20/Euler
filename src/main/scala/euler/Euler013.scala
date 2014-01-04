package euler

import scala.io.Source

object Euler013 extends App {
  val file = Source.fromFile("src/main/resources/13.txt").getLines
  val numbers = file.map(BigInt(_))
  println(numbers sum)
}