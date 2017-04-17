package org.cbi.scala_for_the_impatient.unit5

import org.specs2.mutable.Specification

object Ex1_CounterTest extends Specification {

  "U5 Ex1_CounterTest" should {
    "value incremented" in { val counter = new Ex1_Counter(); counter.increment(); counter.current mustEqual 1 }
    "after Int.MaxValue not set to negative" in {
      val counter = new Ex1_Counter(Int.MaxValue); counter.increment(); counter.current mustNotEqual Int.MinValue
    }
  }
}