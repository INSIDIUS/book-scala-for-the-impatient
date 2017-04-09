package org.cbi.scala_for_the_impatient.unit3

object Ex3_2 extends App {

  def ex_3_2_arr() {
    val arr = Array(1 to 5 :_*)
    for (i <- arr.indices by 2 if i < arr.length - 1) {
      val tmp = arr(i)
      arr(i) = arr(i + 1)
      arr(i + 1) = tmp
    }
    println(arr.deep)
  }

  ex_3_2_arr()
}
