package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex3Test extends Specification {

  "U4 Ex3Test" should {
    "word \'Scala\' entres 8 times" in { Ex3.entries.getOrElse("Scala", 0) mustEqual 8 }
  }
}