package euler

import org.junit.{Rule, Test}
import org.junit.rules.Timeout
import com.twitter.util.Stopwatch
import java.io.ByteArrayOutputStream

class TimeTest {

  def time(app: App, answer: Long) = {
    val elapsed = Stopwatch.start()
    test(app, answer)
    val duration = elapsed().inSeconds
    val name = app.getClass.getSimpleName
    println(s"Test $name took $duration seconds.")
  }

  def test(app: App, answer: Long) = {
    val out = new ByteArrayOutputStream()
    Console.withOut(out)(app.main(Array()))
    assert(out.toString == answer + "\r\n")
    out.close()
  }

  @Rule def timeout = new Timeout(60000)

  @Test def euler001() = time(Euler001, 233168)
  @Test def euler002() = time(Euler002, 4613732)
  @Test def euler003() = time(Euler003, 6857)
  @Test def euler004() = time(Euler004, 906609)
  @Test def euler005() = time(Euler005, 232792560)
  @Test def euler006() = time(Euler006, 25164150)
  @Test def euler007() = time(Euler007, 104743)
  @Test def euler008() = time(Euler008, 40824)
  @Test def euler009() = time(Euler009, 31875000)
  @Test def euler010() = time(Euler010, 142913828922L)
  @Test def euler011() = time(Euler011, 70600674)
  @Test def euler012() = time(Euler012, 76576500)
  @Test def euler013() = time(Euler013, 5537376230L)
  @Test def euler014() = time(Euler014, 837799)
  @Test def euler015() = time(Euler015, 137846528820L)
  @Test def euler016() = time(Euler016, 1366)
  @Test def euler017() = time(Euler017, 21124)
  @Test def euler018() = time(Euler018, 1074)
  @Test def euler019() = time(Euler019, 171)
  @Test def euler020() = time(Euler020, 648)
  @Test def euler021() = time(Euler021, 31626)
  @Test def euler022() = time(Euler022, 871198282)
  @Test def euler023() = time(Euler023, 4179871)
  @Test def euler024() = time(Euler024, 2783915460L)
  @Test def euler025() = time(Euler025, 4782)
  @Test def euler026() = time(Euler026, 983)
  @Test def euler027() = time(Euler027, -59231)
  @Test def euler028() = time(Euler028, 669171001)
  @Test def euler029() = time(Euler029, 9183)
  @Test def euler030() = time(Euler030, 443839)
  @Test def euler031() = time(Euler031, 73682)
  @Test def euler032() = time(Euler032, 45228)
  @Test def euler033() = time(Euler033, 100)
  @Test def euler034() = time(Euler034, 40730)
  @Test def euler035() = time(Euler035, 55)
  @Test def euler036() = time(Euler036, 872187)
  @Test def euler037() = time(Euler037, 748317)
  @Test def euler038() = time(Euler038, 932718654)
  @Test def euler039() = time(Euler039, 840)
  @Test def euler040() = time(Euler040, 210)
  @Test def euler041() = time(Euler041, 7652413)
  @Test def euler042() = time(Euler042, 162)
  @Test def euler043() = time(Euler043, 16695334890L)
  @Test def euler045() = time(Euler045, 1533776805)
  @Test def euler046() = time(Euler046, 5777)
  @Test def euler048() = time(Euler048, 9110846700L)
  @Test def euler050() = time(Euler050, 997651)
  @Test def euler052() = time(Euler052, 142857)
  @Test def euler053() = time(Euler053, 4075)
  @Test def euler054() = time(Euler054, 376)
  @Test def euler055() = time(Euler055, 249)
  @Test def euler056() = time(Euler056, 972)
  @Test def euler067() = time(Euler067, 7273)
}
