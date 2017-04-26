package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

import scala.io.Source

object Ex4Test extends Specification {

  val source = Source.fromResource("unit4/ex4words.txt")
  val entries = Ex4.entries(source)

  "U4 Ex4Test" should {
    "word \'Scala\' entres 8 times" in { entries.getOrElse("Scala", 0) mustEqual 8 }
    "entries sorted by ASC" in { entries equals entries.toStream.sorted.toMap }
  }
}