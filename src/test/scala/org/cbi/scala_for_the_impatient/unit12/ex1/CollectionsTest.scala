package org.cbi.scala_for_the_impatient.unit12.ex1

import org.specs2.mutable.Specification

class CollectionsTest extends Specification {

  val expected = for (i <- -5 to 5) yield (i, i * i)

  "U12 Ex1 CollectionTest" should {
    "values works correctly" in { Collections.values(x => x * x, -5, 5) === expected }
  }
}
