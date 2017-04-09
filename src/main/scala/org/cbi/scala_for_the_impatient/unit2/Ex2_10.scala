package org.cbi.scala_for_the_impatient.unit2

object Ex2_10 {

  def ex_2_10_mypow(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) math.pow(ex_2_10_mypow(x, n / 2), 2)
    else if (n > 0 && n % 2 == 1) x * ex_2_10_mypow(x, n - 1)
    else if (n == 0) 1
    else if (n < 0) 1 / ex_2_10_mypow(x, -n)
    else 1
  }
}