package euler

import util.Common._

object Euler055 extends App {

  def isLychrel(n: BigInt, i: Int = 0): Boolean =
    (n + BigInt(n.toString.reverse),i) match {
      case (_,_) if i == 50         => true
      case (r,_) if isPalindrome(r) => false
      case (r,_)                    => isLychrel(r,i+1)
    }

  val result = (1 to 10000).count(isLychrel(_))
  println(result)
}
