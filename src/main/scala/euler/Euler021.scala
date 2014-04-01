package euler

object Euler021 extends App {

  def d(n: Int) =
    (1 to n/2).filter(n % _ == 0).sum

  def amicable(a: Int)(b: Int = d(a)) =
    d(b) == a && a != b

  val total =
    (1 until 10000).par.filter(amicable(_)( )).sum

  println(total)
}
