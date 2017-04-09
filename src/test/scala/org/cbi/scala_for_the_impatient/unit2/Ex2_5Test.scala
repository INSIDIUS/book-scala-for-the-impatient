package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex2_5.ex_2_5_countdown
import org.specs2.mutable.Specification

class Ex2_5Test extends Specification {

  "Ex2_5Test" should {
    "ex_2_5_countdown must print countdown" in { ex_2_5_countdown(10); ok }
  }
}