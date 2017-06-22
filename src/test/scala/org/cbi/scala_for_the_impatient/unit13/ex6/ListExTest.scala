package org.cbi.scala_for_the_impatient.unit13.ex6

import org.cbi.scala_for_the_impatient.unit13.ex6.ListEx._
import org.specs2.mutable.Specification

class ListExTest extends Specification {

  val list = List(1, 2, 3, 4, 5)
  val reversedlist = List(5, 4, 3, 2, 1)

  "U13 Ex6 ListExTest" should {

    "fun1 works correctly" in { fun1(list) === list }

    "fun1reverse works correctly" in { fun1reverse(list) === reversedlist }

    "fun2 works correctly" in { fun2(list) === list }

    "fun2reverse works correctly" in { fun2reverse(list) === reversedlist }
  }
}