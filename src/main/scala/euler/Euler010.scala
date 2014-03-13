package euler

import util.Common.SieveOfAtkin

object Euler010 extends App {
  println(SieveOfAtkin(2000000).foldLeft(0L)(_+_))
}
