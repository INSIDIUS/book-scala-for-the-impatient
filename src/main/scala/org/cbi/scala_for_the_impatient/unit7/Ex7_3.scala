package org.cbi.scala_for_the_impatient.unit7

package object random {
  private[this] val a = 1664525
  private[this] val b = 1013904223
  private[this] val n = 32
  private[this] var previous = 0L

  def setSeed(seed: Int) { previous = seed }

  def nextInt(): Long = {
    val next = math.round(previous * a + b * math.pow(2, n))
    previous = next
    next
  }

  def nextDouble(): Double = {
    val next = previous * a + b * math.pow(2, n)
    previous = math.round(next)
    next
  }
}



object Ex7_3 extends App {
  random.setSeed(12321)
  println(random.nextInt())
  println(random.nextDouble())
}