package org.cbi.scala_for_the_impatient.unit9

import java.io.File

import scala.io.Source

object Ex3 {
  def bigWords(source: Source) = source.getLines().mkString(" ").split(" ").filter(_.length >= 12)
}