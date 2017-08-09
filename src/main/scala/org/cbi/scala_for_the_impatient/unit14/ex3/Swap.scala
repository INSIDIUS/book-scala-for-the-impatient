package org.cbi.scala_for_the_impatient.unit14.ex3

object Swap {
  def swap(arr: Array[Any]) = arr match {
    case Array(a, b, tail @ _*) if arr.length >= 2 => Array(b, a) ++ tail
    case _ => arr
  }
}