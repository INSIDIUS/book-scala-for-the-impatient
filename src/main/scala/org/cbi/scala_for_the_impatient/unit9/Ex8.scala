package org.cbi.scala_for_the_impatient.unit9

import scala.io.Source

object Ex8 {
  def getAllImageLinks(source: Source) = {
    val imgLinkPattern = "(img).+(src)=\"(.*?)\"".r
    for (imgLinkPattern(_, _, link) <- imgLinkPattern.findAllIn(source.mkString)) yield link
  }
}