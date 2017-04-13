package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

object Ex10Test extends Specification {
  "U2 Ex10Test" should {
    "mypow(2.4, 5) return value equal" in { Ex10.mypow(2.4, 5) mustEqual 79.62624 }
  }
}