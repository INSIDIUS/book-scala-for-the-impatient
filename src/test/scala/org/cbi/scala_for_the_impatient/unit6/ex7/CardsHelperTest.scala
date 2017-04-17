package org.cbi.scala_for_the_impatient.unit6.ex7

import org.cbi.scala_for_the_impatient.unit6.ex6.Cards._
import org.cbi.scala_for_the_impatient.unit6.ex7.CardsHelper._
import org.specs2.mutable.Specification

object CardsHelperTest extends Specification {

  "U6 Ex7 CardsHelperTest" should {
    "Diamonds is red" in { isRed(Diamonds) mustEqual true }
    "Hearts is red" in { isRed(Hearts) mustEqual true }
    "Clubs is not red" in { isRed(Clubs) mustEqual false }
    "Spades is not red" in { isRed(Spades) mustEqual false }
  }
}