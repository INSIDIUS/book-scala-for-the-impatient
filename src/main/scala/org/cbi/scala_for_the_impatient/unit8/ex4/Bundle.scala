package org.cbi.scala_for_the_impatient.unit8.ex4

import scala.collection.mutable.ArrayBuffer

class Bundle extends Item {

  val items = ArrayBuffer[Item]()

  def add(item: Item): this.type = { items += item; this }

  override def price = items map(_.price) sum

  override def description = items map(_.description) mkString ", "
}

object Bundle { def apply: Bundle = new Bundle() }