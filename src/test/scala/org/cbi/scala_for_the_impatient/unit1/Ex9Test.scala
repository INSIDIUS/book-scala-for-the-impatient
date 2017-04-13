package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

object Ex9Test extends Specification {
  "U1 Ex9Test" should {
    "'Hello' string have a first char is 'H'" in { Ex9.firstChar mustEqual 'H' }
    "'Hello' string have a last char is 'o'" in { Ex9.lastChar mustEqual 'o' }
  }
}