package org.cbi.scala_for_the_impatient.unit10.ex8

import java.io.InputStream

trait Buffered {
  this: InputStream =>

  lazy val size = 5

  var buff = Array.ofDim[Byte](size)
  var position = 0
  var offset = 0

  override def read(): Int = {
    if (position == offset) { this.read(buff, 0, size); offset += size }

    val result = buff(position % size); position += 1; result
  }
}