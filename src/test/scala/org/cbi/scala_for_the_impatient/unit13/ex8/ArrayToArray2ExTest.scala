package org.cbi.scala_for_the_impatient.unit13.ex8

import org.cbi.scala_for_the_impatient.unit13.ex8.ArrayToArray2Ex.fun
import org.specs2.mutable.Specification

class ArrayToArray2ExTest extends Specification {

  "U13 Ex8 ArrayToArray2ExTest" should {
    "fun works correctly" in {

      val array = Array(1.0, 2, 3, 4, 5, 6)
      val cols = 3
      val expected = Array(Array(1.0, 2, 3), Array(4.0, 5, 6))

      fun(array, cols) === expected
    }
  }
}