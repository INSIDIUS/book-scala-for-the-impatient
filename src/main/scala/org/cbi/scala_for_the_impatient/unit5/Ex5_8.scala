package org.cbi.scala_for_the_impatient.unit5

object Ex5_8 extends App {

  class Car(val producer: String, val model: String, val year: Int, var number: String) {
    def this(producer: String, model: String, number: String) {
      this(producer, model, -1, number)
    }

    def this(producer: String, model: String, year: Int) {
      this(producer, model, year, "")
    }

    def this(producer: String, model: String) {
      this(producer, model, -1, "")
    }
  }

  def ex_5_8() {
    val car = new Car("bmw", "x6")
    car.number = "603"
    println(car.number)
  }
  ex_5_8()
}