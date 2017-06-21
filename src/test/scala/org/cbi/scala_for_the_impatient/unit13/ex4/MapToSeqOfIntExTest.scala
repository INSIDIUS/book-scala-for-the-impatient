package org.cbi.scala_for_the_impatient.unit13.ex4

import org.specs2.mutable.Specification
import org.cbi.scala_for_the_impatient.unit13.ex4.MapToSeqOfIntEx.fun

class MapToSeqOfIntExTest extends Specification {

  "U13 Ex4 MapToSeqOfIntExTest" should {
    "fun works correctly" in {

      val seq = Array("Tom", "Fred", "Harry")
      val map = Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)
      val expected = Array(3, 5)

      fun(seq, map) === expected
    }
  }
}
