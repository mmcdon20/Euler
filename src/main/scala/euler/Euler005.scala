package euler

object Euler005 extends App {
  def isDivisible(i:Int):Boolean = {
    for (j <- 1 to 20)
      if (i % j != 0)
        return false
    true
  }
    
  def findDivisible(i:Int):Int = i match {
    case x if (isDivisible(x)) => x
    case x                     => findDivisible(x+20)
  }
    
  println(findDivisible(20))
}
