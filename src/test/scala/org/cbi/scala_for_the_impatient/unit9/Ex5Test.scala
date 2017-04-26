package org.cbi.scala_for_the_impatient.unit9

import java.nio.file.Files

import org.specs2.mutable.Specification

import scala.io.Source._

object Ex5Test extends Specification {

  "U9 Ex5 Test" should {
    "calculateAndPersistToFile works correctly" in {

      val tempFile = Files.createTempFile("scala", "test").toFile

      Ex5.calculateAndPersistToFile(20, tempFile)

      val result = applyOnFile(tempFile, _.getLines.mkString("\n"))

      val testNumbers = applyOnSource(fromResource("unit9/ex5numbers.txt"), _.getLines().mkString("\n"))

      result mustEqual testNumbers
    }
  }
}