package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex1Test extends Specification {

  "U4 Ex1Test" should {
    "map is equals" in { Ex1.componentsWithDiscount mustEqual  Map("Monitor 4k" -> 10998.0, "Videocard Display Port" -> 3600.0) }
  }
}