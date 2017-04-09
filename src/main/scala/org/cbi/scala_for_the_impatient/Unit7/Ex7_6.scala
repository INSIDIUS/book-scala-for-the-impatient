package org.cbi.scala_for_the_impatient.Unit7

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable.{HashMap => ScalaMap}

object Ex7_6 extends App {
  val javaMap = new JavaHashMap[String, String]()
  javaMap.put("key", "value")

  var scalaMap = ScalaMap[String, String]()

 // javaMap.entrySet().forEach(scalaMap += _)

//  for ((k, v) <- javaMap.entrySet()) scalaMap += (k, v)

  println(scalaMap)
}
