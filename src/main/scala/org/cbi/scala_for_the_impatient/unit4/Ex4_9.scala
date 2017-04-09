package org.cbi.scala_for_the_impatient.unit4

object Ex4_9 extends App {

  def ex_4_9_lteqgt(values: Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))

  val arr = Array(-3, 4, 5, -6, -2, 6)
  println(ex_4_9_lteqgt(arr, 4))
}
