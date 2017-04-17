package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex10Test extends Specification {

  "U4 Ex10Test" should {
    "zip return is equals" in { Ex10.zip mustEqual Map('H' -> 'W', 'e' -> 'o', 'l' -> 'r', 'l' -> 'l', 'o' -> 'd') }
  }
}