package euler

object Euler023 extends App {
  def properDivisorSum(n: Int) = (1 to n/2).filter(n % _ == 0).sum
  def isAbundant(n: Int) = properDivisorSum(n) > n

  val range    = Array.range(1,28123)
  val items    = scala.collection.mutable.Set[Int]() ++= range
  val abundant = range.par.filter(isAbundant)
  val length   = abundant.length

  for {
    i <- 0 until length
    j <- (i until length).takeWhile(abundant(_) + abundant(i) <= 28123)
  } items -= abundant(i) + abundant(j)

  val result = items.sum
  println(result)
}
