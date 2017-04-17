package org.cbi.scala_for_the_impatient.unit5.ex6

class Person(var age: Int = 0) {
  age = if (age < 0) 0 else age
}