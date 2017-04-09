package org.cbi.scala_for_the_impatient.unit9

object Ex0_3 extends App {
  val numPattern = "[0-9]+".r

  val wsnumwsPattern = """\s+[0-9]+\s+""".r

  println(numPattern)
  println(wsnumwsPattern)

  println(numPattern.replaceAllIn("99 sdf, 98 sdfsdf", "XX"))

  val numitemPattern = "([0-9]+) ([a-z]+)".r
  for (numitemPattern(num, item) <- numitemPattern.findAllIn("99 bottles, 98 bottles")) println(num + ":" + item)
}
