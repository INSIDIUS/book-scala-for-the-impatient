package org.cbi.scala_for_the_impatient.unit7

import org.specs2.mutable.Specification

object Ex7Test extends Specification {

  "U7 Ex7 Test" should {
    "value is equals" in { Ex7.value mustEqual Map("key" -> "value") }
  }
}