package euler

import scala.io.Source
import util.Common._

object Euler067 extends App {
  val file = Source.fromFile("src/main/resources/67.txt").getLines()
  val triangle = file.map(_.split(" ").map(BigInt(_))).toList
  println(trianglePath(triangle))
}
