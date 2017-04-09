package org.cbi.scala_for_the_impatient.unit2

object Ex2_9 {
  def ex_2_9_product(s: String): Long = if (s.length == 0) 1 else s.head.toInt * ex_2_9_product(s.tail)
}