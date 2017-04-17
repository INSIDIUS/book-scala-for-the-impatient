package org.cbi.scala_for_the_impatient.unit4

import org.specs2.mutable.Specification

object Ex7Test extends Specification {

  "U4 Ex7Test" should {
    "sysPropsToTable is not empty" in { println(Ex7.sysPropsToTable); Ex7.sysPropsToTable.isEmpty mustEqual false }
  }
}