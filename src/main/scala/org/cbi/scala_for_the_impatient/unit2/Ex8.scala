package org.cbi.scala_for_the_impatient.unit2

object Ex8 {
  def product(s: String): Int = { var res = 1; for (ch <- s) res *= ch.toInt; res }
}