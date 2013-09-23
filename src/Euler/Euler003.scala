/*

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

 */

package Euler

import Util.Common._

object Euler003 extends Application {
  var n = 600851475143L
  var x = 3L
  //600851475143L
  while (x <= (n/2L)+1L) {
    if (n % x == 0)
      if (isPrime(x)) 
        println(x)
    x = x + 2
  }
}
