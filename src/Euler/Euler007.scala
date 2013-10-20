package Euler

import Util.Common._

object Euler007 extends App {
  def primeCount(n:Long,c:Int):Long = n match {
    case x if (c == 10001) => x-1
    case x if (isPrime(x)) => primeCount(x+1,c+1)
    case x                 => primeCount(x+1,c)   
  }
  println(primeCount(1,0))
}
