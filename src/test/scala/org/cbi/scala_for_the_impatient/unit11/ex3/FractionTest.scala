package org.cbi.scala_for_the_impatient.unit11.ex3

import org.cbi.scala_for_the_impatient.unit11.ex3.Fraction._
import org.specs2.mutable.Specification

object FractionTest extends Specification {

  "U11 Ex3 FractionTest" should {
    "+  gcd works correctly" in { gcd(30, 20) === 10 }
    "+  lcm works correctly" in { lcm(30, 20) === 60 }
    "+  normalize works correctly" in { Fraction(15, -6) === Fraction(-5, 2) }

    "+  toString works correctly" in { Fraction(4, 6).toString === "2/3" }

    "+  + works correctly" in { Fraction(5, 8) + Fraction(1, 12) === Fraction(17, 24) }
    "+  - works correctly" in { Fraction(3, 10) - Fraction(1, 6) === Fraction(2, 15) }
    "+  * works correctly" in { Fraction(3, 10) * Fraction(1, 6) === Fraction(1, 20) }
    "+  / works correctly" in { Fraction(3, 7) / Fraction(4, 5) === Fraction(15, 28) }
    "+  ~ works correctly" in { ~Fraction(5, 7) === Fraction(7, 5) }
  }
}