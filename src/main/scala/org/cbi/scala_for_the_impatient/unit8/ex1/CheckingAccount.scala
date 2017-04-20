package org.cbi.scala_for_the_impatient.unit8.ex1

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double) = super.deposit(amount - 1)
  override def withdraw(amount: Double) = super.withdraw(amount + 1)
}