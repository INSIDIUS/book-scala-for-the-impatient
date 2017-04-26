package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}

import scala.io.Source

object Ex1 {

  def reverseFile(file: File) {

    val source = Source.fromFile(file)
    val revLines = try source.getLines().toList.reverseIterator finally source.close()

    val destination = new PrintWriter(file)
    try revLines foreach (line => destination write(line + System.lineSeparator)) finally destination close()
  }
}