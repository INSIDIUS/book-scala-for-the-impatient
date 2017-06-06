package org.cbi.scala_for_the_impatient.unit12.ex9

case class CorrespondsEx[A](seq: Seq[A]) {
  def corresponds(that: Seq[Int], p: (A, Int) => Boolean) = seq.zip(that).forall(pair => p(pair._1, pair._2))
}