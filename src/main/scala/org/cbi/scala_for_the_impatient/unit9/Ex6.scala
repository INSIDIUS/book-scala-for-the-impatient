package org.cbi.scala_for_the_impatient.unit9

object Ex6 {
  def getStringLiterals(string: String) = "\".+\"".r.findAllIn(string).toArray
}