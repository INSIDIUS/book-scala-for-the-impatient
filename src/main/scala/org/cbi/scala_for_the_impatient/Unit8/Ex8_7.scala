package org.cbi.scala_for_the_impatient.Unit8

import java.awt.Rectangle

object Ex8_7 extends App {

  class Square(x: Int, y: Int, width: Int) extends Rectangle(x, y, width, width) {
    def this(width: Int) { this(0, 0, width) }
    def this() { this(0) }
  }

  println(new Square())
}