package org.cbi.scala_for_the_impatient.unit7.ex3

package object random {

  private[this] val a = 1664525
  private[this] val b = 1013904223
  private[this] val n = 32
  private[this] var previous = 0L

  private def getRandomValue = previous * a + b * math.pow(2, n)

  def setSeed(seed: Int) { previous = seed }

  def nextInt() = {
    val next = math.round(getRandomValue)
    previous = next
    next
  }

  def nextDouble() = {
    val next = getRandomValue
    previous = math.round(next)
    next
  }
}