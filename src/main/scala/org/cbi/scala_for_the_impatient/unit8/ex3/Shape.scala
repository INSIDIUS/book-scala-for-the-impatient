package org.cbi.scala_for_the_impatient.unit8.ex3

abstract class Shape {
  val square: Double
  override def toString = "I'm " + getClass.getSimpleName + " and my square is: " + square
}

case class RightTriangle(a: Int, b: Int) extends Shape { override val square = (a * b) / 2 }

case class Rectangle(a: Int, b: Int) extends Shape { override val square = a * b }

class Square(override val a: Int) extends Rectangle(a, a)
object Square { def apply(a: Int) = new Square(a) }