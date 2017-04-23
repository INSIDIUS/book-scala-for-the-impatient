package org.cbi.scala_for_the_impatient.unit8.ex3

class Square(override val a: Int) extends Rectangle(a, a)
object Square { def apply(a: Int) = new Square(a) }