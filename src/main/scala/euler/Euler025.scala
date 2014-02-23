package euler

object Euler025 extends App {
  val fibs: Stream[BigInt] = BigInt(0) #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
  val result = fibs.indexWhere(_.toString.length >= 1000)
  println(result)
}
