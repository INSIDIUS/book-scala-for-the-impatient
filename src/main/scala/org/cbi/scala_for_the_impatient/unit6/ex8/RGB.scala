package org.cbi.scala_for_the_impatient.unit6.ex8

object RGB extends Enumeration {
  type RGB = Value

  val Black =   Value(0x000000)
  val Red =     Value(0xff0000)
  val Yellow =  Value(0xffff00)
  val Green =   Value(0x00ff00)
  val Cyan =    Value(0x00ffff)
  val Blue =    Value(0x0000ff)
  val Magenta = Value(0xff00ff)
  val White =   Value(0xffffff)
}