package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex5Test extends Specification {

  "Ex5Test" should {
    "returned average of array elements equal" in { Ex5.avr_arr() mustEqual 1.3 }
  }
}