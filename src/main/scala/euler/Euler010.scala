package Euler

import main.util.Common
import Common._

object Euler010 extends App {
  println((1L to 2000000L).filter(isPrime).sum)  
}
