package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

class Ex7Test extends Specification {
  "U2 Ex7Test" should {
    "fun() return value equal" in { Ex7.fun() mustEqual 54656 }
  }
}