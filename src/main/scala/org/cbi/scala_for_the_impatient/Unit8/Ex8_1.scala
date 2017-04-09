package org.cbi.scala_for_the_impatient.Unit8

object Ex8_1 extends App {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }


  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var bankBalance = 0
    override def deposit(amount: Double): Double = { super.withdraw(1); bankBalance += 1; super.deposit(amount); }
    override def withdraw(amount: Double): Double = { bankBalance += 1; super.withdraw(amount + 1) }
  }

  val account = new CheckingAccount(10)
  println(account.deposit(2))
  println(account.withdraw(2))
}