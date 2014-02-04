package euler

object Euler039 extends App {

  val triangles = for {
      p <- 1 to 1000
      a <- 1 to p
      b <- 1 to p-a
      if a*a + b*b == (p-a-b)*(p-a-b)
    } yield p

  val result = triangles.map(t => (t, triangles.count(_ == t))).maxBy(_._2)

  println(result._1)
}
