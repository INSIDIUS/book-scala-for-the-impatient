package org.cbi.scala_for_the_impatient.unit4

import scala.collection.JavaConverters._

object Ex7 {

  val sysPropsToTable = {

    val props = System.getProperties.asScala
    val maxLengthKey = props.keySet.maxBy(_.length).length
    val maxLengthValue = props.values.maxBy(_.length).length

    val border = "-" * (maxLengthKey + maxLengthValue) + "\n"

    val content = StringBuilder.newBuilder

    content ++= border
    for ((k, v) <- props) content ++= k + " " * (maxLengthKey - k.length) + " | " + v + "\n"
    content ++= border
  }
}
