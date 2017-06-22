package org.cbi.scala_for_the_impatient.unit13.ex6

object ListEx {

  def fun1(lst: List[Int]) = (lst :\ List[Int]()) (_ :: _)

  def fun1reverse(lst: List[Int]) = (lst :\ List[Int]()) ((i, lst) => lst :+ i)

  def fun2(lst: List[Int]) = (List[Int]() /: lst) (_ :+ _)

  def fun2reverse(lst: List[Int]) = (List[Int]() /: lst) ((lst, i) => i +: lst)
}