package org.cbi.scala_for_the_impatient.unit5.ex6

import org.specs2.mutable.Specification

object PersonTest extends Specification {

  "U5 Ex6 PersonTest" should {
    "age is not set to negative over construrtor" in { val person = new Person(-2); person.age mustEqual 0 }
  }
}