package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex8.product
import org.specs2.mutable.Specification

class Ex_8Test extends Specification {
  "Ex8Test" should {
    "product return be equal 825152896" in { product("Hello") mustEqual 825152896 }
  }
}