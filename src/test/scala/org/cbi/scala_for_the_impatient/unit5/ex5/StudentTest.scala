package org.cbi.scala_for_the_impatient.unit5.ex5

import org.specs2.mutable.Specification

object StudentTest extends Specification {

  val student = new Student
  student.setName("Yurii")
  student.setId(1)

  "U5 Ex5 StudentTest" should {
    "id is equals" in { student.getId mustEqual 1}
    "name is equals" in { student.getName mustEqual "Yurii" }
  }
}