package org.cbi.scala_for_the_impatient.unit8.ex2

import org.cbi.scala_for_the_impatient.unit8.ex1.BankAccount

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {

  private val commission = 1
  private val monthlyInterestRate = 0.1
  private val freeOpsInMonth = 3

  private var freeOpsLeft = freeOpsInMonth

  override def deposit(amount: Double) = { withdrawIfNeed(); super.deposit(amount) }
  override def withdraw(amount: Double) = { withdrawIfNeed(); super.withdraw(amount) }

  def earnMonthlyInterest() = {
    freeOpsLeft = freeOpsInMonth
    val balance = super.withdraw(0)
    super.deposit(balance * monthlyInterestRate)
  }

  private def withdrawIfNeed() { if (freeOpsLeft > 0) freeOpsLeft -= 1 else super.withdraw(commission) }
}