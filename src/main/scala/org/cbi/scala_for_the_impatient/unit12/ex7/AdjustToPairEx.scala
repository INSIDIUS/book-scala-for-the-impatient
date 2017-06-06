package org.cbi.scala_for_the_impatient.unit12.ex7

object AdjustToPairEx {
  def adjustToPair(fun: (Int, Int) => Int)(pair: (Int, Int)) = fun(pair._1, pair._2)
}