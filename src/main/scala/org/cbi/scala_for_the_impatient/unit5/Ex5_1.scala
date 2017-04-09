package org.cbi.scala_for_the_impatient.unit5

object Ex5_1 extends App {

  class Counter {
    private var value = 0
    def increment() { if (value != Int.MaxValue) value += 1}
    def current = value
  }

  def ex_5_1() {
    val c = new Counter
    c.increment()
    println(c.current)

  }
  ex_5_1()
}

