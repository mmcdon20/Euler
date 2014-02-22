package euler

object Euler034 extends App {
  def isSumOfFactDigits(n: Int) =
    n == n.toString.foldLeft(0)((a,b) => a + factDigits(b.asDigit))

  val factDigits = Array(1,1,2,6,24,120,720,5040,40320,362880)
  val numbers    = (3 to 1000000).filter(isSumOfFactDigits)
  println (numbers sum)
}
