package org.cbi.scala_for_the_impatient.unit12.ex5

object LargestEx {
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = inputs map fun max
}