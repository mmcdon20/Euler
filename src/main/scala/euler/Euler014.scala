package Euler

object Euler014 extends App {
  
  def collatz(n:BigInt, c:BigInt = 0):BigInt = n match {
    case n if (n == 1)     => c + 1 
    case n if (n % 2 == 0) => collatz(n/2, c+1)
    case n                 => collatz(3*n+1, c+1)
  }

  val n = (1 until 1000000).map(x => (x, collatz(x))).maxBy(_._2)
  
  println(n)
}
