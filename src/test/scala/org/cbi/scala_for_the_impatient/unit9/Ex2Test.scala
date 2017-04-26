package org.cbi.scala_for_the_impatient.unit9

import java.io.PrintWriter
import java.nio.file.Files

import org.cbi.scala_for_the_impatient.unit9.Ex2.tabToSpaces
import org.specs2.mutable.Specification

import scala.io.Source

object Ex2Test extends Specification {

  "U9 Ex2 Test" should {
    "tabToSpaces works correctly " in {

      val temp = Files.createTempFile("scala", "test").toFile
      val out = new PrintWriter(temp)
      out.write("hello\tworld\twerwer" + System.lineSeparator +
        "hello2\tworld2werwrr\tsdfsfsfs" + System.lineSeparator +
        "hellooooqw\tworld2" + System.lineSeparator)
      out.close()

      tabToSpaces(temp)

      Source.fromFile(temp).getLines.foreach(println)
      println()

      Source.fromFile(temp).mkString.length mustEqual 96
    }
  }
}