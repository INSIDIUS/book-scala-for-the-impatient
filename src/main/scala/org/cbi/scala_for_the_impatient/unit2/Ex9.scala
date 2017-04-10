package org.cbi.scala_for_the_impatient.unit2

object Ex9 {
  def product(s: String): Long = if (s.length == 0) 1 else s.head.toInt * product(s.tail)
}