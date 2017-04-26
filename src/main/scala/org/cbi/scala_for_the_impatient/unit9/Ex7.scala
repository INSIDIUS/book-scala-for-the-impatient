package org.cbi.scala_for_the_impatient.unit9

object Ex7 {
  def getAllNonRealNumbers(string: String) =
    string.replaceAll("[-+]?[0-9]+\\.?[0-9]+([eE][-+]?[0-9]+)?", "").split(" ").filter(!_.isEmpty)
}