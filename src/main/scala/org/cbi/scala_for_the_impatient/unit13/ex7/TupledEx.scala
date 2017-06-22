package org.cbi.scala_for_the_impatient.unit13.ex7

object TupledEx {

  val mul: (Double, Int) => Double = _ * _

  def fun(prices: List[Double], quantities: List[Int]) = (prices zip quantities) map mul.tupled
}