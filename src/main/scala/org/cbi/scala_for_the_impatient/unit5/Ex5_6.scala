package org.cbi.scala_for_the_impatient.unit5

object Ex5_6 extends App {

  class Person(var age: Int) {
    age = if (age < 0) 0 else age
  }

  def ex_5_6() {
    val person = new Person(12)
    println(person.age)
  }
  ex_5_6()
}

