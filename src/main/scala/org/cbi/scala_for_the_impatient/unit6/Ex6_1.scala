package org.cbi.scala_for_the_impatient.unit6

object Ex6_1 extends App {

  object Conversations {
    def inchesToCentimeters(inches: Double) = inches * 2.54
    def gallonsToLiters(gallons: Double) = gallons * 3.78541
    def milesToKilometers(miles: Double) = miles * 1.60934
  }


  def ex_6_1() {
    val six = 6
    println(six + " inches is " + Conversations.inchesToCentimeters(six) + " centimeters.")

    val thirty = 30
    println(thirty + " gallons is " + Conversations.gallonsToLiters(thirty) + " liters.")

    val fifteen = 15
    println(fifteen + " miles is " + Conversations.milesToKilometers(fifteen) + " kilometers.")
  }
  ex_6_1()
}