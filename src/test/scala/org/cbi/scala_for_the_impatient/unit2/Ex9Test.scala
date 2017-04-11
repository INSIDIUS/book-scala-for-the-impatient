package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex9.product
import org.specs2.mutable.Specification

class Ex9Test extends Specification {

  "U2 Ex9Test" should {
    "product(\"Hello\") return equal" in { product("Hello") mustEqual 9415087488L }
  }
}