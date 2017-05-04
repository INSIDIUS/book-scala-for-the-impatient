package org.cbi.scala_for_the_impatient.unit10.ex1

import java.awt.geom.Ellipse2D

import org.specs2.mutable.Specification

object RectangleLikeTest extends Specification {

  "RectangleLikeTest" should {
    "translate works correctly" in {
      val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
      egg.translate(10, -10)
      egg.getX === 15 and egg.getY === 0
    }
    "grow works correctly" in {
      val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
      egg.grow(10, 20)
      egg.getWidth === 40 and egg.getHeight === 70
    }
  }
}