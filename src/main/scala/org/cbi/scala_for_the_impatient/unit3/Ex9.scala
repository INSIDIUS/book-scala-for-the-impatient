package org.cbi.scala_for_the_impatient.unit3

import java.util.TimeZone

import scala.util.Sorting

object Ex9 {
  val value = TimeZone.getAvailableIDs.map(_.stripPrefix("America/")).sorted
}