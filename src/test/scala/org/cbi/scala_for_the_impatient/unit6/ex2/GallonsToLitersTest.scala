package org.cbi.scala_for_the_impatient.unit6.ex2

import org.cbi.scala_for_the_impatient.unit6.ex2.GallonsToLiters._
import org.specs2.mutable.Specification

object GallonsToLitersTest extends Specification {

  "U6 Ex2 GallonsToLitersTest" should {
    "is equals" in { convert(30) mustEqual 113.56230000000001 }
  }
}