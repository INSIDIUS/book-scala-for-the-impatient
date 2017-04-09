package org.cbi.scala_for_the_impatient.unit4

import java.util

import scala.io.Source

object Ex4_5 extends App {

  def ex_4_5() {
    val source = Source.fromFile("/home/insidius/test.txt", "UTF-8")
    val tree = new util.TreeMap[String, Int]()

    for (word <- source.getLines().mkString(" ").split(" ")) {
      tree.put(word, tree.getOrDefault(word, 0) + 1)
    }

    println(tree.toString)
  }

  ex_4_5()
}