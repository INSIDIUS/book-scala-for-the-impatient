package org.cbi.scala_for_the_impatient.unit8.ex5

case class LabeledPoint(label: String, override val x: Double, override val y: Double) extends Point(x, y)