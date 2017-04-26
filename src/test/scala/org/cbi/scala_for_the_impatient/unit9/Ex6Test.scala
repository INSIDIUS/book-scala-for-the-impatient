package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

import scala.io.Source._

object Ex6Test extends Specification {

  "U9 Ex6 Test" should {
    "getStringLiterals is equals" in {
      val text = applyOnSource(fromResource("unit9/ex6text.txt"), _.mkString).asInstanceOf[String]
      Ex6.getStringLiterals(text) mustEqual Array("\"akka\"", "\"akka$actor\\\"rrr\"", "\"akka$actor$dungeon\\\\\"rrrr\"", "\"akka$actor\"")
    }
  }
}