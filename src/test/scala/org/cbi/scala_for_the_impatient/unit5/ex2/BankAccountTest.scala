package org.cbi.scala_for_the_impatient.unit5.ex2

import org.specs2.mutable.Specification

object BankAccountTest extends Specification {

  "U5 Ex2 BankAccountTest" should {
    "deposit positive value" in { val acc = new BankAccount; acc.deposit(5); acc.balance mustEqual 5 }
    "withdraw positive value" in { val acc = new BankAccount; acc.withdraw(2); acc.balance mustEqual -2 }
    "not deposit negative value" in { val acc = new BankAccount; acc.deposit(-2); acc.balance mustEqual 0 }
    "not withdraw negative value" in { val acc = new BankAccount; acc.withdraw(-3); acc.balance mustEqual 0 }
  }
}