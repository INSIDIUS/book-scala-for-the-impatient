package org.cbi.scala_for_the_impatient.unit4

object Ex9 {
  def lteqgt(values: Array[Int], v: Int) = (values.count(_ < v), values.count(_ == v), values.count(_ > v))
}
