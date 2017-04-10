package org.cbi.scala_for_the_impatient.unit1

import org.specs2.mutable.Specification

class Ex8Test extends Specification {override def is = s2"""

  This is a specification to check the string value

  The string should
    not be empty                                                $e1
                                                                 """

  def e1 = Ex8.value.isEmpty mustEqual false
}