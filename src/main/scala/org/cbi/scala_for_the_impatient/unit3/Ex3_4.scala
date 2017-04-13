package org.cbi.scala_for_the_impatient.unit3

import scala.collection.mutable.ArrayBuffer

object Ex3_4 extends App {

  def ex_3_4_arr() {
    val arr = Array(-2 to 5: _*)
    val arrResult = ArrayBuffer[Int]()

    arrResult ++= arr.filter(_ > 0)
    arrResult ++= arr.filter(_ < 0)
    arrResult ++= arr.filter(_ == 0)

    println(arrResult.toArray.deep)
  }

  ex_3_4_arr()
}
