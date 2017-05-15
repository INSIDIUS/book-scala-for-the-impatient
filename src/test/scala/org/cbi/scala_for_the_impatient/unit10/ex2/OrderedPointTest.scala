package org.cbi.scala_for_the_impatient.unit10.ex2

import org.specs2.mutable.Specification

object OrderedPointTest extends Specification {

  "U10 Ex2 OrderedPointTest" should {
    "lower than" in { Some(OrderedPoint(1, 2).compare(OrderedPoint(2, 0))) must beSome((_: Int) < 0) }
    "equal to" in { Some(OrderedPoint(1, 2).compare(OrderedPoint(1, 2))) must beSome((_: Int) == 0) }
    "grater than" in { Some(OrderedPoint(1, 4).compare(OrderedPoint(1, 0))) must beSome((_: Int) > 0) }
  }
}