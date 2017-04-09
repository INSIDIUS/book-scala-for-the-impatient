package org.cbi.scala_for_the_impatient.unit5

object Ex5_7 extends App {

  class Person(private val nameAndFamily: String) {
    private val arr = nameAndFamily.split(" ")
    val firsName = arr(0)
    val lastName = arr(1)
  }

  def ex_5_7() {
    val person = new Person("Yurii Khomenko")
    println(person.firsName)
    println(person.lastName)
  }
  ex_5_7()
}

