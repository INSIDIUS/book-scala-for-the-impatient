package org.cbi.scala_for_the_impatient.Unit6

object Ex6_2 extends App {

  abstract class UnitConversion { def convert(value: Double): Double }

  class InchesToCentimeters extends UnitConversion { override def convert(value: Double): Double = value * 2.54 }

  class GallonsToLiters extends UnitConversion { override def convert(value: Double): Double = value * 3.78541 }

  class MilesToKilometers extends UnitConversion { override def convert(value: Double): Double = value * 1.60934 }

  def ex_6_2() {
    val six = 6
    var conversion: UnitConversion = new InchesToCentimeters
    println(six + " inches is " + conversion.convert(six) + " centimeters.")

    val thirty = 30
    conversion = new GallonsToLiters
    println(thirty + " gallons is " + conversion.convert(thirty) + " liters.")

    conversion = new MilesToKilometers
    val fifteen = 15
    println(fifteen + " miles is " + conversion.convert(fifteen) + " kilometers.")
  }
  ex_6_2()
}