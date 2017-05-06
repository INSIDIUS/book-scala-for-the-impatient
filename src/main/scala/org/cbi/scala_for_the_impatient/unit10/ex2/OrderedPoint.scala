package org.cbi.scala_for_the_impatient.unit10.ex2

import java.awt.Point

class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
  override def compare(that: Point) = { val diffX = x - that.x; if (diffX != 0) diffX else y - that.y }
}

object OrderedPoint {
  def apply(): OrderedPoint = new OrderedPoint(0, 0)
  def apply(x: Int, y: Int): OrderedPoint = new OrderedPoint(x, y)
}