package org.cbi.scala_for_the_impatient.unit4

import scala.collection.JavaConversions._

object Ex4_7 extends App {

  def ex_4_7() {
    var maxLenKey = 0
    var maxLenValue = 0

    for ((k,v) <- System.getProperties) {
      if (k.length > maxLenKey) maxLenKey = k.length
      if (v.length > maxLenValue) maxLenValue = v.length
    }

    val border = "-" * (maxLenKey + maxLenValue) + "\n"

    var content = ""
    for ((k,v) <- System.getProperties) {
      content += (k + " " * (maxLenKey - k.length)) + " | " + v + "\n"
    }

    println(border + content + border)
  }

  ex_4_7()
}
