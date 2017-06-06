package org.cbi.scala_for_the_impatient.unit12.ex10

object UnlessEx {
  def unless(condition: Boolean)(block: => Any) = if (!condition) block
}