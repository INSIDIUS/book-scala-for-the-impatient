package org.cbi.scala_for_the_impatient.unit3

import scala.util.Sorting

object Ex3_6 extends App {

  def ex_3_6_arr() {
    val arr = Array(3, 3, -4, -3, 8)
    Sorting.quickSort(arr)

    println(arr.reverse.deep)
  }

  ex_3_6_arr()
}
