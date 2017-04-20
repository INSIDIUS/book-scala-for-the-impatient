package org.cbi.scala_for_the_impatient.unit8.ex1

import org.specs2.mutable.Specification

object CheckingAccountTest extends Specification {

  "U8 Ex1 CheckingAccountTest" should {
    "deposit works correctly" in {
      val account = new CheckingAccount(10); val balance = account.deposit(2); balance mustEqual 11
    }

    "withdraw works correctly" in {
      val account = new CheckingAccount(10); val balance = account.withdraw(2); balance mustEqual 7
    }
  }
}