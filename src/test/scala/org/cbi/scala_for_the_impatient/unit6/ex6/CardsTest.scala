package org.cbi.scala_for_the_impatient.unit6.ex6

import org.cbi.scala_for_the_impatient.unit6.ex6.Cards._
import org.specs2.mutable.Specification

object CardsTest extends Specification {

  "U6 Ex6 CardsTest" should {
    "Clubs is equal" in { Clubs.toString mustEqual "♣" }
    "Diamonds is equal" in { Diamonds.toString mustEqual "♦" }
    "Hearts is equal" in { Hearts.toString mustEqual "♥" }
    "Spades is equal" in { Spades.toString mustEqual "♠" }
  }
}