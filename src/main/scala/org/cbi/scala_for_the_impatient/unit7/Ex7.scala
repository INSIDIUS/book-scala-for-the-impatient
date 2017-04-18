package org.cbi.scala_for_the_impatient.unit7

import java.util.{HashMap => JavaHashMap}

import scala.collection.JavaConverters._
import scala.collection.mutable.{HashMap => ScalaMap}

object Ex7 {

  val value = {
    val javaMap = new JavaHashMap[String, String]()
    javaMap.put("key", "value")

    val scalaMap = ScalaMap[String, String]()
    scalaMap ++= javaMap.asScala

    scalaMap
  }
}