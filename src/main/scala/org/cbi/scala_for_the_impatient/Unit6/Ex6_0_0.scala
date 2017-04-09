package org.cbi.scala_for_the_impatient.Unit6

object Ex6_0_0 extends App {

  class Account private (val id: Int, initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) { balance += amount }
  }

  object Account {
    private var lastNumber = 0
    private def newUniqueNumber() = { lastNumber += 1; lastNumber }
    def apply(initialBalance: Double) = new Account(newUniqueNumber(), initialBalance)
  }

  def ex_6_0() {
    val acct = Account(1000.0)
  }
  ex_6_0()
}