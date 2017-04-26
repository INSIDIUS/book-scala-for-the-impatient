package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

import scala.io.Source

object Ex3Test extends Specification {

  val source = Source.fromResource("unit9/ex3words.txt")
  val bigWords = Ex3.bigWords(source)

  "U9 Ex3 Test" should {
    "bigWord not contained words with length less 12 characters" in {
      bigWords.count(_.length < 12) mustEqual 0
    }
    "bigWord contained 3 words with length more than 12 characters inclusive" in {
      bigWords.count(_.length >= 12) mustEqual 3
    }
  }
}