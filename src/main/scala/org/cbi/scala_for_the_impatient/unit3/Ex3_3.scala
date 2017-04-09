package org.cbi.scala_for_the_impatient.unit3

object Ex3_3 extends App {

  def ex_3_3_arr() {
    val arr = Array(1 to 5 :_*)
    val arrResult = for (i <- arr.indices if i < arr.length) yield {
      if (i % 2 == 0 && i == arr.length - 1) arr(i)
      else if (i == 0 || i % 2 == 0) arr(i + 1)
      else arr(i - 1)
    }
    println(arrResult)
  }

  ex_3_3_arr()
}
