package org.cbi.scala_for_the_impatient.unit5

import scala.beans.BeanProperty

object Ex5_5 extends App {

  class Student {
    @BeanProperty var name: String = _
    @BeanProperty var id: Long = _
  }

  def ex_5_5() {
    val student = new Student

    student.setName("Yurii")
    student.setId(1)

    println(student.getName)
    println(student.getId)
  }
  ex_5_5()
}

