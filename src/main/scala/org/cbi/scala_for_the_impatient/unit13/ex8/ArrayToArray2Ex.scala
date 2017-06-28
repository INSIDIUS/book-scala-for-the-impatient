package org.cbi.scala_for_the_impatient.unit13.ex8

object ArrayToArray2Ex {
  def fun(arr: Array[Double], n: Int): Array[Array[Double]] = arr.grouped(n).toArray
}
