package org.cbi.scala_for_the_impatient.unit3

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

object Ex10Test extends Specification {

  "Ex10Test" should {
    "flavors is ArrayBuffer" in { Ex10.flavors.getClass mustEqual ArrayBuffer[String]().getClass }
    "flavors is not empty" in { Ex10.flavors.isEmpty mustEqual false }
  }
}