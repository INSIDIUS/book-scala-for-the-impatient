package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex5.countdown
import org.specs2.mutable.Specification

class Ex5Test extends Specification {
  "U2 Ex5Test" should {
    "countdown must print countdown from 10 to 0" in { countdown(10); ok }
  }
}