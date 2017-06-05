package org.cbi.scala_for_the_impatient.unit12.ex6

object LargestAtEx {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]) = inputs.map(x => (x, fun(x))).maxBy(p => p._2)._1
}