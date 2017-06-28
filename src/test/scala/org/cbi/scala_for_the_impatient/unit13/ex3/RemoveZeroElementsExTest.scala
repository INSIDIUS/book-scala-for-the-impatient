package org.cbi.scala_for_the_impatient.unit13.ex3

import org.cbi.scala_for_the_impatient.unit13.ex3.RemoveZeroElementsEx.removeZeroElements
import org.specs2.mutable.Specification

import scala.collection.mutable

class RemoveZeroElementsExTest extends Specification {

  "U13 Ex3 RemoveZeroElementsExTest" should {
    "removeZeroElements works corrwctly" in {

      val list = mutable.LinkedList(-2, 0, 0, 3, 0, 5, 0, 0, 0)
      val expected = mutable.LinkedList(-2, 3, 5)

      removeZeroElements(list)

      list === expected
    }
  }
}