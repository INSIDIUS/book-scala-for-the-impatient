package org.cbi.scala_for_the_impatient.unit8.ex6

import org.specs2.mutable.Specification

object RectangleTest extends Specification {

  "U8 Ex6 RectangleTest" should {
    "centerPoint is equals" in { Rectangle(5, 5, 10, 15).centerPoint mustEqual (7.5, 10) }
  }
}