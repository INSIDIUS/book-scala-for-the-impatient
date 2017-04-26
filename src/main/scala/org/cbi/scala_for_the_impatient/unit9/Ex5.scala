package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}
import java.lang.Math._

object Ex5 {

  def powersOf(num: Int) = 0 to 20 map (i => (pow(2, i), pow(2, -i)))

  def calculateAndPersistToFile(num: Int, file: File) {
    val destination = new PrintWriter(file)
    val result = powersOf(num).map(t => t._1 + "\t\t" + t._2 + System.lineSeparator()).mkString
    destination.write(result)
  }
}