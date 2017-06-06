package org.cbi.scala_for_the_impatient.unit12.ex8

case class CorrespondsEx(seq: Seq[String]) {
  def corresponds(that: Seq[Int])(p: (String, Int) => Boolean) = seq.zip(that).forall(pair => p(pair._1, pair._2))
}