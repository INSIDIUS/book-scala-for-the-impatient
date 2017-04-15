package org.cbi.scala_for_the_impatient.unit4

import scala.collection.immutable.HashMap
import scala.io.Source

object Ex3 {

  val entries = {

    val source = Source.fromResource("unit4/words.txt")
    val words = source.getLines().mkString(" ").split(" ")
    source.close()

    var entries = HashMap[String, Int]()
    for (word <- words) entries += (word -> (entries.getOrElse(word, 0) + 1))

    entries
  }
}