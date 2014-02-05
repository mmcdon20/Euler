package euler

object Euler056 extends App {

  def digitSum(n: BigInt) = n.toString.map(_.asDigit).sum

  val sums = for (a <- BigInt(1) until 100; b <- 1 until 100) yield
    digitSum(a pow b)

  println(sums max)
}
