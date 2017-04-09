package org.cbi.scala_for_the_impatient.Unit8

import java.util

object Ex8_5 extends App {

  class Point(val x: Double, val y: Double) {}
  class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y) {}

  val p = new LabeledPoint("qerewr", 2, 3)
}