package Euler

import Util.Common._

object Euler025 extends Application {
  var n = 1
  
  while (fib(n).toString.length < 1000) {
    n += 1
  }
  
  println(n)
}
