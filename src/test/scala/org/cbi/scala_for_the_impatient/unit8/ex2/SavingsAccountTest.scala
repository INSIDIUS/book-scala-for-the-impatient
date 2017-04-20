package org.cbi.scala_for_the_impatient.unit8.ex2

import org.specs2.mutable.Specification

object SavingsAccountTest extends Specification {

  "U8 Ex2 SavingsAccountTest" should {

    "deposit works correctly" in {
      val acc = new SavingsAccount(10)
      acc.deposit(1)
      acc.deposit(2)
      acc.deposit(3)
      acc.deposit(4)
      acc.deposit(5)

      val balance = acc.deposit(6)
      balance mustEqual 28
    }

    "withdraw works correctly" in {
      val acc = new SavingsAccount(100)
      acc.withdraw(1)
      acc.withdraw(2)
      acc.withdraw(3)
      acc.withdraw(4)
      acc.withdraw(5)

      val balance = acc.withdraw(6)
      balance mustEqual 76
    }

    "earnMonthlyInterest works correctly" in {
      val acc = new SavingsAccount(10)
      acc.deposit(1)
      acc.deposit(2)
      acc.deposit(3)
      acc.deposit(4)
      acc.deposit(5)
      acc.deposit(6)

      val balance = acc.earnMonthlyInterest()
      val balanceWithFreeDeposit = acc.deposit(0)

      balance mustEqual 30.8 and (balanceWithFreeDeposit mustEqual 30.8)
    }
  }
}