package euler

import org.junit.{Rule, Test}
import org.junit.rules.Timeout
import com.twitter.util.Stopwatch
import java.io.ByteArrayOutputStream

class TimeTest {

  def time(testNumber: Int)(app: App)(answer: Long) = {
    println(s"Test $testNumber start")
    val elapsed = Stopwatch.start()
    test(app)(answer)
    val duration = elapsed().inSeconds
    println(s"Test $testNumber took $duration seconds.\n")
  }

  def test(app: App)(answer: Long) = {
    val out = new ByteArrayOutputStream()
    Console.withOut(out)(app.main(Array()))
    assert(out.toString == answer + "\r\n")
    out.close()
  }

  @Rule def timeout = new Timeout(60000)

  @Test def euler001() = time (1)(Euler001)(233168)
  @Test def euler002() = time (2)(Euler002)(4613732)
  @Test def euler003() = time (3)(Euler003)(6857)
  @Test def euler004() = time (4)(Euler004)(906609)
  @Test def euler005() = time (5)(Euler005)(232792560)
  @Test def euler006() = time (6)(Euler006)(25164150)
  @Test def euler007() = time (7)(Euler007)(104743)
  @Test def euler008() = time (8)(Euler008)(40824)
  @Test def euler009() = time (9)(Euler009)(31875000)
  @Test def euler010() = time(10)(Euler010)(142913828922L)
  @Test def euler011() = time(11)(Euler011)(70600674)
  @Test def euler012() = time(12)(Euler012)(76576500)
  @Test def euler013() = time(13)(Euler013)(5537376230L)
  @Test def euler014() = time(14)(Euler014)(837799)
  @Test def euler015() = time(15)(Euler015)(137846528820L)
  @Test def euler016() = time(16)(Euler016)(1366)
  @Test def euler017() = time(17)(Euler017)(21124)
  @Test def euler018() = time(18)(Euler018)(1074)
  @Test def euler019() = time(19)(Euler019)(171)
  @Test def euler020() = time(20)(Euler020)(648)
  @Test def euler021() = time(21)(Euler021)(31626)
  @Test def euler022() = time(22)(Euler022)(871198282)
  @Test def euler023() = time(23)(Euler023)(4179871)
  @Test def euler024() = time(24)(Euler024)(2783915460L)
  @Test def euler025() = time(25)(Euler025)(4782)
  @Test def euler026() = time(26)(Euler026)(983)
  @Test def euler027() = time(27)(Euler027)(-59231)
  @Test def euler028() = time(28)(Euler028)(669171001)
  @Test def euler029() = time(29)(Euler029)(9183)
  @Test def euler030() = time(30)(Euler030)(443839)
  @Test def euler031() = time(31)(Euler031)(73682)
  @Test def euler032() = time(32)(Euler032)(45228)
  @Test def euler034() = time(34)(Euler034)(40730)
  @Test def euler035() = time(35)(Euler035)(55)
  @Test def euler036() = time(36)(Euler036)(872187)
  @Test def euler037() = time(37)(Euler037)(748317)
  @Test def euler040() = time(40)(Euler040)(210)
  @Test def euler041() = time(41)(Euler041)(7652413)
  @Test def euler042() = time(42)(Euler042)(162)
  @Test def euler043() = time(43)(Euler043)(16695334890L)
  @Test def euler045() = time(45)(Euler045)(1533776805)
  @Test def euler048() = time(48)(Euler048)(9110846700L)
  @Test def euler050() = time(50)(Euler050)(997651)
  @Test def euler067() = time(67)(Euler067)(7273)
}
