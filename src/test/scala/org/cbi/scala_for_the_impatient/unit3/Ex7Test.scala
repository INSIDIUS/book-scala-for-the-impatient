package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex7Test extends Specification {

  "Ex7Test" should {
    "returned array is equals" in { Ex7.arrDistinct mustEqual Array(3, -4, 7, -3, 8) }
  }
}