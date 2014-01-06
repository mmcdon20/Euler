package euler

import java.util.Calendar
import java.util.GregorianCalendar

object Euler019 extends App {
  val dates = for (y <- 1901 to 2000; m <- 0 to 11) yield new GregorianCalendar(y,m,1)
  val result = dates.count(_.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
  println(result)
}
