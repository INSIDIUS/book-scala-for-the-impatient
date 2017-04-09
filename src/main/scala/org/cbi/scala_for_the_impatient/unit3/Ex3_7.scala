package org.cbi.scala_for_the_impatient.unit3

import scala.util.Sorting

object Ex3_7 extends App {

  def ex_3_7_arr() {
    val arr = Array(3, 3, -4, -3, 8)
    Sorting.quickSort(arr)

    println(arr.distinct.deep)
  }

  ex_3_7_arr()
}
