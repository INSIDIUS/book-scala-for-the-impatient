package org.cbi.scala_for_the_impatient.Unit7

object Ex7_9 extends App {

  val userName = System.getProperty("user.name")
  val pass = Console.readLine()

  if (pass.length < 3) Console.err.println("Length of pass must be greater then 3 chars!!!")
  else println("Hello, " + userName + "!")
}