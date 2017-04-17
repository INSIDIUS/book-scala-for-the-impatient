package org.cbi.scala_for_the_impatient.unit6.ex2

import org.cbi.scala_for_the_impatient.unit6.ex2.InchesToCentimeters._
import org.specs2.mutable.Specification

object InchesToCentimetersTest extends Specification {

  "U6 Ex2 InchesToCentimetersTest" should {
    "is equals" in { convert(6) mustEqual 15.24 }
  }
}