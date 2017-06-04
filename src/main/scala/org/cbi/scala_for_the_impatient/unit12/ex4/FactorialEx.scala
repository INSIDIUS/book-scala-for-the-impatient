package org.cbi.scala_for_the_impatient.unit12.ex4

object FactorialEx {
  def fact(n: Byte) = 1.to(n).foldLeft(1)(_ * _)
}