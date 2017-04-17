package org.cbi.scala_for_the_impatient.unit5.ex5

import scala.beans.BeanProperty

class Student(@BeanProperty var id: Long = 1, @BeanProperty var name: String = "John Doe") {}