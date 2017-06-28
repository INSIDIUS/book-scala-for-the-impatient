package org.cbi.scala_for_the_impatient.unit13.ex10

import org.cbi.scala_for_the_impatient.unit13.ex10.HarryHacker.frequency
import org.specs2.mutable.Specification

class HarryHackerTest extends Specification {

  "U13 Ex10 HarryHackerTest" should {
    "frequency works correctly" in {

      val string = "ababccc"
      val expected = Map('b' -> 2, 'a' -> 2, 'c' -> 3)

      frequency(string) === expected
    }
  }
}