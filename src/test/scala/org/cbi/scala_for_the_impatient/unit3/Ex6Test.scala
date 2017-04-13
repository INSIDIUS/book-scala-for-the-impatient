package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

object Ex6Test extends Specification {

  "Ex6Test" should {
    "returned array equal" in { Ex6.arrSortedDesc mustEqual Array(8, 3, 3, -3, -4) }
    "returned arrayBuffer equal" in { Ex6.arrbuffSortedDesc mustEqual ArrayBuffer(8, 3, 3, -3, -4) }
  }
}