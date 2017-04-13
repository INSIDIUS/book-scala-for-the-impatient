package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

object Ex1Test extends Specification {
  "U2 Ex1Test" should {
    "sign(x) = -1 when x is negative" in { Ex1.sign(-3) mustEqual -1 }
    "sign(x) = 0 when x is 0" in { Ex1.sign(0) mustEqual 0 }
    "sign(x) = 1 when x is positive" in { Ex1.sign(3) mustEqual 1 }
  }
}