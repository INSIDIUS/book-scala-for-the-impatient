package org.cbi.scala_for_the_impatient.unit6.ex2

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = value * 2.54
}