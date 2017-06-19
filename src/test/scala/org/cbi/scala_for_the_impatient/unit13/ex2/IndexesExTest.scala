package org.cbi.scala_for_the_impatient.unit13.ex2

import org.cbi.scala_for_the_impatient.unit13.ex2.IndexesEx.indexes
import org.specs2.mutable.Specification

class IndexesExTest extends Specification {

  "U13 Ex2 IndexesExTest" should {
    "indexes works correctly" in {

      indexes("Mississippi") === Map('M' -> Seq(0),
                                      'i' -> Seq(1, 4, 7, 10),
                                      's' -> Seq(2, 3, 5, 6),
                                      'p' -> Seq(8, 9))
    }
  }
}