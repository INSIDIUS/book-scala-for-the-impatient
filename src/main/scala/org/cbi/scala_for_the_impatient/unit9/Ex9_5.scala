package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}

object Ex9_5 extends App {
  val destination = new PrintWriter(new File("/tmp/2.txt"))
  try for (i <- 0 to 20) destination.write(Math.pow(2, i).toInt + "\t\t" + Math.pow(2, -i) + System.lineSeparator()) finally destination.close()
}