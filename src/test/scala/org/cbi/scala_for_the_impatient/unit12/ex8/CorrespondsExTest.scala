package org.cbi.scala_for_the_impatient.unit12.ex8

import org.specs2.mutable.Specification

class CorrespondsExTest extends Specification {

  val strings = Array("One", "Two", "Three")
  val lengthsTrue = Array(3, 3, 5)
  val lengthsFalse = Array(3, 3, 6)

  "U12 Ex8 CorrespondsExTest" should {
    "corresponds works correctly" in {
      CorrespondsEx(strings).corresponds(lengthsTrue)(_.length == _) === true
      CorrespondsEx(strings).corresponds(lengthsFalse)(_.length == _) === false
    }
  }
}