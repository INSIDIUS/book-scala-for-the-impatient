package org.cbi.scala_for_the_impatient.unit12.ex2

import org.specs2.mutable.Specification

class ReduceLeftExTest extends Specification {

  "U12 Ex2 ReduceLeftExTest" should {
    "maxElement works correctly" in { ReduceLeftEx.maxElement(Seq(2, 4, 6, 1, 3, -5, 3)) === 6 }
  }
}
