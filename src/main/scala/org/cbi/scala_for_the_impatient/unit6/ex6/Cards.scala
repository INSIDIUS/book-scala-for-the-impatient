package org.cbi.scala_for_the_impatient.unit6.ex6

object Cards extends Enumeration {
  type Cards = Value

  val Clubs = Value("♣")
  val Diamonds = Value("♦")
  val Hearts = Value("♥")
  val Spades = Value("♠")
}