package Euler

import scala.io.Source
import main.util.Common
import Common._

object Euler018 extends App {
  val file = Source.fromFile("data/18.txt").getLines
  val triangle = file.map(_.split(" ").map(BigInt(_))).toList
  println(trianglePath(triangle))
}
