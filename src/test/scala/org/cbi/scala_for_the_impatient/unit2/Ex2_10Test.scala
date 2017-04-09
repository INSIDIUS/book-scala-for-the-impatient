package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex2_10.ex_2_10_mypow
import org.specs2.mutable.Specification

class Ex2_10Test extends Specification {

  "Ex2_10Test" should {
    "ex_2_10_mypow return pow equal" in { ex_2_10_mypow(2.4, 5) mustEqual 79.62624 }
    "ex_2_10_mypow return pow not equal" in { ex_2_10_mypow(2.4, 5) mustNotEqual 79.62625 }
  }
}
