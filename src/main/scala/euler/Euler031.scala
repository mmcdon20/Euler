/*

In England the currency is made up of pound, £, and pence, p, and there are eight coins in general circulation:
  1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).

It is possible to make £2 in the following way:
  1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p

How many different ways can £2 be made using any number of coins?

*/

package euler

object Euler031 extends App {
  // with for comprehension
  val x = for {
    a <- 200 to 0 by -200
    b <- a to 0 by -100
    c <- b to 0 by -50
    d <- c to 0 by -20
    e <- d to 0 by -10
    f <- e to 0 by -5
    g <- f to 0 by -2
  } yield (a,b,c,d,e,f,g)
  println (x length)

  // with dynamic programming
  var coins = List(1,2,5,10,20,50,100,200)
  var table = Array.ofDim[Int](201)
  table(0) = 1 // base case

  for (i <- 0 until coins.length; j <- coins(i) until 201)
    table(j) += table(j - coins(i))

  println (table last)
}
