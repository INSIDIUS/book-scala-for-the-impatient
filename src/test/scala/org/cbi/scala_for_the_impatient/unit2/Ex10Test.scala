package org.cbi.scala_for_the_impatient.unit2

import org.cbi.scala_for_the_impatient.unit2.Ex10.mypow
import org.specs2.mutable.Specification

class Ex10Test extends Specification {

  "U2 Ex10Test" should {
    "mypow return pow equal" in { mypow(2.4, 5) mustEqual 79.62624 }
    "mypow return pow not equal" in { mypow(2.4, 5) mustNotEqual 79.62625 }
  }
}
