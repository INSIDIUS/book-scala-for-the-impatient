package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex9.ex_2_9_product
import org.specs2.mutable.Specification

class Ex9Test extends Specification {

  "Ex2_9Test" should {
    "ex_2_9_product return be equal" in { ex_2_9_product("Hello") mustEqual 9415087488L }
  }
}