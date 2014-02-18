package euler

object Euler023 extends App {
  def properDivisorSum(n: Int) = (1 to n/2).filter(n % _ == 0).sum
  def isAbundant(n: Int) = properDivisorSum(n) > n
  val abundants = (1 to 28123).par.filter(isAbundant)

  val combos = for {
    i <- 0 until abundants.length
    j <- (i until abundants.length)
      .takeWhile(abundants(_) + abundants(i) <= 28123)
  } yield abundants(i) + abundants(j)

  val result = (1 to 28123).sum - combos.toSet.sum

  println(result)
}
