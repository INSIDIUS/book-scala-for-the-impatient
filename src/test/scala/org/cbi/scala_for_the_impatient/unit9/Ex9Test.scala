package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

object Ex9Test extends Specification {

  "U9 Ex9 Test" should {
    "countClassFiles works correctly" in {
      Ex9.countClassFiles("d://work") !== 0
    }
  }
}