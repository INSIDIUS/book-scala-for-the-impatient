package org.cbi.scala_for_the_impatient.unit11.ex4

case class Money(private val c: Long) {

  val dollars: Long = c / 100
  val cents: Long = if (dollars == 0) c % 100 else c.abs % 100

  override def hashCode(): Int = c.hashCode()
  override def equals(obj: Any): Boolean = obj.isInstanceOf[Money] && obj.asInstanceOf[Money].c == c
  override def toString: String = f"$$$dollars.$cents%02d"

  def +(that: Money): Money = Money(c + that.c)
  def -(that: Money): Money = Money(c - that.c)
  def <(that: Money): Boolean = c < that.c
  def >(that: Money): Boolean = c > that.c
}

object Money {
  def apply(dollars: Long, cents: Long): Money = {
    (dollars, cents) match {
      case (d, c) if d > 0 => new Money(d * 100 + c.abs)
      case (d, c) if d == 0 => new Money(c)
      case (d, c) if d < 0 => new Money(d * 100 - c.abs)
    }
  }
}