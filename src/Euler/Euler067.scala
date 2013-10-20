package Euler

import scala.io.Source
import Util.Common._

object Euler067 extends App {
  val file = Source.fromFile("src/Data/67.txt").getLines
  val triangle = file.map(_.split(" ").map(BigInt(_))).toList
  println(trianglePath(triangle))
}
