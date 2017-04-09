package org.cbi.scala_for_the_impatient.Unit7

object Ex7_7 extends App {

  import java.util.{HashMap => JavaHashMap}
  val javaMap = new JavaHashMap[String, String]()
  javaMap.put("key", "value")

  import scala.collection.mutable.{HashMap => ScalaMap}
  var scalaMap = ScalaMap[String, String]()

 // javaMap.entrySet().forEach(scalaMap += _)

//  for ((k, v) <- javaMap.entrySet()) scalaMap += (k, v)

  println(scalaMap)
}
