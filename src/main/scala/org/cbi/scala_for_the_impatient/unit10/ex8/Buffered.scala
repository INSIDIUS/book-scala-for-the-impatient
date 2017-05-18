package org.cbi.scala_for_the_impatient.unit10.ex8

import java.io.InputStreamReader

trait Buffered {
  this: InputStreamReader =>
  override def read(): Int = this.read() //Need Implement bufferization
}
