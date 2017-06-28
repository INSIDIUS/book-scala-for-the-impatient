package org.cbi.scala_for_the_impatient.unit13.ex3

import scala.collection.mutable

object RemoveZeroElementsEx {
  def removeZeroElements(list: mutable.LinkedList[Int]): Unit = {

    var cur = list

    while (cur != Nil && cur.next != Nil) {
      if (cur.next.elem == 0) cur.next = getNonZero(cur.next)
      cur = cur.next
    }
  }

  def getNonZero(list: mutable.LinkedList[Int]): mutable.LinkedList[Int] = {
    if (list == Nil) mutable.LinkedList.empty[Int]
    else if (list.elem != 0) list
    else getNonZero(list.next)
  }
}