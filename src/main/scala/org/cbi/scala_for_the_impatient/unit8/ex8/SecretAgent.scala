package org.cbi.scala_for_the_impatient.unit8.ex8

case class SecretAgent(codename: String) extends Person(codename) {
  override val name = "secret"
  override def toString = "secret"
}