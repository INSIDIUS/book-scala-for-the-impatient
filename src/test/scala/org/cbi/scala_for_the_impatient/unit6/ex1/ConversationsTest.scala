package org.cbi.scala_for_the_impatient.unit6.ex1

import org.cbi.scala_for_the_impatient.unit6.ex1.Conversations._
import org.specs2.mutable.Specification

object ConversationsTest extends Specification {

  "U6 Ex1 ConversationsTest" should {
    "inchesToCentimeters is equals" in { inchesToCentimeters(6) mustEqual 15.24 }
    "gallonsToLiters is equals" in { gallonsToLiters(30) mustEqual 113.56230000000001 }
    "milesToKilometers is equals" in { milesToKilometers(15) mustEqual 24.1401 }
  }
}