package org.cbi.scala_for_the_impatient.unit8.ex3

case class RightTriangle(a: Int, b: Int) extends Shape {
  override val square = (a * b) / 2
}