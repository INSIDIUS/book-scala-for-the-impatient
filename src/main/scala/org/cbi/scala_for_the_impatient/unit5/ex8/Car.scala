package org.cbi.scala_for_the_impatient.unit5.ex8

class Car(val producer: String, val model: String, val year: Int, var regNumber: String) {
  def this(producer: String, model: String, year: Int) { this(producer, model, year, "") }
  def this(producer: String, model: String, regNumber: String) { this(producer, model, -1, regNumber) }
  def this(producer: String, model: String) { this(producer, model, -1, "") }
}