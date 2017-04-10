package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex5.countdown
import org.specs2.mutable.Specification

class Ex_5Test extends Specification {

  "Ex5Test" should {
    "countdown must print countdown" in { countdown(10); ok }
  }
}