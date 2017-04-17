package org.cbi.scala_for_the_impatient.unit5.ex4

class Time(val hours: Int, val minutes: Int) {
  val time = hours * 60 + minutes
  def before(other: Time) = time < other.time
  override def toString = hours + ":" + minutes
}