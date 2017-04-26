package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

import scala.io.Source

object Ex4Test extends Specification {

  "U9 Ex4 Test" should {
    "fileStatistics is equals" in {
      val source = Source.fromResource("unit9/ex4numbers.txt")
      Ex4.fileStatistics(source) mustEqual(179.51, 35.902, 56.0, 11.4)
    }
  }
}