package org.cbi.scala_for_the_impatient.unit8.ex8

import org.specs2.mutable.Specification

object SecretAgentTest extends Specification {

  val agent = SecretAgent("007")

  "U8 Ex8 SecretAgentTest" should {
    "name is equals" in { agent.name mustEqual "secret" }
    "toString is equals" in { agent.name mustEqual "secret" }
  }
}