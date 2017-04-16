package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex4Test extends Specification {

  "Ex4Test" should {
    "entries sorted by ASC" in { Ex4.entries equals Ex4.entries.toStream.sorted.toMap }
  }
}