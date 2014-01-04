package euler

import scala.io.Source
import util.Implicit._

object Euler008 extends App {
  val file = Source.fromFile("src/main/resources/8.txt")
  val nums = file.toList.filter(_.isDigit).map(_.toDigit)
  val gp = nums.sliding(5).map(_.product).max
  println(gp)
}