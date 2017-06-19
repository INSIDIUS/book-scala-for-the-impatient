package org.cbi.scala_for_the_impatient.unit13.ex2

object IndexesEx {
  def indexes(string: String) =
    string
      .zipWithIndex
      .foldLeft(Map[Char, Seq[Int]]())(
        (m, p) => m + (p._1 -> (m.getOrElse(p._1, Seq.empty) :+ p._2 ))
      )
}