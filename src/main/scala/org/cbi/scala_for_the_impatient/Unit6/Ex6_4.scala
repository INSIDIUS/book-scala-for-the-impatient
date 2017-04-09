package org.cbi.scala_for_the_impatient.Unit6

object Ex6_4 extends App {

  class Point {}
  object Point { def apply(x: Int, y: Int) = new java.awt.Point(x, y) }

  def ex_6_3() {
    val point = Point(3, 4)
    println(point.toString)
  }
  ex_6_3()
}