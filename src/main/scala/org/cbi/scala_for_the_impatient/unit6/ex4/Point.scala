package org.cbi.scala_for_the_impatient.unit6.ex4

class Point extends java.awt.Point {}

object Point {
  def apply(x: Int, y: Int) = new java.awt.Point(x, y)
}