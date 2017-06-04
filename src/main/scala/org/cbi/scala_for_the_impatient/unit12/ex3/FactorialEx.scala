package org.cbi.scala_for_the_impatient.unit12.ex3

object FactorialEx {
  def fact(n: Byte) = if(n < 1) 1 else 1 to n reduceLeft(_ * _)
}