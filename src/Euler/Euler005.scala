/*

2520 is the smallest number that can be divided 
by each of the numbers from 1 to 10 without any 
remainder.

What is the smallest positive number that is 
evenly divisible by all of the numbers from 
1 to 20?

*/

package Euler

object Euler005 extends Application {
  def isDivisible(i:Int):Boolean = {
    for (j <- 1 to 20)
      if (i % j != 0)
        return false
    true
  }
    
  def findDivisible(i:Int):Int = i match {
    case x if (isDivisible(x)) => x
    case x                     => findDivisible(x+20)
  }
    
  println(findDivisible(20))
}
