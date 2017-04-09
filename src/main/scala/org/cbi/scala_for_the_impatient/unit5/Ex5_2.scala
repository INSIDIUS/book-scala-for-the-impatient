package org.cbi.scala_for_the_impatient.unit5

object Ex5_2 extends App {

  class BankAccount {
    private var bal = 0
    def deposit(amount: Int) { if (amount > 0) bal += amount }
    def withdraw(amount: Int) { if (amount > 0) bal -= amount }
    def balance = bal
  }


  def ex_5_2() {
    val acc = new BankAccount
    acc.deposit(10)
    acc.withdraw(5)
    println(acc.balance)
  }
  ex_5_2()
}

