package euler

object Euler023 extends App {
  def divisorSum(n: Int) = {
    (2 to Math.sqrt(n).toInt).foldLeft(1) { (sum, element) =>
      if (n % element == 0)
        sum + element + (if (n/element == element) 0 else n/element)
      else
        sum
    }
  }

  def isAbundant(n: Int) = divisorSum(n) > n

  val range    = Array.range(1,28123)
  val items    = scala.collection.mutable.Set[Int]() ++= range
  val abundant = range.filter(isAbundant)
  val length   = abundant.length

  for {
    i <- 0 until length
    j <- (i until length).takeWhile(abundant(_) + abundant(i) <= 28123)
  } items -= abundant(i) + abundant(j)

  val result = items.sum
  println(result)
}
