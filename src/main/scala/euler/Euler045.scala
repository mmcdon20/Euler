package euler

object Euler045 extends App {

  def triangle(n: Long)   = n*(n+1)/2
  def pentagonal(n: Long) = n*(3*n-1)/2
  def hexagonal(n: Long)  = n*(2*n-1)

  val tris  = (286 to 100000).map(triangle(_)).toSet
  val pens  = (165 to 100000).map(pentagonal(_)).toSet
  val hexes = (143 to 100000).map(hexagonal(_)).toSet

  val result = tris & pens & hexes

  println(result min)
}
