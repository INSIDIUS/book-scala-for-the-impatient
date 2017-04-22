package org.cbi.scala_for_the_impatient.unit8.ex5

import org.specs2.mutable.Specification

class LabeledPointTest extends Specification {

  val point = LabeledPoint("label", 2, 3)

  "LabeledPointTest" should {
    "labeledPoint is equals " in { point.x mustEqual 2 and(point.y mustEqual 3) and(point.label mustEqual "label") }
  }
}