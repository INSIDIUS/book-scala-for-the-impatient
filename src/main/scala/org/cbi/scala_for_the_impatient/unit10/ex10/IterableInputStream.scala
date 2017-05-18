package org.cbi.scala_for_the_impatient.unit10.ex10

import java.io.InputStream

class IterableInputStream(in: InputStream) extends InputStream with Iterable[Byte] {

  override def read(): Int = in.read()

  override def iterator = new Iterator[Byte] {
    override def hasNext: Boolean = in.available() > 0
    override def next(): Byte = in.read().toByte
  }
}
