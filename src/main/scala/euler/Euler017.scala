package euler

object Euler017 extends App {
  val ones = Map(
    1 -> "One",
    2 -> "Two",
    3 -> "Three",
    4 -> "Four",
    5 -> "Five",
    6 -> "Six",
    7 -> "Seven",
    8 -> "Eight",
    9 -> "Nine")
  val teens = Map(
    1 -> "Eleven",
    2 -> "Twelve",
    3 -> "Thirteen",
    4 -> "Fourteen",
    5 -> "Fifteen",
    6 -> "Sixteen",
    7 -> "Seventeen",
    8 -> "Eighteen",
    9 -> "Nineteen")
  val tens = Map(
    1 -> "Ten",
    2 -> "Twenty",
    3 -> "Thirty",
    4 -> "Forty",
    5 -> "Fifty",
    6 -> "Sixty",
    7 -> "Seventy",
    8 -> "Eighty",
    9 -> "Ninety")
  val hundreds = Map(
    1 -> "OneHundred",
    2 -> "TwoHundred",
    3 -> "ThreeHundred",
    4 -> "FourHundred",
    5 -> "FiveHundred",
    6 -> "SixHundred",
    7 -> "SevenHundred",
    8 -> "EightHundred",
    9 -> "NineHundred")
  val thousands = Map(
    1 -> "OneThousand",
    2 -> "TwoThousand",
    3 -> "ThreeThousand",
    4 -> "FourThousand",
    5 -> "FiveThousand",
    6 -> "SixThousand",
    7 -> "SevenThousand",
    8 -> "EightThousand",
    9 -> "NineThousand")
  
  def getNumber(n:Int):String = n match {
    case x if (x.toString.length == 1) => 
      ones(x)
    case x if (x.toString.length == 2) => 
      if (x > 10 && x < 20)
        teens(x.toString.drop(1).toInt)
      else if (x.toString.endsWith("0"))
        tens(x.toString.take(1).toInt)
      else 
        tens(x.toString.take(1).toInt) + 
          getNumber(x.toString.drop(1).toInt)
    case x if (x.toString.length == 3) => 
      if (x.toString.endsWith("00"))
        hundreds(x.toString.take(1).toInt)
      else
        hundreds(x.toString.take(1).toInt) +
          "And" + getNumber(x.toString.drop(1).toInt)
    case x if (x.toString.length == 4) =>
      if (x.toString.endsWith("000"))
        thousands(x.toString.take(1).toInt)
      else 
        ""
  }
  
  val answer = (1 to 1000).map(getNumber(_).length).sum
  println(answer)
}