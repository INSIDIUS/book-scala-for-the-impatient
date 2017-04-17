package org.cbi.scala_for_the_impatient.unit5.ex7

class Person(nameAndFamily: String) {
  private val arr = nameAndFamily.split(" ")
  val firsName = arr(0)
  val lastName = arr(1)
}