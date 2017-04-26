package org.cbi.scala_for_the_impatient.unit9

import java.io.PrintWriter
import java.nio.file.Files

import org.specs2.mutable.Specification

object Ex3Test extends Specification {

  val tempFile = Files.createTempFile("scala", "test").toFile
  val out = new PrintWriter(tempFile)
  out.write("hello world wwwwwwwwwwwwwwwwwwwwwwwwww" + System.lineSeparator +
    "hello2 erworld2werwrr ewrsdfdfgdfgdfgdddfggggfgsfsfs" + System.lineSeparator +
    "hellooooqw werworld2" + System.lineSeparator)
  out.close()

  val words = Ex3.bigWord(tempFile)

  "U9 Ex3 Test" should {
    "bigWord not contained words with length less 12 characters" in {
      words.count(_.length < 12) mustEqual 0
    }
    "bigWord contained 3 words with length more than 12 characters inclusive" in {
      words.count(_.length >= 12) mustEqual 3
    }
  }
}