package org.cbi.scala_for_the_impatient.unit4

import scala.io.Source

object Ex4_2_1 extends App {

  def ex_4_2_1() {
    val source = Source.fromFile("/home/insidius/test.txt", "UTF-8")

    println(source.getLines()
      .flatMap(_.split("[^a-zA-Zа-яА-Я]+"))
      .toList
      .groupBy(word => word)
      .mapValues(_.size)
      .toList
      .sortBy(_._2)
      .mkString("\n"))
    source.close()
  }

    ex_4_2_1()
}