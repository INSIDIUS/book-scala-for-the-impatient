package org.cbi.scala_for_the_impatient.unit13.ex10

import scala.collection.mutable

object HarryHacker {

  def frequency(string: String): mutable.Map[Char, Int] =
    string
      .aggregate(mutable.Map[Char, Int]())(
        { (map, ch) => map(ch) = map.getOrElse(ch, 0) + 1; map },
        { (p1, p2) => p1 ++ p2 }
      )
}