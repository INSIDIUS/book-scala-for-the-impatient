package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Ex6 {

  def sorted_desc_arr() = {
    val arr = Array(3, 3, -4, -3, 8)
    Sorting.quickSort(arr)

    arr.reverse
  }

  def sorted_desc_arrbuff() = {
    ArrayBuffer(3, 3, -4, -3, 8).sorted(Ordering[Int].reverse)
  }
}