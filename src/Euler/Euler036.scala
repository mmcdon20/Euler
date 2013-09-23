package Euler

import Util.Common._

object Euler036 extends Application {
  
  def isDoublePalindrome(n:BigInt) = 
    isPalindrome(n) && isPalindrome(toBinary(n))
  
  val nums = (1 to 1000000).filter(isDoublePalindrome(_))
  
  print (nums sum)
  
}
