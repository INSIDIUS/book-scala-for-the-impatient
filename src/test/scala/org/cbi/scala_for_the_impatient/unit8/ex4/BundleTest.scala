package org.cbi.scala_for_the_impatient.unit8.ex4

import org.specs2.mutable.Specification

class BundleTest extends Specification {

  val booze = Bundle.apply
    .add(SimpleItem(15, "cider"))
    .add(SimpleItem(15, "cider"))
    .add(SimpleItem(15, "cider"))
    .add(SimpleItem(15, "cider"))
    .add(SimpleItem(15, "beermix"))
    .add(SimpleItem(15, "beermix"))

  val snack = Bundle.apply
    .add(SimpleItem(24, "chips"))
    .add(SimpleItem(30, "nuts"))

  val all = Bundle.apply
    .add(booze)
    .add(snack)

  "U8 Ex4 BundleTest" should {
    "price is equals" in { all.price mustEqual 144 }
    "description is not empty" in { all.description.isEmpty mustEqual false }
  }
}