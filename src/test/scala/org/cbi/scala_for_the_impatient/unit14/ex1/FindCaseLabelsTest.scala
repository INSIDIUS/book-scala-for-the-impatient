package org.cbi.scala_for_the_impatient.unit14.ex1

import java.nio.file.Paths

import org.cbi.scala_for_the_impatient.unit14.ex1.FindCaseLabels.percentOfUsageFile
import org.specs2.mutable.Specification

class FindCaseLabelsTest extends Specification {

  val resource = getClass.getClassLoader.getResource("unit14/caseWithFallThr.txt")
  val path = Paths.get(resource.toURI)

  "U14 Ex1 FindCaseLabelsTest" should {
    "percentOfUsage works correctly" in {

      val actual = percentOfUsageFile(path)._2
      val expected = 0.25

      actual === expected
    }
  }
}