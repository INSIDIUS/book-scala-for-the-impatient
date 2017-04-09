package org.cbi.scala_for_the_impatient.Unit9

import scala.io.Source

object Ex0_1 extends App {
  val tokens = "12.5 13.544 324.6".split("\\s+")
  val numbers = for (w <- tokens) yield w.toDouble
  val numbers2 = tokens.map(_.toDouble)

  println(numbers.mkString(" "))
  println(numbers2.mkString(" "))

  val source1 = Source.fromURL("http://hostmann.com", "UTF-8")

  println(source1.getLines().mkString(" "))

  source1.close()
}
