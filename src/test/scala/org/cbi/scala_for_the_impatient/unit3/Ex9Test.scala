package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

object Ex9Test extends Specification {

  "Ex9Test" should {
    "returned array not contains 'America/'" in { Ex9.value.exists(_.contains("America/")) mustEqual false }
    "returned array sorted by ASC" in { Ex9.value mustEqual Ex9.value.sorted }
  }
}