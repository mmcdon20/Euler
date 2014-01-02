package Euler

import scala.io.Source
import main.util.Common._

object Euler067 extends App {
  val file = Source.fromFile("data/67.txt").getLines
  val triangle = file.map(_.split(" ").map(BigInt(_))).toList
  println(trianglePath(triangle))
}
