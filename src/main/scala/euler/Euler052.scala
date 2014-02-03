package euler

object Euler052 extends App {
  val ints = Stream.from(1)

  def isPermutedMultiples(x: Int) = {
    val permutations = (1 to 6).map(n => (n * x).toString.toSet)
    permutations.forall(_ == permutations(0))
  }

  println(ints.find(isPermutedMultiples(_)).get)
}
