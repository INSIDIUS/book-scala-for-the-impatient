package org.cbi.scala_for_the_impatient.unit5.ex7

import org.specs2.mutable.Specification

object PersonTest extends Specification {

  val firsName = "Yurii"
  val lastName = "Khomenko"
  val person = new Person(firsName + " " + lastName)

  "U5 Ex7 PersonTest" should {
    "firsName is equals" in { person.firsName mustEqual firsName}
    "lastName is equals" in { person.lastName mustEqual lastName}
  }
}