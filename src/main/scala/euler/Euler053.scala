package euler

object Euler053 extends App {

  def fact(n: BigInt) = (BigInt(2) to n).product
  def combos(n: BigInt, r: BigInt) = fact(n)/(fact(r)*fact(n-r))

  val result =
    (1 to 100).map(n => (1 to n).count(r => combos(n,r) > 1000000)).sum

  println(result)
}
