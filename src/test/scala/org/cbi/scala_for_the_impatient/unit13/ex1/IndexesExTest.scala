package org.cbi.scala_for_the_impatient.unit13.ex1

import org.cbi.scala_for_the_impatient.unit13.ex1.IndexesEx.indexes
import org.specs2.mutable.Specification

import scala.collection.mutable

class IndexesExTest extends Specification {

  "U13 Ex1 IndexesExTest" should {
    "indexes works correctly" in {

      indexes("Mississippi") === Map('M' -> mutable.TreeSet(0),
                                      'i' -> mutable.TreeSet(1, 4, 7, 10),
                                      's' -> mutable.TreeSet(2, 3, 5, 6),
                                      'p' -> mutable.TreeSet(8, 9))
    }
  }
}