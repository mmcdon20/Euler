package euler

object Euler033 extends App {

  case class Fraction(numerator: Int, denominator: Int) {
    private def gcd(a: Int, b: Int) =
      (scala.math.max(a,b) to 1 by -1).find(n => a%n == 0 && b%n == 0).get

    def simplify =
      Fraction(numerator/gcd(numerator,denominator), denominator/gcd(numerator,denominator))

    def isCurious =
      numerator%10 == denominator/10%10 && simplify == Fraction(numerator/10%10,denominator%10).simplify

    def *(that: Fraction) =
      Fraction(this.numerator*that.numerator,this.denominator*that.denominator).simplify
  }

  val result = (for (a <- 10 to 99; b <- a+1 to 99) yield Fraction(a,b))
    .filter(_.isCurious).foldLeft(Fraction(1,1))(_*_).denominator

  println(result)
}
