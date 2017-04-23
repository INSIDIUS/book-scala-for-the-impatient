package org.cbi.scala_for_the_impatient.unit8.ex3

import org.specs2.mutable.Specification

object RectangleTest extends Specification {

  val shape = Rectangle(3, 4)

  "U8 Ex3 RectangleTest" should {
    "square is equals" in { shape.square mustEqual 12 }
    "toString is equals" in {
      shape.toString mustEqual f"I'm ${shape.getClass.getSimpleName} and my square is ${shape.square}"
    }
  }
}