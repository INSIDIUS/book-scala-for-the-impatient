package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex1Test extends Specification {
  "U3 Ex1Test" should {
    "returned array contains 10 elements" in { Ex1.arrayFrom0to(10).length mustEqual 10}
  }
}