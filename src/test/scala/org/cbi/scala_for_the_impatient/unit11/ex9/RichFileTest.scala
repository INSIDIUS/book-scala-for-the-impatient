package org.cbi.scala_for_the_impatient.unit11.ex9

import org.specs2.mutable.Specification

object RichFileTest extends Specification {

  "U11 Ex9 RichFileTest" should {
    "unapply works correctly with Unix path" in {

      val RichFile(richFile) = "/home/insidius/myfile.txt"

      richFile.path === "/home/insidius"
      richFile.filename === "myfile"
      richFile.ext === "txt"
    }

    "unapply works correctly with Windows path" in {

      val RichFile(richFile) = "c:\\users\\insidius\\myfile.txt"

      richFile.path === "c:\\users\\insidius"
      richFile.filename === "myfile"
      richFile.ext === "txt"
    }
  }
}
