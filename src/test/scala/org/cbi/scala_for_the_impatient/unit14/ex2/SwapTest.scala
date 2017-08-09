package org.cbi.scala_for_the_impatient.unit14.ex2

import org.cbi.scala_for_the_impatient.unit14.ex2.Swap.swap
import org.specs2.mutable.Specification

class SwapTest extends Specification {

  "U14 Ex2 SwapTest" should {
    "swap is works correctly" in { swap((2, 3)) === (3, 2) }
  }
}