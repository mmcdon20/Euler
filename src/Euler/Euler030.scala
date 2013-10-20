package Euler

import Util.Common._

object Euler030 extends App {
  
  def isSumOfDigitsOfPow(n:BigInt,p:Int):Boolean = 
    n == getDigits(n).map(_.pow(p)).sum
  
  val pow5 = (2 to 1000000).filter(isSumOfDigitsOfPow(_,5))
  val answer = pow5.sum
  
  println(answer)

}
