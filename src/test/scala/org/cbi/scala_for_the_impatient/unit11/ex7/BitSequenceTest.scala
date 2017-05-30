package org.cbi.scala_for_the_impatient.unit11.ex7

import org.specs2.mutable.Specification

object BitSequenceTest extends Specification {

  "U11 Ex7 BitSequenceTest" should {
    "BitSequence works correctly" in {

      val bit = BitSequence()
      bit(5) = true
      val sixthBit = bit(5)

      bit.toString === "BitSequence[100000]"
      sixthBit === true
    }
  }
}