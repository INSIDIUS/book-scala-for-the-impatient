package org.cbi.scala_for_the_impatient.Unit6

object Ex6_0_1 extends App {

  object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value
    val Red = Value("Stop")
    val Yellow = Value("Prepare")
    val Green = Value("Go")
  }

  println(TrafficLightColor.withName("Prepare"))
}