package Euler

import main.util.Implicit
import Implicit._

object Euler037 extends App {
  
  def isTruncatablePrime(n:BigInt):Boolean = {
    var num1 = n
    var num2 = n
    while (num1.toString.length > 1) {
      if (!num1.isPrime || !num2.isPrime)
        return false
      num1 = num1.toString.drop(1).toInt
      num2 = num2.toString.dropRight(1).toInt
    }
    num1.isPrime && num2.isPrime
  }
  
  val x = (10 to 1000000).filter(isTruncatablePrime(_)).sum
  println(x)
  
}
