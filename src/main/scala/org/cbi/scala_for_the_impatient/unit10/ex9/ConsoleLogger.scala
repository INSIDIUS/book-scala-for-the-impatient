package org.cbi.scala_for_the_impatient.unit10.ex9

trait ConsoleLogger extends Logger {
  override def log(msg: String) { println(msg) }
}
