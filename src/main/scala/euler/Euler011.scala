package euler

import scala.io.Source

object Euler011 extends App {
  val file = Source.fromFile("data/11.txt").getLines
  val grid:List[Array[Int]] = file.toList.map(_.split(" ").map(_.toInt))

  def get(x:Int, y:Int) =
    try {
      grid(y)(x)
    } catch { 
      case _:Exception => 0 
    }
  
  def findHor(x:Int, y:Int) = (0 to 3).map(i => get(x+i,y+0)).product
  def findVer(x:Int, y:Int) = (0 to 3).map(i => get(x+0,y+i)).product
  def findDi1(x:Int, y:Int) = (0 to 3).map(i => get(x+i,y+i)).product
  def findDi2(x:Int, y:Int) = (0 to 3).map(i => get(x+i,y-i)).product
  
  val hor = (for (i <- 0 to 19; j <- 0 to 19) yield findHor(i,j)).max
  val ver = (for (i <- 0 to 19; j <- 0 to 19) yield findVer(i,j)).max
  val di1 = (for (i <- 0 to 19; j <- 0 to 19) yield findDi1(i,j)).max
  val di2 = (for (i <- 0 to 19; j <- 0 to 19) yield findDi2(i,j)).max
  
  println(hor::ver::di1::di2::Nil max)
}


