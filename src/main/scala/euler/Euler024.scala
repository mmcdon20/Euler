package euler

object Euler024 extends App {
  val permutaions = "0123456789".permutations
  println(permutaions.drop(999999).next)
}
