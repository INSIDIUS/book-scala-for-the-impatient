package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex5Test extends Specification {

  "U4 Ex5Test" should {
    "word \'Scala\' entres 8 times" in { Ex5.entries.getOrElse("Scala", 0) mustEqual 8 }
    "entries sorted by ASC" in { Ex5.entries equals Ex5.entries.toStream.sorted.toMap }
  }
}