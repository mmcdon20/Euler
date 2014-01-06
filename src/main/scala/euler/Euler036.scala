package euler

import util.Implicit._

object Euler036 extends App {
  
  def isDoublePalindrome(n:BigInt) = 
    n.isPalindrome && n.toBinary.isPalindrome
  
  val nums = (1 to 1000000).filter(isDoublePalindrome(_))
  
  println (nums sum)
  
}
