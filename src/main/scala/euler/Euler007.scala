package Euler

import main.util.Implicit._

object Euler007 extends App {
  def primeCount(n:BigInt,c:Int):BigInt = n match {
    case x if (c == 10001) => x-1
    case x if (x.isPrime)  => primeCount(x+1,c+1)
    case x                 => primeCount(x+1,c)   
  }
  println(primeCount(1,0))
}
