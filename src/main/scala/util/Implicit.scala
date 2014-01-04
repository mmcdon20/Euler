package util

object Implicit {
  implicit def wrapChar(c:Char) = {
    class wrapper(c:Char) {
      def toDigit = c-48
    }
    new wrapper(c)
  }

  implicit def wrapString(s:String) = {
    class wrapper(s:String) {
      def isPalindrome = s == s.reverse
      def isNumber:Boolean = {
        for (i <- s.toCharArray)
          if (!i.isDigit)
            return false
        true
      }
      def isPandigit(l:Int) = {
        val isLength = s.length == l
        val isDistinct = s.distinct.length == l
        val isInRange = s.sortWith(_<_).toList == ('1' to (l+48).toChar).toList
        isLength && isDistinct && isInRange
      }
    }
    new wrapper(s)
  }

  implicit def wrapInt(i:Int) = {
    class wrapper(b:BigInt) {
      def toBig        = b
      def isPalindrome = b.toString == b.toString.reverse
      def factorial    = (BigInt(1) to b).product
      def getDigits    = b.toString.toCharArray.map(BigInt(_) - 48)
      def toBinary     = Integer.toBinaryString(b.toInt)

      def isPandigit(l:Int) = {
        val isLength = b.toString.length == l
        val isDistinct = b.toString.distinct.length == l
        val isInRange = b.toString.sortWith(_<_).toList == ('1' to (l+48).toChar).toList
        isLength && isDistinct && isInRange
      }

      def isPandigit = {
        val isDistinct = b.toString.distinct.length == b.toString.length
        val isInRange = b.toString.sortWith(_<_).toList == ('1' to (b.toString.length+48).toChar).toList
        isDistinct && isInRange
      }

      def isPrime:Boolean = {
        if (b == 1)
          return false
        if (b == 2)
          return true
        if (b%2==0)
          return false
        for (i <- 3 to (Math.sqrt(b.toDouble).toInt) by 2)
          if(b%i==0)
            return false
        true
      }

      def fib:BigInt = {
        def tail(n:BigInt, b:BigInt, a:BigInt):BigInt = n match {
          case n if (n == 0) => a
          case _             => tail(n - 1, a + b, b)
        }
        tail(b,1,0)
      }
    }
    new wrapper(i)
  }

  implicit def wrapBigInt(b:BigInt) = {
    class wrapper(b:BigInt) {
      def isPalindrome = b.toString == b.toString.reverse
      def factorial    = (BigInt(1) to b).product
      def getDigits    = b.toString.toCharArray.map(BigInt(_) - 48)
      def toBinary     = Integer.toBinaryString(b.toInt)

      def isPandigit(l:Int) = {
        val isLength = b.toString.length == l
        val isDistinct = b.toString.distinct.length == l
        val isInRange = b.toString.sortWith(_<_).toList == ('1' to (l+48).toChar).toList
        isLength && isDistinct && isInRange
      }

      def isPandigit = {
        val isDistinct = b.toString.distinct.length == b.toString.length
        val isInRange = b.toString.sortWith(_<_).toList == ('1' to (b.toString.length+48).toChar).toList
        isDistinct && isInRange
      }

      def isPrime:Boolean = {
        if (b == 1)
          return false
        if (b == 2)
          return true
        if (b%2==0)
          return false
        for (i <- 3 to (Math.sqrt(b.toDouble).toInt) by 2)
          if(b%i==0)
            return false
        true
      }

      def fib:BigInt = {
        def tail(n:BigInt, b:BigInt, a:BigInt):BigInt = n match {
          case n if (n == 0) => a
          case _             => tail(n - 1, a + b, b)
        }
        tail(b,1,0)
      }
    }
    new wrapper(b)
  }
}
