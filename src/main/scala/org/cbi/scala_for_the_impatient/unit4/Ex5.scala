package org.cbi.scala_for_the_impatient.unit4

import scala.collection.mutable
import scala.io.Source

object Ex5 {

  val entries = {
    val source = Source.fromResource("unit4/ex4words.txt")
    val words = source.getLines().mkString(" ").split(" ")
    source.close()

    val entries = mutable.TreeMap[String, Int]()

    for (word <- words) entries.put(word, entries.getOrElse(word, 0) + 1)

    entries.toMap
  }
}