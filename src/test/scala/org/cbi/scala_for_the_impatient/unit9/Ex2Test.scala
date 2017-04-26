package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}
import java.nio.file.Files

import org.cbi.scala_for_the_impatient.unit9.Ex2.tabToSpaces
import org.specs2.mutable.Specification

import scala.io.Source

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

      print(temp)

      numOfChars(temp) mustEqual 146
    }
  }

  private def numOfChars(temp: File) = {
    val source = Source.fromFile(temp)
    val numOfChars = source.mkString.length
    source.close()
    numOfChars
  }

  private def print(temp: File) = {
    val source = Source.fromFile(temp)
    val result = source.getLines.foreach(println)
    println()
    source.close()
  }
}