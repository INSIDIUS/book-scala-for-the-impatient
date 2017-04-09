package org.cbi.scala_for_the_impatient.unit4

import scala.collection.immutable.HashMap
import scala.io.Source

object Ex4_3 extends App {

  def ex_4_3() {
    val source = Source.fromFile("/home/insidius/test.txt", "UTF-8")

    var map = HashMap[String, Int]()
    for (word <- source.getLines().mkString(" ").split(" ")) {
      map += (word -> (map.getOrElse(word, 0) + 1))
    }

    println(map.toList.sortBy(_._2).mkString("\n"))
    source.close()
  }

  ex_4_3()
}