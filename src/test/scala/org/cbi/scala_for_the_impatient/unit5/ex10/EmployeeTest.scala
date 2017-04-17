package org.cbi.scala_for_the_impatient.unit5.ex10

import org.specs2.mutable.Specification

object EmployeeTest extends Specification {

  val employee = new Employee

  "U5 Ex10 EmployeeTest" should {
    "name is equals" in { employee.name mustEqual "John Q. Public" }
    "salary is equals" in { employee.salary mustEqual 0.0 }
  }
}