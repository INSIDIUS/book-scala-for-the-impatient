package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer

object Ex8 {

  val arr = {
    val arr = ArrayBuffer(3, 3, -4, -3, 8)

    var indices = for (i <- arr.indices if arr(i) < 0 ) yield i

    indices = indices.reverse.dropRight(1)
    indices foreach arr.remove

    arr
  }
}