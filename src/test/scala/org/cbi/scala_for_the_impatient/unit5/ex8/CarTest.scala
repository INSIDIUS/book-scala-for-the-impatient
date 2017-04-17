package org.cbi.scala_for_the_impatient.unit5.ex8

import org.specs2.mutable.Specification

object CarTest extends Specification {

  val year = 2007
  val regNumber = "xxREG_NUMBERxx"

  "U5 Ex8 CarTest" should {
    "when set only year, regNumber is empty" in {
      val car = new Car("bmw", "x6", year);  car.year mustEqual year and (car.regNumber.isEmpty mustEqual true)
    }

    "when set only regNumber, year is -1" in {
      val car = new Car("bmw", "x6", regNumber);  car.regNumber mustEqual regNumber and (car.year mustEqual -1)
    }

    "when set both" in {
      val car = new Car("bmw", "x6", year, regNumber);  car.year mustEqual year and (car.regNumber mustEqual regNumber)
    }
  }
}