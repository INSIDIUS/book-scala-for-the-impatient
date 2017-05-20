package org.cbi.scala_for_the_impatient.unit11.ex3

import org.cbi.scala_for_the_impatient.unit11.ex3.Fraction.{lcm, _}

case class Fraction(n: Int, d: Int) {

  private val num: Int = if (d == 0) 1 else n * d.signum / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * d.signum / gcd(n, d)

  override def toString: String = num + "/" + den

  override def hashCode(): Int = num + 31 * den

  override def equals(that: Any): Boolean =
    that match {
      case that: Fraction => that.isInstanceOf[Fraction] && this.hashCode == that.hashCode
      case _ => false
    }

  def +(that: Fraction): Fraction = {
    val l = lcm(this.den, that.den)
    Fraction(evalNum(this, l) + evalNum(that, l), l)
  }

  def -(that: Fraction): Fraction = {
    val l = lcm(this.den, that.den)
    Fraction(evalNum(this, l) - evalNum(that, l), l)
  }

  def *(that: Fraction): Fraction = Fraction(num * that.num, den * that.den)

  def /(that: Fraction): Fraction = Fraction(num * that.den, den * that.num)

  def unary_~(): Fraction = Fraction(den, num)
}

object Fraction {
  def apply(n: Int, d: Int): Fraction = new Fraction(n, d)

  def gcd(a: Int, b: Int): Int = if (b == 0) a.abs else gcd(b, a % b)

  def lcm(a: Int, b: Int): Int = (a * b).abs / gcd(a, b)

  private def evalNum(f: Fraction, lcm: Int) = f.num * lcm / f.den
}