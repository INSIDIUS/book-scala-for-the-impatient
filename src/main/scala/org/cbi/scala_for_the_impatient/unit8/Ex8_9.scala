package org.cbi.scala_for_the_impatient.unit8

object Ex8_9 extends App {

  class Creature {
    lazy val range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  class Ant extends Creature {
    override lazy val range = 2
  }

  val ant = new Ant
  println(ant.env.length)

}