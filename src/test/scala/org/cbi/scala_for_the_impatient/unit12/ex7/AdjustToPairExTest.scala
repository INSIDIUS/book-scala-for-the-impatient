package org.cbi.scala_for_the_impatient.unit12.ex7

import org.cbi.scala_for_the_impatient.unit12.ex7.AdjustToPairEx.adjustToPair
import org.specs2.mutable.Specification

class AdjustToPairExTest extends Specification {

  "U12 Ex7 AdjustToPairExTest" should {

    "adjustToPair works correctly" in { adjustToPair(_ * _)((6, 7)) === 42 }

    "example works correctly" in {
      val pairs = (1 to 10) zip (11 to 20)
      val sumsOfPairs = pairs.map(pair => adjustToPair(_ + _)(pair))
      sumsOfPairs === Vector(12, 14, 16, 18, 20, 22, 24, 26, 28, 30)
    }
  }
}