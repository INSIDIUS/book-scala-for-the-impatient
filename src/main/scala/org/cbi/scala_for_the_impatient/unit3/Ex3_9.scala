package org.cbi.scala_for_the_impatient.unit3

import java.util.TimeZone

import scala.util.Sorting

object Ex3_9 extends App {

  def ex_3_9_arr() {

    val result = TimeZone.getAvailableIDs.filter(!_.contains("America/"))
    Sorting.quickSort(result)

    println(result.deep)
  }

  ex_3_9_arr()
}
