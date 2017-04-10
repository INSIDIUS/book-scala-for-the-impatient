package org.cbi.scala_for_the_impatient.unit2

object Ex2_10 {

  def mypow(x: Double, n: Int): Double = {
    if (n > 0 && n % 2 == 0) math.pow(mypow(x, n / 2), 2)
    else if (n > 0 && n % 2 == 1) x * mypow(x, n - 1)
    else if (n == 0) 1
    else if (n < 0) 1 / mypow(x, -n)
    else 1
  }
}