package org.cbi.scala_for_the_impatient.unit11.ex5

import org.specs2.mutable.Specification

object TableTest extends Specification {

  "U11 Ex5 TableTest" should {

    "toString works correctly" in {
      (Table()
                |   "Java"   | "Scala"
               || "Gosling"  | "Odersky"
               ||   "JVM"    | "JVM, .NET"
        toString) ===
        "<table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling</td><td>Odersky</td></tr><tr><td>JVM</td><td>JVM, .NET</td></tr></table>"
    }

    "toString2 works correctly" in {
      (Table() | "Java" | "Scala" toString) === "<table><tr><td>Java</td><td>Scala</td></tr></table>"
    }
  }
}