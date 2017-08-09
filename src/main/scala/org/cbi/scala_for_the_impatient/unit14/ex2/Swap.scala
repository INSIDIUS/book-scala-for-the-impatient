package org.cbi.scala_for_the_impatient.unit14.ex2

object Swap {
  def swap(pair: (Int, Int)) = pair match { case (a, b) => (b, a) }
}