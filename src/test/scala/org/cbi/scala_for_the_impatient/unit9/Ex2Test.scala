package org.cbi.scala_for_the_impatient.unit9

import java.io.PrintWriter
import java.nio.file.Files

import org.cbi.scala_for_the_impatient.unit9.Ex2.tabToSpaces
import org.specs2.mutable.Specification

object Ex2Test extends Specification {

  "U9 Ex2 Test" should {
    "tabToSpaces works correctly " in {

      val temp = Files.createTempFile("scala", "test").toFile
      val out = new PrintWriter(temp)
      out.write("hello\tworld\twwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "hello2\terworld2werwrr\tewrsdfdfgdfgdfgdddfggggfgsfsfs\n" +
                "hellooooqw\twerworld2")
      out.close()

      tabToSpaces(temp)

      val print = applyOnFile(temp, _.getLines.foreach(println))
      val numOfChars = applyOnFile(temp, _.mkString.length)

      numOfChars mustEqual 146
    }
  }
}