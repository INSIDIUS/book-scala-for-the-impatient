package org.cbi.scala_for_the_impatient.unit3

import java.awt.datatransfer.{DataFlavor, SystemFlavorMap}

object Ex3_10 extends App {

  def ex_3_10_arr() {

    val flavors = SystemFlavorMap
      .getDefaultFlavorMap
      .asInstanceOf[SystemFlavorMap]
      .getNativesForFlavor(DataFlavor.imageFlavor)

    println(flavors)
  }

  ex_3_10_arr()
}
