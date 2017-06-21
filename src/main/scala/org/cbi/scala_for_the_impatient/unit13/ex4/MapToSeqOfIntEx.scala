package org.cbi.scala_for_the_impatient.unit13.ex4

object MapToSeqOfIntEx {
  def fun(seq: Seq[String], map: Map[String, Int]) =
    map
      .filter(p => seq.contains(p._1))
      .values
      .toArray[Int]
}