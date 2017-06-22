package org.cbi.scala_for_the_impatient.unit13.ex7

import org.cbi.scala_for_the_impatient.unit13.ex7.TupledEx.fun
import org.specs2.mutable.Specification

class TupledExTest extends Specification {

  "U13 Ex7 TupledExTest" should {
    "fun works correctly" in {

      val prices = List(5.0, 20.0, 9.95)
      val quantities = List(10, 2, 1)
      val expected = List(50.0, 40.0, 9.95)

      fun(prices, quantities) === expected
    }
  }
}