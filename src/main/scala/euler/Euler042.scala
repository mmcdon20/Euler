package euler

import scala.io.Source

object Euler042 extends App {
  val source = Source.fromFile("src/main/resources/42.txt")
  val words  = source.mkString.filter(_ != '"').split(",")

  def triangle(n: Int) = (0.5 * n) * (n + 1)
  def value(letter: Char) = letter - 64

  val triStream  = Stream.from(1).map(triangle(_))
  val wordValues = words.map(_.foldLeft(0)(_ + value(_)))

  val triWords   = wordValues.count { value =>
    triStream.takeWhile(_ <= value).contains(value)
  }

  println(triWords)
}
