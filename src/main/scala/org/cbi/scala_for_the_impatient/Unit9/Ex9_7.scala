package org.cbi.scala_for_the_impatient.Unit9

import scala.io.Source

object Ex9_7 extends App {
  val source = Source.fromFile("/tmp/1.txt")
  //val pattern = """\s+[0-9]+\s+""".r
  val pattern = """\s+(\d+\.\d+)?\s+""".r
  val tokens = try source.getLines().mkString(" ") finally source.close()

  for (t <- pattern.findAllMatchIn(tokens)) println(t)
}