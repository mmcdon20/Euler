package euler

object Euler028 extends App {

  def compute(acc: Int, size: Int) =
    acc + 4 * size * size - 6 * size + 6

  val spiral =
    (3 to 1001 by 2).foldLeft(1)(compute(_,_))

  println(spiral)
}
