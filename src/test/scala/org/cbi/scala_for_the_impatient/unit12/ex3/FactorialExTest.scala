package org.cbi.scala_for_the_impatient.unit12.ex3

import org.specs2.mutable.Specification

class FactorialExTest extends Specification {

  "U12 Ex3 FactorialExTest" should {
    "fact works correctly" in {
      FactorialEx.fact(5) === 120
      FactorialEx.fact(-1) === 1
    }
  }
}
