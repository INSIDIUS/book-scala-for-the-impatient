package org.cbi.scala_for_the_impatient.unit13.ex10

object HarryHacker {

  def frequency(string: String) =
    string
      .par
      .aggregate(Map[Char, Int]())(

        { (map, ch) => map + (ch -> (map.getOrElse(ch, 0) + 1)) },

        { (map1, map2) =>

          (map1.keySet ++ map2.keySet)
            .map(ch => (ch, map1.getOrElse(ch, 0) + map2.getOrElse(ch, 0)))
            .toMap
        }
      )
}