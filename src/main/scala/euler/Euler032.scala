package euler

object Euler032 extends App {
  val pans = "123456789".permutations.toSet

  def process(x:Int, y:Int) = 
    if (pans(""+x+y+(x*y))) x*y
    else 0
  
  val nums = for (i <- 1 to 100; j <- 101 to 10000) yield process(i,j)  
  println (nums.distinct.sum)
}
