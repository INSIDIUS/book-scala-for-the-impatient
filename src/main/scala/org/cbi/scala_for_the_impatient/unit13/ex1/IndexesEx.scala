package org.cbi.scala_for_the_impatient.unit13.ex1

import scala.collection.mutable
import scala.collection.immutable

object IndexesEx {

  implicitly[Ordering[Int]]

  def indexes(string: String) =
    string
      .zipWithIndex
      .foldLeft(immutable.Map[Char, mutable.SortedSet[Int]]())(
        (m, p) => m + (p._1 -> (m.getOrElse(p._1, mutable.SortedSet.empty) + p._2))
      )
}