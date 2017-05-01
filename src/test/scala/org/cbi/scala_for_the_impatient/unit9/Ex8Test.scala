package org.cbi.scala_for_the_impatient.unit9

import org.specs2.mutable.Specification

object Ex8Test extends Specification {

  "U9 Ex8 Test" should {
    "getAllImageLinks works correctly" in {
      val links = applyOnUrl("http://horstmann.com/scala/", s => Ex8.getAllImageLinks(s).mkString("\n"))

      links === "images/cover.png\n" +
        "images/cover2.jpg\n" +
        "http://ad.linksynergy.com/fs-bin/show?id=R/ODEl37NHE&amp;bids=163217.2476823&amp;type=2&amp;subid=0"
    }
  }
}