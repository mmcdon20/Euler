package euler

import scala.io.Source
import util.Common._

object Euler018 extends App {
  val file = Source.fromFile("src/main/resources/18.txt").getLines
  val triangle = file.map(_.split(" ").map(BigInt(_))).toList
  println(trianglePath(triangle))
}
