package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex2Test extends Specification {

  "Ex2Test" should {
    "word \'Scala\' entres 8 times" in { Ex2.entries.getOrElse("Scala", 0) mustEqual 8 }
  }
}