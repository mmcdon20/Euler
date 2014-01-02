package euler

object Euler009 extends App {
  for (a <- 1 to 1000; b <- 1 to 1000; c <- 1 to 1000)
    if ((a < b && b < c) && (a*a + b*b == c*c) && (a + b + c == 1000))
      println(a*b*c)
}
