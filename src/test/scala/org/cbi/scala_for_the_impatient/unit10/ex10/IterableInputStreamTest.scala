package org.cbi.scala_for_the_impatient.unit10.ex10

import java.io.ByteArrayInputStream

import org.specs2.mutable.Specification

class IterableInputStreamTest extends Specification {

  "U10 Ex10 IterableInputStreamTest" should {
    "read() method works correctly" in {
      val in = new IterableInputStream(new ByteArrayInputStream("Hello".getBytes()))
      in.read() === 'H'
    }

    "iterator method works correctly" in {
      val in = new IterableInputStream(new ByteArrayInputStream("Hello".getBytes()))
      val it = in.iterator
      it.hasNext === true and it.next() === 'H'
    }
  }
}
