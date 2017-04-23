package org.cbi.scala_for_the_impatient.unit8.ex9

import org.specs2.mutable.Specification

object AntTest extends Specification {

  "U8 Ex9 AntTest" should {
    "ant sees in two steps" in { Ant().env.length mustEqual 2 }
  }
}