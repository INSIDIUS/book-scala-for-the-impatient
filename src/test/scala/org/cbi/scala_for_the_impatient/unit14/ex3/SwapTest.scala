package org.cbi.scala_for_the_impatient.unit14.ex3

import org.cbi.scala_for_the_impatient.unit14.ex3.Swap.swap
import org.specs2.mutable.Specification

class SwapTest extends Specification {

  "U14 Ex2 SwapTest" should {
    "swap is works correctly" in {
      swap(Array(2)) === Array(2)
      swap(Array(2, 3)) === Array(3, 2)
      swap(Array(2, 3, 4)) === Array(3, 2, 4)
    }
  }
}