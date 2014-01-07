package euler

object Euler022 extends App {
  
  def getValue(s:String):Int = s.toCharArray.map(_.toInt-64).sum
  
  val source  = scala.io.Source.fromFile("src/main/resources/22.txt").mkString
  val names   = source.replaceAll("\"","").split(",").sortWith(_<_)
  val index   = names.zipWithIndex
  val numbers = index.map(x => getValue(x._1) * (x._2+1))
  val answer  = numbers.sum
  
  println(answer)

}