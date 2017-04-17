package org.cbi.scala_for_the_impatient.unit6.ex4

import org.specs2.mutable.Specification

object PointTest extends Specification {

  "U6 Ex4 PointTest" should {
    "apply is work" in { Point(3, 4) mustEqual new java.awt.Point(3, 4) }
  }
}