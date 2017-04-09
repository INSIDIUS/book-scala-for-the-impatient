package org.cbi.scala_for_the_impatient.unit8

import java.util

object Ex8_4 extends App {

  abstract class Item { def price(); def description() }

//  class SimpleItem(val price: Double, val description: String) extends Item {}

  class Bundle {
    private val items = new util.ArrayList[Item]
//    def price = { var p = 0; for (i <- items :_*) }
//    def addItem(item: Item) {items.add(item)}

  }

}