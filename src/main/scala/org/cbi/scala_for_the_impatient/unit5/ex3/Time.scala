package org.cbi.scala_for_the_impatient.unit5.ex3

class Time(val hours: Int = 0, val minutes: Int = 0) {
  def before(other: Time) = hours < other.hours && minutes < other.minutes
}
