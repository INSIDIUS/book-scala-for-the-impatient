package org.cbi.scala_for_the_impatient.unit5

object Ex5_10 extends App {

  class Employee(val name: String = "John Q. Public", var salary: Double = 0.0) {

  }

  def ex_5_10() {
    val john = new Employee()
    john.salary = 30000
    println(john.name + ":" + john.salary)
  }
  ex_5_10()
}