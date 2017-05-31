package org.cbi.scala_for_the_impatient.unit11.ex9

import org.specs2.mutable.Specification

object RichFileTest extends Specification {

  "U11 Ex9 RichFileTest" should {
    "unapplySeq works correctly with Unix path" in {

      val RichFile(path, filename, ext) = "/home/insidius/myfile.txt"

      path === "/home/insidius"
      filename === "myfile"
      ext === "txt"
    }

    "unapplySeq works correctly with Windows path" in {

      val RichFile(path, filename, ext) = "c:\\users\\insidius\\myfile.txt"

      path === "c:\\users\\insidius"
      filename === "myfile"
      ext === "txt"
    }
  }
}
