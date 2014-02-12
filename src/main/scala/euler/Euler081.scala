package euler

import scala.math.min
import scala.io.Source

object Euler081 extends App {
  val file = Source.fromFile("src/main/resources/81.txt").getLines()
  val matrix: List[List[Int]]  = file.map(_.split(",").map(_.toInt).toList).toList
  val table: Array[Array[Int]] = Array.ofDim(80,80)

  for (i <- 79 to 0 by -1; j <- 79 to 0 by -1) (i,j) match {
    case (79,79) => table(i)(j) = matrix(i)(j)
    case (79,_)  => table(i)(j) = matrix(i)(j) + table(i)(j+1)
    case (_,79)  => table(i)(j) = matrix(i)(j) + table(i+1)(j)
    case _       => table(i)(j) = matrix(i)(j) + min(table(i)(j+1), table(i+1)(j))
  }

  println(table(0)(0))
}
