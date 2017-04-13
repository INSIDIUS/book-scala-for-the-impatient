package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

object Ex5Test extends Specification {
  "U2 Ex5Test" should {
    "print countdown from 10 to 0" in { Ex5.countdown(10); ok }
  }
}