package euler

object Euler024 extends App {
  val permutations = "0123456789".permutations
  println(permutations.drop(999999).next)
}
