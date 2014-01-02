/*

A palindromic number reads the same both ways.
The largest palindrome made from the product of
two 2-digit numbers is 9009 = 91 � 99.

Find the largest palindrome made from the product
of two 3-digit numbers.

*/
package euler

import main.util.Implicit._

object Euler004 extends App {
  var xs:List[Int] = Nil
   
  for (i <- 100 to 999; j <- 100 to 999; if ((i*j).isPalindrome))
    xs = (i*j) :: xs
    
  println(xs max)
}
