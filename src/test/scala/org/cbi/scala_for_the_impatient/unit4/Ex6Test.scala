package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex6Test extends Specification {

  "U4 Ex6Test" should {
    "daysOfWeek not empty" in { Ex6.daysOfWeek.isEmpty mustEqual false }
  }
}