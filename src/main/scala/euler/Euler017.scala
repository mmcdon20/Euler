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
    9 -> "Nine"
  ).mapValues(_.length)
  val teens = Map(
    1 -> "Eleven",
    2 -> "Twelve",
    3 -> "Thirteen",
    4 -> "Fourteen",
    5 -> "Fifteen",
    6 -> "Sixteen",
    7 -> "Seventeen",
    8 -> "Eighteen",
    9 -> "Nineteen"
  ).mapValues(_.length)
  val tens = Map(
    1 -> "Ten",
    2 -> "Twenty",
    3 -> "Thirty",
    4 -> "Forty",
    5 -> "Fifty",
    6 -> "Sixty",
    7 -> "Seventy",
    8 -> "Eighty",
    9 -> "Ninety"
  ).mapValues(_.length)
  val hundreds = Map(
    1 -> "OneHundred",
    2 -> "TwoHundred",
    3 -> "ThreeHundred",
    4 -> "FourHundred",
    5 -> "FiveHundred",
    6 -> "SixHundred",
    7 -> "SevenHundred",
    8 -> "EightHundred",
    9 -> "NineHundred"
  ).mapValues(_.length)
  val thousands = Map(
    1 -> "OneThousand",
    2 -> "TwoThousand",
    3 -> "ThreeThousand",
    4 -> "FourThousand",
    5 -> "FiveThousand",
    6 -> "SixThousand",
    7 -> "SevenThousand",
    8 -> "EightThousand",
    9 -> "NineThousand"
  ).mapValues(_.length)

  def getNumber(n: Int): Int = n match {
    case _ if n < 10                      => ones(n)
    case _ if n < 100 && n > 10 && n < 20 => teens(n%10)
    case _ if n < 100 && n % 10 == 0      => tens(n/10)
    case _ if n < 100                     => tens(n/10) + getNumber(n%10)
    case _ if n < 1000 && n % 100 == 0    => hundreds(n/100)
    case _ if n < 1000                    => hundreds(n/100) + "And".length + getNumber(n%100)
    case _ if n < 10000 && n % 1000 == 0  => thousands(n/1000)
    case _                                => ???
  }

  val answer = (1 to 1000).map(getNumber).sum
  println(answer)
}