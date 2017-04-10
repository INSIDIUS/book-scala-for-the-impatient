package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

class Ex7Test extends Specification { override def is = s2"""

  This is a specification to check the BigInt value

  The value BigInt should
    contain 100 bit                                              $e1
                                                                 """

  def e1 = Ex7.value.bitLength mustEqual 100
}