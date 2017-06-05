package org.cbi.scala_for_the_impatient.unit12.ex6

import org.specs2.mutable.Specification

class LargestAtExTest extends Specification {

  "U12 Ex6 LargestAtExTest" should {
    "largestAt works correctly" in { LargestAtEx.largestAt(x => 10 * x - x * x, 1 to 10) === 5 }
  }
}
