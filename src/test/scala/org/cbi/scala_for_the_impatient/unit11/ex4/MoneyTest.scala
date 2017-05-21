package org.cbi.scala_for_the_impatient.unit11.ex4

import org.specs2.mutable.Specification

object MoneyTest extends Specification {

  "U11 Ex4 MoneyTest" should {

    "+  evaluate dollars works correctly" in { Money(1, 50).dollars === 1 }
    "+  evaluate cents works correctly 1" in { Money(1, 50).cents === 50 }
    "+  evaluate cents works correctly 2" in { Money(1, -50).cents === 50 }
    "+  evaluate cents works correctly 3" in { Money(-1, -50).cents === 50 }
    "+  evaluate cents works correctly 4" in { Money(0, -50).cents === -50 }
    "+  evaluate cents works correctly 5" in { Money(0, 150).cents === 50 }

    "+  + works correctly 1" in { Money(0, 50) + Money(0, 80) === Money(1, 30) }
    "+  + works correctly 2" in { Money(0, -50) + Money(0, 80) === Money(0, 30) }

    "+  + works correctly 3" in { Money(1, 50) + Money(0, 80) === Money(2, 30) }
    "+  + works correctly 4" in { Money(1, -50) + Money(0, 80) === Money(2, 30) }
    "+  + works correctly 5" in { Money(-1, 50) + Money(0, 80) === Money(0, -70) }
    "+  + works correctly 6" in { Money(-1, -50) + Money(0, 80) === Money(0, -70) }

    "+  + works correctly 7" in { Money(1, 50) + Money(0, -80) === Money(0, 70) }

    "+  + works correctly 8" in { Money(2, 50) + Money(1, -80) === Money(4, 30) }
    "+  + works correctly 9" in { Money(2, 50) + Money(-9, 80) === Money(-7, 30) }
    "+  + works correctly 10" in { Money(2, 50) + Money(-9, -80) === Money(-7, 30) }

    "+  + works correctly 11" in { Money(-18, 50) + Money(9, 80) === Money(-8, 70) }
    "+  + works correctly 12" in { Money(18, 50) + Money(-18, 80) === Money(0, -30) }
    "+  + works correctly 13" in { Money(-18, 50) + Money(-18, 80) === Money(-37, 30) }


    "+  - works correctly 1" in { Money(0, 50) - Money(0, 80) === Money(0, -30) }
    "+  - works correctly 2" in { Money(0, -50) - Money(0, 80) === Money(-1, 30) }

    "+  - works correctly 3" in { Money(1, 50) - Money(0, 80) === Money(0, 70) }
    "+  - works correctly 4" in { Money(1, -50) - Money(0, 80) === Money(0, 70) }
    "+  - works correctly 5" in { Money(-1, 50) - Money(0, 80) === Money(-2, 30) }
    "+  - works correctly 6" in { Money(-1, -50) - Money(0, 80) === Money(-2, 30) }

    "+  - works correctly 7" in { Money(1, 50) - Money(0, -80) === Money(2, 30) }

    "+  - works correctly 8" in { Money(2, 50) - Money(1, -80) === Money(0, 70) }
    "+  - works correctly 9" in { Money(2, 50) - Money(-9, 80) === Money(12, 30) }
    "+  - works correctly 10" in { Money(2, 50) - Money(-9, -80) === Money(12, 30) }

    "+  - works correctly 11" in { Money(-18, 50) - Money(9, 80) === Money(-28, 30) }
    "+  - works correctly 12" in { Money(18, 50) - Money(-18, 80) === Money(37, 30) }
    "+  - works correctly 13" in { Money(-18, 50) - Money(-18, 80) === Money(0, 30) }

    "+  < works correctly" in { (Money(-18, 50) < Money(0, 30)) === true }
    "+  > works correctly" in { (Money(18, 50) > Money(0, -30)) === true }
    "+  == works correctly 1" in { (Money(18, 50) == Money(18, 50)) === true }
    "+  == works correctly 2" in { (Money(-18, 50) == Money(-18, -50)) === true }


    "+  toString works correctly 1" in { Money(1, 50).toString === "$1.50" }
    "+  toString works correctly 2" in { Money(0, 50).toString === "$0.50" }
    "+  toString works correctly 3" in { Money(0, 5).toString === "$0.05" }
    "+  toString works correctly 4" in { Money(-1, 50).toString === "$-1.50" }
    "+  toString works correctly 5" in { Money(-1, 5).toString === "$-1.05" }
  }
}
