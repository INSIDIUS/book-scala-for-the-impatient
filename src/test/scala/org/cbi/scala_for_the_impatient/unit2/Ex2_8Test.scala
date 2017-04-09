package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex2_8.ex_2_8_product
import org.specs2.mutable.Specification

class Ex2_8Test extends Specification {

  "Ex2_8Test" should {
    "ex_2_8_product return be equal" in { ex_2_8_product("Hello") mustEqual 825152896 }

  }
}
