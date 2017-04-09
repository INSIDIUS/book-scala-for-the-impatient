package org.cbi.scala_for_the_impatient.unit8

object Ex8_2 extends App {

  class BankAccount(initialBalance: Double) {
    protected var balance = initialBalance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var freeOps = 3
    def earnMonthlyInterest() { balance *= 1.1; freeOps = 3 }
    override def deposit(amount: Double): Double = { withdrawIfNeed(); super.deposit(amount) }
    override def withdraw(amount: Double): Double = { withdrawIfNeed(); super.withdraw(amount) }
    private def withdrawIfNeed() { freeOps -= 1; if (freeOps < 0) balance -= 1 }
  }

  val acc = new SavingAccount(10)
  acc.deposit(10)
  acc.withdraw(1)
  acc.withdraw(1)
  acc.withdraw(1)
  acc.withdraw(1)
  acc.earnMonthlyInterest()
  println(acc.withdraw(1))
}