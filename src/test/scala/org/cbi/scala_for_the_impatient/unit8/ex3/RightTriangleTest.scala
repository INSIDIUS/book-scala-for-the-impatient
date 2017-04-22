package org.cbi.scala_for_the_impatient.unit8.ex3

import org.specs2.mutable.Specification

object RightTriangleTest extends Specification {

  val shape = RightTriangle(3, 4)

  "U8 Ex3 RightTriangleTest" should {
    "square is equals" in { shape.square mustEqual 6 }
    "toString is equals" in {
      shape.toString mustEqual "I'm " + shape.getClass.getSimpleName + " and my square is: " + shape.square }
  }
}