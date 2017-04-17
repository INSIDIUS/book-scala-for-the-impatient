package org.cbi.scala_for_the_impatient.unit6.ex3

import java.awt.Point

import org.specs2.mutable.Specification

object OriginTest extends Specification {

  "U6 Ex3 OriginTest" should {
    "is equals" in { val point = Origin; point.setLocation(3, 4); point.getLocation mustEqual new Point(3, 4) }
  }
}