package org.cbi.scala_for_the_impatient.unit10.ex4

import org.specs2.mutable.Specification

object CryptoLoggerTest extends Specification {

  "U10 Ex4 CryptoLoggerTest" should {
    "log must work correctly with key=3" in {
      CryptoLogger().log("ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz") === "DEFGHIJKLMNOPQRSTUVWXYZABC defghijklmnopqrstuvwxyzabc"
    }
    "log must work correctly with key=-3" in {
      CryptoLogger(key = -3).log("ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz") === "XYZABCDEFGHIJKLMNOPQRSTUVW xyzabcdefghijklmnopqrstuvw"
    }
  }
}