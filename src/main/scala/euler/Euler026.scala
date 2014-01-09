package euler

object Euler026 extends App {

  val patternSizes =
    (1 to 1000).map(n => (1 to n).find(BigInt(10).modPow(_,n) == 1))

  val maxPosition =
    patternSizes.indexOf(patternSizes.max) + 1

  println(maxPosition)
}
