package euler

object Euler003 extends App {
  def largest(n: BigInt, c: BigInt = 0): BigInt = {
    var x = BigInt(3)
    while (n%x != 0 && x*x < n)(x += 1)
    if (x*x < n) largest(n/x,x) else n
  }
  println(largest(BigInt("600851475143")))
}
