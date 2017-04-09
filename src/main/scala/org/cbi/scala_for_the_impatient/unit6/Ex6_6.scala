package org.cbi.scala_for_the_impatient.unit6

object Ex6_6 extends App {

  object Cards extends Enumeration {
    val Clubs = Value("♣")
    val Diamonds = Value("♦")
    val Hearts = Value("♥")
    val Spades = Value("♠")
  }

  print(Cards.Clubs)
}