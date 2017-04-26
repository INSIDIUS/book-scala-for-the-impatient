package org.cbi.scala_for_the_impatient.unit9

import java.io.{File, PrintWriter}

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
import scala.math.max

object Ex2 {

  def tabToSpaces(file: File) {

    val source = Source.fromFile(file)

    val buffer = try source.getLines().buffered.map(_.split("\t")).toBuffer finally source close()
    val maxRowLength: ArrayBuffer[Int] = getRowMaxLengthBufer(buffer)

    addSpaces(buffer, maxRowLength)

    val destination = new PrintWriter(file)
    try buffer foreach (line => destination write (line.mkString + System.lineSeparator)) finally destination close()
  }

  private def getRowMaxLengthBufer(buffer: mutable.Buffer[Array[String]]) = {
    val maxRowLength = ArrayBuffer[Int]()

    for {
      i <- buffer.indices
      j <- buffer(i).indices
    } {
      val currentLength = buffer(i)(j).length
      if (j < maxRowLength.length) {
        maxRowLength(j) = max(currentLength, maxRowLength(j))
      } else {
        maxRowLength += currentLength
      }
    }
    maxRowLength
  }

  private def addSpaces(buffer: mutable.Buffer[Array[String]], maxRowLength: ArrayBuffer[Int]) = {
    for {
      i <- buffer.indices
      j <- buffer(i).indices
    } {
      val word = buffer(i)(j)
      val numberOfSpaces = maxRowLength(j) - word.length + 1
      buffer(i)(j) = word + " " * numberOfSpaces
    }
  }
}