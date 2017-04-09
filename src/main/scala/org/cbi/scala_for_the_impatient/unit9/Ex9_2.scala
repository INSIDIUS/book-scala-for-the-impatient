package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}

import scala.io.Source

object Ex9_2 extends App {
  val source = Source.fromFile("/tmp/1.txt")
  try source.getLines().mkString(" ").split(" ").filter(_.length >= 10).foreach(println) finally source.close()
}
