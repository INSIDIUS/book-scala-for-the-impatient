package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

object Ex7Test extends Specification {
  "U1 Ex7Test" should {
    "value should contains 100 bit" in { Ex7.value.bitLength mustEqual 100 }
  }
}