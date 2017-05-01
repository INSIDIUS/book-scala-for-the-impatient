package org.cbi.scala_for_the_impatient.unit9.ex10

import java.io._
import java.nio.file.Files

import org.specs2.mutable.Specification

import scala.collection.mutable.ArrayBuffer

object PersonTest extends Specification {

  val yurii = Person("Yurii")
  val max = Person("Max")
  val yevgenii = Person("Eevgenii")
  val oleg = Person("Oleg")

  val foreverAlone = Person("I have no friend")

  yurii addFriends Array(max, yevgenii, oleg)
  max addFriends Array(yurii, yevgenii, oleg)
  yevgenii addFriends Array(yurii, max, oleg)
  oleg addFriends Array(yurii, max, yevgenii)

  val personArray = Array(yurii, max, yevgenii, oleg, foreverAlone)

  val file = Files createTempFile("scala", "u9ex10") toFile

  val out = new ObjectOutputStream(new FileOutputStream(file))
  out writeObject personArray
  out close()

  val in = new ObjectInputStream(new FileInputStream(file))
  val savedPersons = in.readObject().asInstanceOf[Array[Person]]

  "U9 Ex10 Test" should {
    "links with friends after deserialization still present" in {
      val yurii = savedPersons(0)
      yurii.friends === ArrayBuffer(max, yevgenii, oleg)
    }
  }
}