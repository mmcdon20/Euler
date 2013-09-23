package Euler

import Util.Common._

object Euler016 extends Application {
  val x = BigInt(2).pow(1000).toString.toList.map(_.toInt-48).sum
  print(x)
}