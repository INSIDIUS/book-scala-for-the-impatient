package org.cbi.scala_for_the_impatient.unit12.ex5

import org.specs2.mutable.Specification

class LargestExTest extends Specification {

  "LargestExTest" should {
    "largest works correctly" in { LargestEx.largest(x => 10 * x - x * x, 1 to 10) === 25 }
  }
}