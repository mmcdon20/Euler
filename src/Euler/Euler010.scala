package Euler

import Util.Common._

object Euler010 extends Application {
  println((1L to 2000000L).filter(isPrime).sum)  
}
