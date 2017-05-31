package org.cbi.scala_for_the_impatient.unit11.ex7

case class BitSequence() {
  private var bitSet: Long = 0L

  override def toString: String = s"BitSequence[${bitSet.toBinaryString}]"

  def checkBorders(index: Int) = require(index > 0 || index < 64, s"index must be between 0 and 64, actual: $index")

  def apply(index: Byte) = {
    checkBorders(index)
    ((bitSet & (1 << index)) >> index) == 1
  }

  def update(index: Byte, value: Boolean) {
    checkBorders(index)
    if (value) bitSet |= (1 << index)
    else bitSet &= ~(1 << index)
  }
}