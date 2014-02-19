package euler

object Euler014 extends App {
  
  def collatz(n: Long, c: Long = 1): Long = n match {
    case _ if n == 1 =>
      c
    case _ if n % 2 == 0 =>
      val i = (n/2).toInt
      if (n/2 < limit && sizes(i) != 0) sizes(i) + c
      else collatz(n/2, c+1)
    case _ =>
      val i = (n*3+1).toInt
      if (n*3+1 < limit && sizes(i) != 0) sizes(i) + c
      else collatz(n*3+1, c+1)
  }

  val limit = 1000000
  val sizes = Array.ofDim[Long](limit)
  for (i <- 1 until limit) sizes(i) = collatz(i)

  println(sizes.indexOf(sizes.max))
}
