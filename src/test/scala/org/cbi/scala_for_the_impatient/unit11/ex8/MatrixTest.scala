package org.cbi.scala_for_the_impatient.unit11.ex8

import org.specs2.mutable.Specification

class MatrixTest extends Specification {

  val matrixA = Matrix(2, 2)
  matrixA(0, 0) = 1; matrixA(0, 1) = 0
  matrixA(1, 0) = 1; matrixA(1, 1) = 0

  val matrixB = Matrix(2, 2)
  matrixB(0, 0) = 0; matrixB(0, 1) = 1
  matrixB(1, 0) = 0; matrixB(1, 1) = 1


  val matrixSum = Matrix(2, 2)
  matrixSum(0, 0) = 1; matrixSum(0, 1) = 1
  matrixSum(1, 0) = 1; matrixSum(1, 1) = 1

  val matrixMulTwo = Matrix(2, 2)
  matrixMulTwo(0, 0) = 2; matrixMulTwo(0, 1) = 0
  matrixMulTwo(1, 0) = 2; matrixMulTwo(1, 1) = 0

  val matrixMulAB = Matrix(2, 2)
  matrixMulAB(0, 0) = 1; matrixMulAB(0, 1) = 0
  matrixMulAB(1, 0) = 1; matrixMulAB(1, 1) = 0

  println(s"\nmatrix A:\n$matrixA")
  println(s"\nmatrix B:\n$matrixB")

  "U11 Ex8 MatrixTest" should {
    "+ works correctly" in {

      val sum = matrixA + matrixB
      println(s"\nsum:\n$sum")

      sum.equals(matrixSum) === true
    }

    "* on scalar works correctly" in {

      val mul2 = matrixA * 2
      println(s"\nmatrix A * 2:\n$mul2")

      mul2 === matrixMulTwo
    }

    "* works correctly" in {

      val mulAB = matrixA * matrixB
      println(s"\nmatrix A * B:\n$mulAB")

      mulAB === matrixMulAB
    }
  }
}