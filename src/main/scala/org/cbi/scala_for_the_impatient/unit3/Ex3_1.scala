package org.cbi.scala_for_the_impatient.unit3

object Ex3_1 extends App {

  def ex_3_1_arr(n: Int) {
    val arr = Array(0 until n :_*)
    println(arr.deep)
  }

  ex_3_1_arr(10)
}
