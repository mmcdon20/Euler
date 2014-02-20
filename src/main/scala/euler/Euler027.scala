package euler

import util.Common._
import scala.math.abs

object Euler027 extends App {
  val primeSet = primes.takeWhile(_ < 1000).toSet

  def formula (a:Int, b:Int, n:Int) =
    primeSet(abs(n*n + a*n + b))

  def comboLength(a:Int, b:Int, n:Int = 0): Int =
    if (formula(a,b,n)) comboLength(a,b,n+1)
    else n

  val combos =
    for (a <- -999 to 999; b <- a to 999)
      yield (comboLength(a,b),a*b)

  val result = combos.par.maxBy(_._1)

  println(result._2)
}
