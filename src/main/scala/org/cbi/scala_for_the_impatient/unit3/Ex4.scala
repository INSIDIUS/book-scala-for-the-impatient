package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer

object Ex4 {

  val arr = {
    val arr = Array(-3, 2, -2, 3, 0, -4, 1, 0)
    val arrResult = ArrayBuffer[Int]()

    arrResult ++= arr.filter(_ > 0)
    arrResult ++= arr.filter(_ < 0)
    arrResult ++= arr.filter(_ == 0)

    arrResult.toArray
  }
}