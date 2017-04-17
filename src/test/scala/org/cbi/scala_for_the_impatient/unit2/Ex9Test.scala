package org.cbi.scala_for_the_impatient.unit2

import org.specs2.mutable.Specification

object Ex9Test extends Specification {
  "U2 Ex9Test" should {
    "product(\"Hello\") return is equals" in { Ex9.product("Hello") mustEqual 9415087488L }
  }
}