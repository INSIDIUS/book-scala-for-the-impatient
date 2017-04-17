package org.cbi.scala_for_the_impatient.unit6.ex8

import org.cbi.scala_for_the_impatient.unit6.ex8.RGB._
import org.specs2.mutable.Specification

object RGBTest extends Specification {

  "U6 Ex8 RGBTest" should {
    "Red code is equals" in { Red.id mustEqual 0xff0000 }
  }
}