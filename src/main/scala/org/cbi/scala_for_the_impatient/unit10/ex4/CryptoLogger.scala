package org.cbi.scala_for_the_impatient.unit10.ex4

case class CryptoLogger(key: Int = 3, powerOfAlphabet: Int = 26, firstUpperChar: Char = 'A', firstLowerChar: Char = 'a') {

  def log(message: String) = {
    val encMessage = message.map(encChar).mkString
    println(encMessage)
    encMessage
  }

  private def encChar(c: Char) =
    if (!c.isLetter) c
    else if (c.isUpper) enc(c, firstUpperChar)
    else enc(c, firstLowerChar)

  private def enc(c: Char, firstChar: Char) = {
    val index = c - firstChar + key % powerOfAlphabet
    val cIndex =
      if (key >= 0) {
        if (index < powerOfAlphabet) index else index - powerOfAlphabet
      } else {
        if (index >= 0) index else powerOfAlphabet + index
      }

    (firstChar + cIndex).toChar
  }
}