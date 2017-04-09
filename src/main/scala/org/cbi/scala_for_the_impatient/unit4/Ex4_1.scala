package org.cbi.scala_for_the_impatient.unit4

object Ex4_1 extends App {

  def ex_4_1() {
    val components = Map("Monitor 4k" -> 12220, "Videocard Display Port" -> 4000)
    val componentsWithDiscount = for ((k, v) <- components) yield (k, v * 0.9)

    println(componentsWithDiscount)
  }

  ex_4_1()
}