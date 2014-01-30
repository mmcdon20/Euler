package euler

import org.junit.{Rule, Test}
import com.twitter.util.Stopwatch
import org.junit.rules.Timeout

class TimeTest {

  def time(testNumber:Int)(app:App) = {
    println(s"Test $testNumber start")
    val elapsed = Stopwatch.start()
    app.main(Array())
    val duration = elapsed().inSeconds
    println(s"Test $testNumber took $duration seconds.\n")
  }

  @Rule def timeout = new Timeout(60000)

  @Test def euler001 = time(1)(Euler001)
  @Test def euler002 = time(2)(Euler002)
  @Test def euler003 = time(3)(Euler003)
  @Test def euler004 = time(4)(Euler004)
  @Test def euler005 = time(5)(Euler005)
  @Test def euler006 = time(6)(Euler006)
  @Test def euler007 = time(7)(Euler007)
  @Test def euler008 = time(8)(Euler008)
  @Test def euler009 = time(9)(Euler009)
  @Test def euler010 = time(10)(Euler010)
  @Test def euler011 = time(11)(Euler011)
  @Test def euler012 = time(12)(Euler012)
  @Test def euler013 = time(13)(Euler013)
  @Test def euler014 = time(14)(Euler014)
  @Test def euler015 = time(15)(Euler015)
  @Test def euler016 = time(16)(Euler016)
  @Test def euler017 = time(17)(Euler017)
  @Test def euler018 = time(18)(Euler018)
  @Test def euler019 = time(19)(Euler019)
  @Test def euler020 = time(20)(Euler020)
  @Test def euler021 = time(21)(Euler021)
  @Test def euler022 = time(22)(Euler022)
  @Test def euler023 = time(23)(Euler023)
  @Test def euler024 = time(24)(Euler024)
  @Test def euler025 = time(25)(Euler025)
  @Test def euler026 = time(26)(Euler026)
  @Test def euler027 = time(27)(Euler027)
  @Test def euler028 = time(28)(Euler028)
  @Test def euler029 = time(29)(Euler029)
  @Test def euler030 = time(30)(Euler030)
  @Test def euler031 = time(31)(Euler031)
  @Test def euler032 = time(32)(Euler032)
  @Test def euler034 = time(34)(Euler034)
  @Test def euler035 = time(35)(Euler035)
  @Test def euler036 = time(36)(Euler036)
  @Test def euler037 = time(37)(Euler037)
  @Test def euler040 = time(40)(Euler040)
  @Test def euler041 = time(41)(Euler041)
  @Test def euler042 = time(42)(Euler042)
  @Test def euler043 = time(43)(Euler043)
  @Test def euler048 = time(48)(Euler048)
  @Test def euler050 = time(50)(Euler050)
  @Test def euler067 = time(67)(Euler067)
}
