package Euler

import scala.io.Source
import main.util.Implicit._

object Euler008 extends App {
  val file = Source.fromFile("data/8.txt")
  val nums = file.toList.filter(_.isDigit).map(_.toDigit)
    
  // solution 1
  def greatestProduct(xs:List[Int], p:Int):Int = xs match {
    case a::b::c::d::e::fs =>
      if (a*b*c*d*e > p)
        greatestProduct(b::c::d::e::fs, a*b*c*d*e)
      else
        greatestProduct(b::c::d::e::fs, p)
    case _ => p
  }
    
  // solution 2
  val gp = nums.sliding(5).map(_.product).max
    
  println(greatestProduct(nums, 0))
  println(gp)
}