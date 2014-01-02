package euler

object Euler012 extends App {
  
  def tri(n:Long) = (1L to n).sum 
  def div(n:Long) = (1L to n).filter(n%_==0L).length 
  
  def divisors(x:Long) = {
    var limit = x
    var divs = 0L;
    var i = 1L
    
    while (i <= x) {
      if (x % i == 0L) {
        limit = x / i;
        if (limit != i) {
          divs += 1L
        }
        divs += 1L
      }
      i += 1L
    }
    divs
  }
  
  def triangle(x:Long) = {
    var sum = 0L
    var n = 1L
    
    while (n <= x) { 
      sum += n
      n += 1L
    }
    
    sum
  }
  
  def over500(n:Long):Long = n match {
    case x if (divisors(triangle(x)) > 500L) => x
    case x                                   => over500(x+1)
  }

  println(over500(1L))
}