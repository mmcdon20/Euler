package Euler

object Euler048 extends Application {  
  val answer = (1 to 1000).map(x => BigInt(x).pow(x)).sum
  println(answer.toString.takeRight(10))
}
