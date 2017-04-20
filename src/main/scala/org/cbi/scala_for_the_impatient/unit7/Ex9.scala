package org.cbi.scala_for_the_impatient.unit7

import java.lang.System._

object Ex9 extends App {

  val userName = getProperty("user.name")
  val pass = readLine()

  if (pass.length < 3) err.println("Length of pass must be greater then 3 chars!!!")
  else println("Hello, " + userName + "!")
}