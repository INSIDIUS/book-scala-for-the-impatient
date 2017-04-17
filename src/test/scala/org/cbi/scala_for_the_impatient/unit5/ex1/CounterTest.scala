package org.cbi.scala_for_the_impatient.unit5.ex1

import org.specs2.mutable.Specification

object CounterTest extends Specification {

  "U5 Ex1 CounterTest" should {
    "value incremented" in { val counter = new Counter(); counter.increment(); counter.current mustEqual 1 }
    "after Int.MaxValue not set to negative" in {
      val counter = new Counter(Int.MaxValue); counter.increment(); counter.current mustNotEqual Int.MinValue
    }
  }
}