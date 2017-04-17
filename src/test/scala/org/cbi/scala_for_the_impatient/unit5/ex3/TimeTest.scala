package org.cbi.scala_for_the_impatient.unit5.ex3

import org.specs2.mutable.Specification

object TimeTest extends Specification {

  "U5 Ex3 TimeTest" should {
    "past before future " in {
      val past = new Time(22, 57); val future = new Time(23, 59); past.before(future) mustEqual true
    }
  }
}