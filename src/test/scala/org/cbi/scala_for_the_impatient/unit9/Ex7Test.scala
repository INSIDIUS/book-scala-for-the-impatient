package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

import scala.io.Source.fromResource

object Ex7Test extends Specification {

  "U9 Ex7 Test" should {
    "getAllNonRealNumbers is equals" in {
      val text = applyOnSource(fromResource("unit9/ex7text.txt"), _.mkString).asInstanceOf[String]
      Ex7.getAllNonRealNumbers(text) mustEqual Array("sdfsd", "sdfs.", "dsfsfd", ".df", "dfe.", ".", "ert", "..")
    }
  }
}