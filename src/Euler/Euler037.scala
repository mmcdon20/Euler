package Euler

import Util.Common._

object Euler037 extends Application {
  
  def isTruncatablePrime(n:BigInt):Boolean = {
    var num1 = n
    var num2 = n
    while (num1.toString.length > 1) {
      if (!isPrime(num1) || !isPrime(num2)) 
        return false
      num1 = num1.toString.drop(1).toInt
      num2 = num2.toString.dropRight(1).toInt
    }
    isPrime(num1) && isPrime(num2)
  }
  
  val x = (10 to 1000000).filter(isTruncatablePrime(_)).sum
  println(x)
  
}
