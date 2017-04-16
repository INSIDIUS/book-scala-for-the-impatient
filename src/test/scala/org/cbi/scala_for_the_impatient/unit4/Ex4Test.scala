package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex4Test extends Specification {

  "U4 Ex4Test" should {
    "word \'Scala\' entres 8 times" in { Ex4.entries.getOrElse("Scala", 0) mustEqual 8 }
    "entries sorted by ASC" in { Ex4.entries equals Ex4.entries.toStream.sorted.toMap }
  }
}