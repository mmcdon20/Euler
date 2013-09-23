package Euler

object Euler006 extends Application {
  val A = (1 to 100).map(Math.pow(_, 2)).sum
  val B = Math.pow((1 to 100).sum, 2)
  val C = B - A
  println(C.toInt)
}
