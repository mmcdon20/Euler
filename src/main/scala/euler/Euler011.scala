package euler

import scala.io.Source
import scala.util.Try

object Euler011 extends App {
  val file = Source.fromFile("src/main/resources/11.txt").getLines()
  val grid = file.toArray.map(_.split(" ").map(_.toInt))

  def get(x: Int, y: Int) = Try(grid(y)(x)).getOrElse(0)

  def hor(x: Int, y: Int) = (0 to 3).map(i => get(x+i,y+0)).product
  def ver(x: Int, y: Int) = (0 to 3).map(i => get(x+0,y+i)).product
  def di1(x: Int, y: Int) = (0 to 3).map(i => get(x+i,y+i)).product
  def di2(x: Int, y: Int) = (0 to 3).map(i => get(x+i,y-i)).product

  val result = for (i <- 0 to 19; j <- 0 to 19)
    yield List(hor(i,j),ver(i,j),di1(i,j),di2(i,j)).max

  println(result max)
}
