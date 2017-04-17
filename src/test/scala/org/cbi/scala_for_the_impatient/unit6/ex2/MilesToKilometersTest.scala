package org.cbi.scala_for_the_impatient.unit6.ex2

import org.cbi.scala_for_the_impatient.unit6.ex2.MilesToKilometers._
import org.specs2.mutable.Specification

object MilesToKilometersTest extends Specification {

  "U6 Ex2 MilesToKilometersTest" should {
    "is equals" in { convert(15) mustEqual 24.1401 }
  }
}