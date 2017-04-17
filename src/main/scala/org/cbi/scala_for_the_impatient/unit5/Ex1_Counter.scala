package org.cbi.scala_for_the_impatient.unit5

class Ex1_Counter(private var value: Int = 0) {
  def increment() { if (value != Int.MaxValue) value += 1 }
  def current = value
}