package org.cbi.scala_for_the_impatient.unit8.ex6

case class Circle(x: Double, y: Double, r: Double) extends Shape {
  override def centerPoint = (x, y)
}