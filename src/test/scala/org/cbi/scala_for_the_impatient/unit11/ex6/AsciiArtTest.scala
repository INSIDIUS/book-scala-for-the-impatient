package org.cbi.scala_for_the_impatient.unit11.ex6

import org.cbi.scala_for_the_impatient.unit11.ex6.AsciiArt._
import org.specs2.mutable.Specification

object AsciiArtTest extends Specification {

  "U11 Ex6 AsciiArtTest" should {

    "plus works correctly" in {
      val result = (AsciiArt(cat) + AsciiArt(hello)).toString
      result === AsciiArt(cat.zip(hello).map(f => f._1 + " " + f._2)).toString
    }

    "slash works correctly" in {
      val result = (AsciiArt(cat) / AsciiArt(hello)).toString
      result === AsciiArt(cat ++ hello).toString
    }
  }
}
