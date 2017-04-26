package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}
import java.nio.file.Files

import org.cbi.scala_for_the_impatient.unit9.Ex1.reverseFile
import org.specs2.mutable.Specification

import scala.io.Source

object Ex1Test extends Specification {

  "U9 Ex1 Test" should {
    "reverseFile works correctly" in {

      val temp = Files.createTempFile("scala", "test").toFile
      val out = new PrintWriter(temp)
      out.write("hello world" + System.lineSeparator + "hello2 world2")
      out.close()

      reverseFile(temp)

      val source = Source.fromFile(temp)
      val result = source.mkString
      source.close()

      result mustEqual "hello2 world2" + System.lineSeparator + "hello world" + System.lineSeparator
    }
  }
}