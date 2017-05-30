package org.cbi.scala_for_the_impatient.unit11.ex7

case class BitSequence() {
  private var bitSet: Long = 0L

  override def toString: String = s"BitSequence[${bitSet.toBinaryString}]"

  private def checkBorders(index: Byte): Unit =
    if (index < 0 || index > 63) throw new IllegalArgumentException(s"index must be between 0 and 63, actual: $index")

  def apply(index: Byte): Boolean = {
    checkBorders(index)
    ((bitSet & (1 << index)) >> index) == 1
  }

  def update(index: Byte, value: Boolean): Unit = {
    checkBorders(index)
    if (value) bitSet |= (1 << index)
    else bitSet &= ~(1 << index)
  }
}