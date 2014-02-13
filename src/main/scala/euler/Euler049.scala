package euler

import util.Common._

object Euler049 extends App {
  val ps = primes.dropWhile(_ < 1000).takeWhile(_ < 10000).toList

  val result = for {
    a <- ps
    perms = a.toString.permutations.map(_.toInt).toList
    b <- perms.filter(n => n > a && ps.contains(n))
    c = b + b - a
    if perms.contains(c) && ps.contains(c)
  } yield s"$a$b$c"

  println(result.last)
}
