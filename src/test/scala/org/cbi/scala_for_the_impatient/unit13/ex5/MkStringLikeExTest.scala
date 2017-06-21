package org.cbi.scala_for_the_impatient.unit13.ex5

import org.cbi.scala_for_the_impatient.unit13.ex5.MkStringLikeEx.myMkString
import org.specs2.mutable.Specification

class MkStringLikeExTest extends Specification {

  "U13 Ex5 MkStringLikeExTest" should {
    "myMkString works correctly" in {

      val array = Array(1, 2, 3)
      val expected = "123"

      myMkString(array) === "123"
      myMkString(array, sep = ",") === "1,2,3"
      myMkString(array, start = "[", sep = ",", end = "]") === "[1,2,3]"
    }
  }
}