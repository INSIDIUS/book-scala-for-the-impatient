package org.cbi.scala_for_the_impatient.unit4

import java.util
import java.util.Calendar

import scala.collection.immutable.HashMap
import scala.collection.mutable
import scala.io.Source

object Ex4_6 extends App {

  def ex_4_6() {
    val table = mutable.LinkedHashMap[String, Int]()

    table("Monday") = Calendar.MONDAY
    table("Tuesday") = Calendar.TUESDAY
    table("Wednesday") = Calendar.WEDNESDAY
    table("Thursday") = Calendar.THURSDAY
    table("Friday") = Calendar.FRIDAY
    table("Saturday") = Calendar.SATURDAY
    table("Sunday") = Calendar.SUNDAY

    println(table)
  }

  ex_4_6()
}