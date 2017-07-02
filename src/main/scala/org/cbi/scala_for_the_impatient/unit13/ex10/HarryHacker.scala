package org.cbi.scala_for_the_impatient.unit13.ex10

import scala.collection.mutable

object HarryHacker {

  def frequency(string: String): mutable.Map[Char, Int] =
    string
      .par
      .aggregate(mutable.Map[Char, Int]())(

        { (map, ch) => map(ch) = map.getOrElse(ch, 0) + 1; map },
        { (p1, p2) => {

            val result = (p1.keySet ++ p2.keySet)
              .map(ch => (ch, p1.getOrElse(ch, 0) + p2.getOrElse(ch, 0)))
              .toMap[Char, Int]

            mutable.Map(result.toSeq: _*)
          }
        }
      )
}