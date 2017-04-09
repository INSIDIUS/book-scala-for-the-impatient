package org.cbi.scala_for_the_impatient.unit5

object Ex5_3 extends App {

  class Time(val hours: Int, val minutes: Int) {
    def before(other: Time) = hours < other.hours && minutes < other.minutes
  }

  def ex_5_3() {
    val time1 = new Time(22, 57)
    val time2 = new Time(23, 59)
    println(time1.before(time2))
  }
  ex_5_3()
}

