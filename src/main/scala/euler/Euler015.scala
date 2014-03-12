package euler

object Euler015 extends App {

  def pathCount(n:Int):BigInt = {
    val grid = Array.ofDim[BigInt](n+1, n+1)
    for (i <- 0 to n)              grid(0)(i) = 1L
    for (i <- 0 to n)              grid(i)(0) = 1L
    for (i <- 1 to n; j <- 1 to n) grid(i)(j) = grid(i-1)(j) + grid(i)(j-1)
    grid(n)(n)
  }
  
  println(pathCount(20))
}
