package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex4Test extends Specification {

  "Ex4Test" should {
    "returned array equal" in { Ex4.arr mustEqual Array(2, 3, 1, -3, -2, -4, 0, 0) }
  }
}