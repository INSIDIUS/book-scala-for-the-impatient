package org.cbi.scala_for_the_impatient.unit7

object Ex7 {

  val value = {

    import java.util.{HashMap => JavaHashMap}
    val javaMap = new JavaHashMap[String, String]()
    javaMap.put("key", "value")

    import scala.collection.mutable.{HashMap => ScalaMap}
    val scalaMap = ScalaMap[String, String]()

    import scala.collection.JavaConverters._
    scalaMap ++= javaMap.asScala

    scalaMap
  }
}