package org.cbi.scala_for_the_impatient.unit8.ex3

abstract class Shape {
  val square: Double
  override def toString = f"I'm ${getClass.getSimpleName} and my square is $square"
}