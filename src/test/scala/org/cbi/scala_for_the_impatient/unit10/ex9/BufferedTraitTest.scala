package org.cbi.scala_for_the_impatient.unit10.ex9

import java.io.ByteArrayInputStream

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

object BufferedTraitTest extends Specification {

  val text = "Have the best of both worlds. Construct elegant class hierarchies for maximum code reuse and extensibility, implement their behavior using higher-order functions. Or anything in-between."

  "U10 Ex9 BufferedTraitTest" should {
    "trait method works correctly" in {
      val in = new ByteArrayInputStream(text.getBytes()) with ConsoleLogger with Buffered

      val result = ArrayBuffer[Char]()
      while (in.available() > 0) result += in.read().toChar

      result.mkString("") === text
    }
  }
}
