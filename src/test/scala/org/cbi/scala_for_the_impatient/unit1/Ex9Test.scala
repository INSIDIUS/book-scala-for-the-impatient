package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

class Ex9Test extends Specification {
  "Ex9Test" should {
    "The 'Hello'string should have a first char is 'H'" in { Ex9.firstChar mustEqual 'H' }
    "The 'Hello'string should have a last char is 'o'" in { Ex9.lastChar mustEqual 'o' }
  }
}