import euler._
import org.junit.Test

class TimeTest {

  def time(testNumber:Int)(app:App) = {
    println(s"Test $testNumber start")
    val start = System.currentTimeMillis()
    app.main(Array())
    val stop = System.currentTimeMillis()
    println(s"Test $testNumber took ${stop - start} milliseconds.\n")
  }

  @Test(timeout=60000) def euler001 = time(1)(Euler001)
  @Test(timeout=60000) def euler002 = time(2)(Euler002)
  @Test(timeout=60000) def euler003 = time(3)(Euler003)
  @Test(timeout=60000) def euler004 = time(4)(Euler004)
  @Test(timeout=60000) def euler005 = time(5)(Euler005)
  @Test(timeout=60000) def euler006 = time(6)(Euler006)
  @Test(timeout=60000) def euler007 = time(7)(Euler007)
  @Test(timeout=60000) def euler008 = time(8)(Euler008)
  @Test(timeout=60000) def euler009 = time(9)(Euler009)
  @Test(timeout=60000) def euler010 = time(10)(Euler010)
  @Test(timeout=60000) def euler011 = time(11)(Euler011)
  @Test(timeout=60000) def euler012 = time(12)(Euler012)
  @Test(timeout=60000) def euler013 = time(13)(Euler013)
  @Test(timeout=60000) def euler014 = time(14)(Euler014)
  @Test(timeout=60000) def euler015 = time(15)(Euler015)
  @Test(timeout=60000) def euler016 = time(16)(Euler016)
  @Test(timeout=60000) def euler017 = time(17)(Euler017)
  @Test(timeout=60000) def euler018 = time(18)(Euler018)
  @Test(timeout=60000) def euler019 = time(19)(Euler019)
  @Test(timeout=60000) def euler020 = time(20)(Euler020)
  @Test(timeout=60000) def euler021 = time(21)(Euler021)
  @Test(timeout=60000) def euler022 = time(22)(Euler022)
  @Test(timeout=60000) def euler024 = time(24)(Euler024)
  @Test(timeout=60000) def euler025 = time(25)(Euler025)
  @Test(timeout=60000) def euler030 = time(30)(Euler030)
  @Test(timeout=60000) def euler031 = time(31)(Euler031)
  @Test(timeout=60000) def euler032 = time(32)(Euler032)
  @Test(timeout=60000) def euler034 = time(34)(Euler034)
  @Test(timeout=60000) def euler036 = time(36)(Euler036)
  @Test(timeout=60000) def euler037 = time(37)(Euler037)
  @Test(timeout=60000) def euler041 = time(41)(Euler041)
  @Test(timeout=60000) def euler043 = time(43)(Euler043)
  @Test(timeout=60000) def euler048 = time(48)(Euler048)
  @Test(timeout=60000) def euler050 = time(50)(Euler050)
  @Test(timeout=60000) def euler067 = time(67)(Euler067)
}
