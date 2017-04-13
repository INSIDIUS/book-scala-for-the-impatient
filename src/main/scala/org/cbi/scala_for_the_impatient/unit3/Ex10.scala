package org.cbi.scala_for_the_impatient.unit3

import java.awt.datatransfer._

import scala.collection.JavaConverters._

object Ex10 {
  val flavors = SystemFlavorMap
    .getDefaultFlavorMap
    .asInstanceOf[SystemFlavorMap]
    .getNativesForFlavor(DataFlavor.imageFlavor)
    .asScala
    .toBuffer
}