package euler

object Euler030 extends App {
  val pows = Array(0,1,32,243,1024,3125,7776,16807,32768,59049)

  def isSumOfDigitsPow5(n: Long) =
    n == n.toString.foldLeft(0L)((a,b) => a + pows(b.asDigit))

  val pow5 = (2 to 1000000).filter(isSumOfDigitsPow5(_))
  val answer = pow5.sum
  
  println(answer)
}
