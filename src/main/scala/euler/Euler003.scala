/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

package Euler

import main.util.Implicit._

object Euler003 extends App {
  var n = BigInt("600851475143")
  var x = BigInt(3)
  while (x <= (n/2)+1) {
    if (n % x == 0)
      if (x.isPrime)
        println(x)
    x = x + 2
  }
}
