package euler

object Euler038 extends App {

  def isPan(n: String) =
    n.length == 9 && n.toSet == "123456789".toSet

  def concatenateProduct(i: Int, n: Int) =
    (1 to n).map(_*i).foldLeft("")(_+_)

  val items = for {
    i <- 1 to 9999
    n <- 2 to 9
    cp = concatenateProduct(i,n)
    if isPan(cp)
  } yield cp

  println(items.max)

}
