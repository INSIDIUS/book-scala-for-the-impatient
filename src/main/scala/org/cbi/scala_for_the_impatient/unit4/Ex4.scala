package org.cbi.scala_for_the_impatient.unit4

import scala.collection.SortedMap
import scala.io.Source

object Ex4 {

  val entries = {

    val source = Source.fromResource("unit4/words.txt")
    val words = source.getLines().mkString(" ").split(" ")
    source.close()

    var entries = SortedMap[String, Int]()
    for (word <- words) entries += (word -> (entries.getOrElse(word, 0) + 1))

    entries
  }
}