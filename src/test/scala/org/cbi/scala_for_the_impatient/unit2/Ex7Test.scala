package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

object Ex7Test extends Specification {
  "U2 Ex7Test" should {
    "fun() return value equal" in { Ex7.value mustEqual 54656 }
  }
}