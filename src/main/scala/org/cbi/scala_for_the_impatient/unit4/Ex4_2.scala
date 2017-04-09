package org.cbi.scala_for_the_impatient.unit4

import scala.collection.mutable
import scala.io.Source

object Ex4_2 extends App {

  def ex_4_2() {
    val source = Source.fromFile("/home/insidius/test.txt", "UTF-8")

    val map = mutable.HashMap[String, Int]()
    for (word <- source.getLines().mkString(" ").split(" ")) {
      map(word) = map.getOrElse(word, 0) + 1
    }

    println(map.toList.sortBy(_._2).mkString("\n"))
    source.close()
  }

  ex_4_2()
}