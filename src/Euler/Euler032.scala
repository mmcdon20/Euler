package Euler

import Util.Common._

object Euler032 extends App {
  def process(x:Int, y:Int) = 
    if (isPandigit(""+x+y+(x*y),9)) 
      x*y 
    else 
      0
  
  val nums = for (i <- 1 to 100; j <- 101 to 10000) yield process(i,j)  
  println (nums.distinct.sum)
}
