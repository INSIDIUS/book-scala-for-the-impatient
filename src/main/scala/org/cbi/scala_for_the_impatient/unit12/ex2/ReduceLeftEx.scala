package org.cbi.scala_for_the_impatient.unit12.ex2

object ReduceLeftEx {
  def maxElement(arr: Seq[Int]) = arr reduceLeft(_ max _)
}