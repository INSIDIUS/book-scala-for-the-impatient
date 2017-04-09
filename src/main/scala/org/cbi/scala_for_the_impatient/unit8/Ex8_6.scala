package org.cbi.scala_for_the_impatient.unit8

object Ex8_6 extends App {

  abstract class Shape { def centerPoint(): (Double, Double) }

  class Rectangle(val x: Double, val y: Double, val height: Double, val width: Double) extends Shape {
    override def centerPoint() = ((x + width) / 2, (y + height) / 2)
  }

  class Circle(val x: Double, val y: Double, val r: Double) extends Shape {
    override def centerPoint(): (Double, Double) = (x, y)
  }
}