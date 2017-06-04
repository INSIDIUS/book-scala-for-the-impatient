package org.cbi.scala_for_the_impatient.unit12.ex1

object Collections {
  def values(fun: (Int) => Int, low: Int, high: Int) = low to high map(i => (i, fun(i)))
}