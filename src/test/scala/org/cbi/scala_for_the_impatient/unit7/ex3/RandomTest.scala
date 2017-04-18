package org.cbi.scala_for_the_impatient.unit7.ex3

import org.specs2.mutable.Specification

object RandomTest extends Specification {

  random.setSeed(12321)

  "U7 E3 RandomTest" should {
    "randomInt is present" in { random.nextInt() mustNotEqual 0 }
    "randomDouble is present" in { random.nextDouble() mustNotEqual 0 }
  }
}