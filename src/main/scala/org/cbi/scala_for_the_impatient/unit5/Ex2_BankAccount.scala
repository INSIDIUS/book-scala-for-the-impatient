package org.cbi.scala_for_the_impatient.unit5

class Ex2_BankAccount() {

  private var bal = 0

  def deposit(amount: Int) { if (amount > 0) bal += amount }
  def withdraw(amount: Int) { if (amount > 0) bal -= amount }
  def balance = bal
}