package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex8Test extends Specification {

  "U4 Ex8Test" should {
    "minmax function on arr(-3, 4, 5, -7, -2, 8) return (-7, 8)" in { Ex8.minmax(Array(-3, 4, 5, -7, -2, 8)) mustEqual (-7, 8) }
  }
}