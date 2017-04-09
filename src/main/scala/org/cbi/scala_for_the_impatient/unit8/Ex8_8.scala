package org.cbi.scala_for_the_impatient.unit8

object Ex8_8 extends App {

  class Person(val name: String) { override def toString = getClass.getName + "[name=" + name + "]" }

  class SecretAgent(codename: String) extends Person(codename) {
    override val name = "secret"
    override def toString = "secret"
  }
}