package Util

object Common {
  
  def isPalindrome(n:BigInt):Boolean = n.toString == n.toString.reverse
  def isPalindrome(n:String):Boolean = n == n.reverse
  def factorial(n:BigInt):BigInt = (BigInt(1) to n).product
  def getDigits(n:BigInt) = n.toString.toCharArray.map(BigInt(_) - 48)
  def toBinary(n:BigInt) = Integer.toBinaryString(n.toInt)
  
  def isPandigit(n:String,l:Int) = {
    val isLength = n.length == l
    val isDistinct = n.distinct.length == l
    val isInRange = n.sortWith(_<_).toList == ('1' to (l+48).toChar).toList
    isLength && isDistinct && isInRange
  }
  
  def isPrime(n:Long):Boolean = {
    if (n == 1)
      return false
    if (n == 2)
      return true
    if (n%2==0) 
      return false
    for (i <- 3 to (Math.sqrt(n).toInt) by 2)
      if(n%i==0)
        return false
    true
  }
  
  def isPrime(n:BigInt):Boolean = {
    if (n == 1)
      return false
    if (n == 2)
      return true
    if (n%2==0) 
      return false
    for (i <- 3 to (Math.sqrt(n.toDouble).toInt) by 2)
      if(n%i==0)
        return false
    true
  }
  
  def fib(n:BigInt):BigInt = {
    def tail(n:BigInt, b:BigInt, a:BigInt):BigInt = n match {
      case n if (n == 0) => a 
      case _                     => tail( n -1, a + b, b)
    }
    tail(n,1,0)
  }
  
  def isNumber(s:String):Boolean = {
    for (i <- s.toCharArray)
      if (!i.isDigit)
        return false
    true
  }
  
  def trianglePath(triangle:List[Array[scala.math.BigInt]]):BigInt = {
    var size = triangle.size
    var grid = Array.ofDim[BigInt](size, size)
    for (i <- 0 until size) {
      for (j <- 0 to i) {
        if ( (i,j) == (0,0) ) {
          grid(i)(j) = triangle(i)(j)
        } else {
          val up = grid(i-1)
          val a1 = if (up.isDefinedAt(j))   up(j)   else BigInt(0)
          val a2 = if (up.isDefinedAt(j-1)) up(j-1) else BigInt(0)        
          grid(i)(j) = triangle(i)(j) + 
            (if (a1 == null) a2 else if(a2 == null) a1 else if (a1 > a2) a1 else a2)
        }
      }
    }
    grid(size-1) max
  }
  
}
