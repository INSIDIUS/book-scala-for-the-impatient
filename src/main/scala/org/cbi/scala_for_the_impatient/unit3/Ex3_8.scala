package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer

object Ex3_8 extends App {

  def ex_3_8_arr() {
    val arr = ArrayBuffer(3, 3, -4, -3, 8)

    var indexes = for (i <- arr.indices if arr(i) < 0 ) yield i
    indexes = indexes.reverse.dropRight(1)

    indexes.foreach(arr.remove)

    println(arr)
  }

  ex_3_8_arr()
}
