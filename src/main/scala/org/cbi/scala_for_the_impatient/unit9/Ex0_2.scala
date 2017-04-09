package org.cbi.scala_for_the_impatient.unit9

import java.net.URL

import sys.process._

object Ex0_2 extends App {
  "ls -al .." !

  val result = "ls -al .." !;
  println(result)

  "ls -al .." #| "grep hello" !

  println()

  "grep Scala" #< new URL("http://horstmann.com/index.html") !

}
