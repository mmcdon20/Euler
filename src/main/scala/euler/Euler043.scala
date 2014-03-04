package euler

object Euler043 extends App {

  def submod(a: Int, b: Int, c: Int, d: Int) =
    distinct(a,b,c) && (a*100+b*10+c) % d == 0

  def distinct(a: Int, b: Int, c: Int) =
    a != b && b != c && c != a

  val digits = 0 to 9
  var total = 0L

  for {
    b <- digits
    c <- digits
    d <- digits
    if submod(b,c,d,2)
    e <- digits
    if submod(c,d,e,3)
    f <- digits
    if submod(d,e,f,5)
    g <- digits
    if submod(e,f,g,7)
    h <- digits
    if submod(f,g,h,11)
    i <- digits
    if submod(g,h,i,13)
    j <- digits
    if submod(h,i,j,17)
    a <- digits
    str = ""+a+b+c+d+e+f+g+h+i+j
    if str.distinct.size == 10
    num = str.toLong
  } total += num

  println(total)
}
