package org.cbi.scala_for_the_impatient.unit5

import org.specs2.mutable.Specification

object Ex2_BankAccountTest extends Specification {

  "U5 Ex2_BankAccountTest" should {
    "deposit positive value" in { val acc = new Ex2_BankAccount; acc.deposit(5); acc.balance mustEqual 5 }
    "withdraw positive value" in { val acc = new Ex2_BankAccount; acc.withdraw(2); acc.balance mustEqual -2 }
    "not deposit negative value" in { val acc = new Ex2_BankAccount; acc.deposit(-2); acc.balance mustEqual 0 }
    "not withdraw negative value" in { val acc = new Ex2_BankAccount; acc.withdraw(-3); acc.balance mustEqual 0 }
  }
}