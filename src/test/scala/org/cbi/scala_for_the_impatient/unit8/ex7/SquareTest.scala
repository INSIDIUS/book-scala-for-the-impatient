package org.cbi.scala_for_the_impatient.unit8.ex7

import org.specs2.mutable.Specification

object SquareTest extends Specification {

  "U8 Ex7 SquareTest" should {
    "square (primary constructor) is equals" in {
      val square = Square(4, 5, 6)
      square.x mustEqual 4 and(square.y mustEqual 5) and(square.width mustEqual 6)
    }

    "square (secondary constructor) is equals" in {
      Square(7) mustEqual Square(0, 0, 7)
    }

    "square (third constructor) is equals" in {
      Square() mustEqual Square(0)
    }
  }
}