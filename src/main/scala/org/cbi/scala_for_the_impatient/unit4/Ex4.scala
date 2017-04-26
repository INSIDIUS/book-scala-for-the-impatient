package org.cbi.scala_for_the_impatient.unit4

import scala.collection.SortedMap
import scala.io.Source

object Ex4 {

  def entries(source: Source) = {
    val words = source.getLines().mkString(" ").split(" ")
    var entries = SortedMap[String, Int]()
    for (word <- words) entries += (word -> (entries.getOrElse(word, 0) + 1))

    entries
  }
}