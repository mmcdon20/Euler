package euler

object Euler005 extends App {
  val range = 11 to 19

  def findDivisible(n: Int = 20): Int =
    if (range.forall(n%_ == 0)) n
    else findDivisible(n+20)
    
  println(findDivisible())
}
