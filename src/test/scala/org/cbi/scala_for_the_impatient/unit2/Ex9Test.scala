package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex9.product
import org.specs2.mutable.Specification

class Ex9Test extends Specification {

  "U2 Ex9Test" should {
    "product return be equal to 9415087488L" in { product("Hello") mustEqual 9415087488L }
  }
}