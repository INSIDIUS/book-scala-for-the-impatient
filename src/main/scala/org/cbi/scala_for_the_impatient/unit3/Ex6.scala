package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Ex6 {

  val arrSortedDesc = {
    val arr = Array(3, 3, -4, -3, 8)
    Sorting.quickSort(arr)

    arr.reverse
  }

  val arrbuffSortedDesc = ArrayBuffer(3, 3, -4, -3, 8).sorted(Ordering[Int].reverse)
}