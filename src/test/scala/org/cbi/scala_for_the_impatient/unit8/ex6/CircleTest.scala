package org.cbi.scala_for_the_impatient.unit8.ex6

import org.specs2.mutable.Specification

object CircleTest extends Specification {

  "U8 Ex6 CircleTest" should {
    "centerPoint" in { Circle(5, 10, 20).centerPoint mustEqual (5, 10) }
  }
}