package org.cbi.scala_for_the_impatient.unit8.ex6

case class Rectangle(x: Double, y: Double, width: Double, height: Double) extends Shape {
  override def centerPoint = ((x + width) / 2, (y + height) / 2)
}