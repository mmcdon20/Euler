package euler

object Euler039 extends App {

  def triple(m: Int, n: Int, k: Int) =
    k*(m*m-n*n) + k*(2*m*n) + k*(m*m+n*n)

  val perms = for {
    m <- 1   to 22
    n <- 1   to m-1
    k <- m+1 to 82
    perimeter = triple(m,n,k)
    if perimeter <= 1000
  } yield perimeter

  val result = perms.groupBy(n => n).maxBy(_._2.length)._1

  println(result)
}
