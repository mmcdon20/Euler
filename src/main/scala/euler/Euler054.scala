package euler

object Euler054 extends App {

  case class Card(name: String) {
    val suit  = name(1)
    val value = name(0) match {
      case 'A' => 14
      case 'K' => 13
      case 'Q' => 12
      case 'J' => 11
      case 'T' => 10
      case  n  => n.asDigit
    }
  }

  case class Hand(cs: Array[Card]) {
    val cards           = cs.toList.sortBy(_.value)
    val groups          = cards.groupBy(_.value)
    val highCard        = cards.last.value
    val highPair        = groups.maxBy(_._2.length)._1
    val isFlush         = List('H','D','C','S').exists(suit => cards.forall(_.suit == suit))
    val isStraight      = cards.indices.forall(i => if (i==0) true else cards(i).value == cards(i-1).value+1)
    val isStraightFlush = isStraight && isFlush
    val isRoyalFlush    = isFlush && cards.map(_.value) == List(10,11,12,13,14)
    val isFourOfAKind   = groups.exists(_._2.length == 4)
    val isThreeOfAKind  = groups.exists(_._2.length == 3)
    val isTwoPair       = groups.count(_._2.length == 2) == 2
    val isOnePair       = groups.count(_._2.length == 2) == 1
    val isFullHouse     = isThreeOfAKind && isTwoPair

    val score = if (isRoyalFlush)    (9, highCard)
           else if (isStraightFlush) (8, highCard)
           else if (isFourOfAKind)   (7, highPair)
           else if (isFullHouse)     (6, highPair)
           else if (isFlush)         (5, highCard)
           else if (isStraight)      (4, highCard)
           else if (isThreeOfAKind)  (3, highPair)
           else if (isTwoPair)       (2, highPair)
           else if (isOnePair)       (1, highPair)
           else                      (0, highCard)

    def beats(that: Hand) = score._1 > that.score._1 || score._1 == that.score._1 && score._2 > that.score._2
  }

  val file   = scala.io.Source.fromFile("src/main/resources/54.txt").getLines()
  val rounds = for (line <- file; (h1,h2) = line.split(" ").map(Card).splitAt(5)) yield (Hand(h1),Hand(h2))
  val result = rounds.count(players => players._1 beats players._2)
  println(result)
}
