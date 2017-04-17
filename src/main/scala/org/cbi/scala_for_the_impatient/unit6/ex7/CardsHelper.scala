package org.cbi.scala_for_the_impatient.unit6.ex7

import org.cbi.scala_for_the_impatient.unit6.ex6.Cards._

object CardsHelper {
  def isRed(that: Cards) = Diamonds.equals(that) || Hearts.equals(that)
}