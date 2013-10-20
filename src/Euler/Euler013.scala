package Euler

import scala.io.Source

object Euler013 extends App {
  val file = Source.fromFile("src/Data/13.txt").getLines
  val numbers = file.map(BigInt(_))
  println(numbers sum)
}