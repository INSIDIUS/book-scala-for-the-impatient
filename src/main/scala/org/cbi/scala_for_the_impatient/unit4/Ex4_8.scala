package org.cbi.scala_for_the_impatient.unit4

object Ex4_8 extends App {

  def ex_4_8_minmax(values: Array[Int]) = (values.min, values.max)

  val arr = Array(-3, 4, 5, -6, -2, 6)
  println(ex_4_8_minmax(arr))
}