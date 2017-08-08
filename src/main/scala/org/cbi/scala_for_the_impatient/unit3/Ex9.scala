package org.cbi.scala_for_the_impatient.unit3

import java.util.TimeZone

object Ex9 {
  val value = TimeZone.getAvailableIDs.map(_.stripPrefix("America/")).sorted
}