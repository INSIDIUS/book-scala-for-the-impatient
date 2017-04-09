package org.cbi.scala_for_the_impatient.unit2

object Ex2_8 {
  def ex_2_8_product(s: String): Int = { var res = 1; for (ch <- s) res *= ch.toInt; res }
}