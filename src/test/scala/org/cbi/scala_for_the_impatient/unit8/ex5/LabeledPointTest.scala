package org.cbi.scala_for_the_impatient.unit8.ex5

import org.specs2.mutable.Specification

object LabeledPointTest extends Specification {

  val point = LabeledPoint("label", 2, 3)

  "U8 Ex5 LabeledPointTest" should {
    "labeledPoint is equals " in { point.x mustEqual 2 and(point.y mustEqual 3) and(point.label mustEqual "label") }
  }
}