package org.cbi.scala_for_the_impatient.unit12.ex10

import org.cbi.scala_for_the_impatient.unit12.ex10.UnlessEx._
import org.specs2.mutable.Specification

class UnlessExTest extends Specification {

  "U12 Ex10 UnlessExTest" should {
    "unless works correctly" in {
      val result = unless(1 == 0) { true }
      result === true
    }
  }
}