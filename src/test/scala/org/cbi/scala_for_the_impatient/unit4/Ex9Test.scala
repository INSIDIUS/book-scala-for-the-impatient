package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex9Test extends Specification {

  "Ex9Test" should {
    "lteqgt function on arr(-3, 4, 5, -6, -2, 6) return (3, 1, 2)" in {
      Ex9.lteqgt(Array(-3, 4, 5, -6, -2, 6), 4) mustEqual (3, 1, 2)}
  }
}