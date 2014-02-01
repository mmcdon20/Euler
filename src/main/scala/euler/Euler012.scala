package euler

object Euler012 extends App {

  def divisors(n: Long, c: Int = 2, i: Int = 2): Int = (n,c,i) match {
    case _ if i*i <= n =>
      if (n % i == 0) divisors(n, c+2, i+1)
      else            divisors(n, c, i+1)
    case _ => c
  }

  val triangles: Stream[Long] =
    0L #:: triangles.zipWithIndex.map(n => n._1 + n._2)

  val result = triangles.find(divisors(_) > 500)

  println(result.get)
}