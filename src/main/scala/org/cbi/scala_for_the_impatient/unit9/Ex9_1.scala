package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}

import scala.io.Source

object Ex9_1 extends App {
  val source = Source.fromFile("/tmp/1.txt")
  val revLines = try source.getLines().toList.reverseIterator finally source.close()

  val destination = new PrintWriter(new File("/tmp/1.txt"))
  try for (line <- revLines) destination.write(line + System.lineSeparator()) finally destination.close()
}
