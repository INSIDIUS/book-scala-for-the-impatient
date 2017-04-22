package org.cbi.scala_for_the_impatient.unit8.ex7

import java.awt.Rectangle

case class Square(_x: Int, _y: Int, _width: Int) extends Rectangle(_x, _y, _width, _width) {
  def this(width: Int) { this(0, 0, width) }
  def this() { this(0) }
}

object Square {
  def apply(width: Int) = new Square(width)
  def apply() = new Square
}