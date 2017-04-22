package org.cbi.scala_for_the_impatient.unit8.ex3

import org.specs2.mutable.Specification

object SquareTest extends Specification {

  val shape = Square(3)

  "U8 Ex3 SquareTest" should {
    "square is equals" in { shape.square mustEqual 9 }
    "toString is equals" in {
      shape.toString mustEqual "I'm " + shape.getClass.getSimpleName + " and my square is: " + shape.square
    }
  }
}