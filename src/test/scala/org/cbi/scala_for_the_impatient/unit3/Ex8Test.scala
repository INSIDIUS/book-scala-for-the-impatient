package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

object Ex8Test extends Specification {

  "Ex8Test" should {
    "returned array equal" in { Ex8.arr mustEqual ArrayBuffer(3, 3, -4, 8) }
  }
}