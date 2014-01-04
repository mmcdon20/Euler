package euler

object Euler031 extends App {
  var coins = List(1,2,5,10,20,50,100,200)
  var table = Array.ofDim[Int](201)
  table(0) = 1

  for (i <- 0 until coins.length; j <- coins(i) until 201)
    table(j) += table(j - coins(i))

  println (table last)
}
