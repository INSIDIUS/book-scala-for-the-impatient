package org.cbi.scala_for_the_impatient.Unit9

import scala.io.Source

object Ex9_4 extends App {
  val source = Source.fromFile("/tmp/1.txt")
  try {
    val numbers = source.getLines().mkString(" ").split(" ").map(_.toDouble)

    println(numbers.sum)
    println(numbers.sum / numbers.length)
    println(numbers.max)
    println(numbers.min)
  } finally source.close()
}
