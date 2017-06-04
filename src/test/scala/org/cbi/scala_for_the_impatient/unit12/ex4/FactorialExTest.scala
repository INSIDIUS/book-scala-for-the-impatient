package org.cbi.scala_for_the_impatient.unit12.ex4

import org.specs2.mutable.Specification

class FactorialExTest extends Specification {

  "U12 Ex4 FactorialExTest" should {
    "fact works correctly" in {
      FactorialEx.fact(5) === 120
      FactorialEx.fact(-1) === 1
    }
  }
}