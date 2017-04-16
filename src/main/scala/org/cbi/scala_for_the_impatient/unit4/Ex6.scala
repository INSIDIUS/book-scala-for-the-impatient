package org.cbi.scala_for_the_impatient.unit4

import java.util.Calendar

import scala.collection.mutable

object Ex6 {

  val daysOfWeek = {
    val daysOfWeek = mutable.LinkedHashMap[String, Int]()

    daysOfWeek("Sunday") = Calendar.SUNDAY
    daysOfWeek("Tuesday") = Calendar.TUESDAY
    daysOfWeek("Monday") = Calendar.MONDAY
    daysOfWeek("Wednesday") = Calendar.WEDNESDAY
    daysOfWeek("Thursday") = Calendar.THURSDAY
    daysOfWeek("Friday") = Calendar.FRIDAY
    daysOfWeek("Saturday") = Calendar.SATURDAY

    daysOfWeek
  }
}