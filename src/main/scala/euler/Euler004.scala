package euler

import util.Implicit._

object Euler004 extends App {
  var xs:List[Int] = Nil
   
  for (i <- 100 to 999; j <- 100 to 999; if ((i*j).isPalindrome))
    xs = (i*j) :: xs
    
  println(xs max)
}
