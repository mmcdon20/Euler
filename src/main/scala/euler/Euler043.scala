package Euler

object Euler043 extends App {
  
  def isSubDivisible(s:String) = {
    if      (s.substring(1, 4).toInt %  2 != 0) false
    else if (s.substring(2, 5).toInt %  3 != 0) false
    else if (s.substring(3, 6).toInt %  5 != 0) false
    else if (s.substring(4, 7).toInt %  7 != 0) false
    else if (s.substring(5, 8).toInt % 11 != 0) false
    else if (s.substring(6, 9).toInt % 13 != 0) false
    else if (s.substring(7,10).toInt % 17 != 0) false
    else                                         true
  }
  
  val nums = "1234567890".permutations
  val result = nums.filter(isSubDivisible(_)).map(BigInt(_)).sum
  println(result)
}