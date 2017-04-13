package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex2Test extends Specification {
  "Ex2Test" should {
    "returned array equal" in { Ex2.arr() mustEqual Array(2, 1, 4, 3, 5)}
  }
}