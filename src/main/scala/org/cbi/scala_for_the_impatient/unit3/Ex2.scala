package org.cbi.scala_for_the_impatient.unit3

object Ex2 {

  val arr = {
    val arr = Array(1 to 5: _*)
    for (i <- arr.indices by 2 if i < arr.length - 1) swap(arr, i, i + 1)
    arr
  }

  private def swap(arr: Array[Int], first: Int, second: Int) {
    val tmp = arr(first)
    arr(first) = arr(second)
    arr(second) = tmp
  }
}