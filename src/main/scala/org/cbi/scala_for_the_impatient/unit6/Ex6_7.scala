package org.cbi.scala_for_the_impatient.unit6

object Ex6_7 extends App {

  object Cards extends Enumeration {
    val Clubs = Value("♣")
    val Diamonds = Value("♦")
    val Hearts = Value("♥")
    val Spades = Value("♠")
    def isHearts(that: Cards.Value) = Cards.withName("♥").equals(that)
  }

  println(Cards.isHearts(Cards.Clubs))
  println(Cards.isHearts(Cards.Hearts))
}