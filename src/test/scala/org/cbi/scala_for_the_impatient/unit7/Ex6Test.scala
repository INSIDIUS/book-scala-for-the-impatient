package org.cbi.scala_for_the_impatient.unit7

import org.specs2.mutable.Specification

object Ex6Test extends Specification {

  "U7 Ex6 Test" should {
    "value is equals" in { Ex6.value mustEqual Map("key" -> "value") }
  }
}