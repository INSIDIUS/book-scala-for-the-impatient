package org.cbi.scala_for_the_impatient.unit5

object Ex5_4 extends App {

  class Time(val hrs: Int, val min: Int) {
    val time = hrs * 60 + min
    def hours = time / 60
    def minutes = time % 60
    def before(other: Time) = time < other.time
    override def toString = hours + ":" + minutes
  }

  def ex_5_4() {
    val time1 = new Time(22, 57)
    val time2 = new Time(23, 59)
    println(time1.toString)
    println(time2.toString)
    println("time1 before time2: " + time1.before(time2))
  }
  ex_5_4()
}

