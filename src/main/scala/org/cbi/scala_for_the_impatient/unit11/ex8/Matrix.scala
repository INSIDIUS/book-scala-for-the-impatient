package org.cbi.scala_for_the_impatient.unit11.ex8

case class Matrix(rows: Int, cols: Int) {

  def this(rows: Int, cols: Int, matrix: Array[Array[Int]]) {
    this(rows, cols)
    this.columnVectors = matrix
  }

  def this(columnVectors: Array[Array[Int]]) {
    this(columnVectors.length, columnVectors.head.length)
    this.columnVectors = columnVectors
  }

  private var columnVectors = Array.ofDim[Int](rows, cols)


  override def hashCode(): Int = columnVectors.hashCode()
  override def equals(obj: scala.Any): Boolean = obj.isInstanceOf[Matrix] && columnVectors.deep == obj.asInstanceOf[Matrix].columnVectors.deep

  override def toString: String = columnVectors.map(_.mkString(" ")).mkString("\n")

  private def checkBorders(row: Int, col: Int) {
    if (row < 0 || row > this.rows - 1) throw new IllegalArgumentException(s"row must be between 0 and ${this.rows}, actual: $row")
    if (col < 0 || col > this.cols - 1) throw new IllegalArgumentException(s"col must be between 0 and ${this.cols}, actual: $col")
  }

  private def checkIfSumPossible(that: Matrix) {
    if (rows != that.rows) throw new IllegalArgumentException(s"rows must be equals, this: $rows, that: ${that.rows}")
    if (cols != that.cols) throw new IllegalArgumentException(s"cols must be equals, this: $cols, that: ${that.cols}")
  }

  private def checkIfMultiplyPossible(that: Matrix) =
    if (cols != that.rows) throw new IllegalArgumentException(s"cols must be equals with rows, this cols: $cols, that rows: ${that.rows}")

  def apply(row: Int, col: Int) = {
    checkBorders(row, col)
    columnVectors(row)(col)
  }

  def update(row: Int, col: Int, value: Int) {
    checkBorders(row, col)
    columnVectors(row)(col) = value
  }

  def +(that: Matrix) = {
    checkIfSumPossible(that)
    new Matrix(rows, cols, columnVectors.zip(that.columnVectors).map(_.zipped.map(_ + _)))
  }

  def *(that: Int) = {
    new Matrix(rows, cols, columnVectors.map(_.map(_ * that)))
  }

  def *(v: Array[Int]): Array[Int] = {
    val newValues = Array.ofDim[Int](rows)
    var col = 0
    while(col < cols) {
      val n = v(col)
      val column = columnVectors(col)
      var row = 0
      while(row < newValues.length) {
        newValues(row) += column(row) * n
        row += 1
      }
      col += 1
    }
    newValues
  }

  def *(that: Matrix): Matrix = {
    checkIfMultiplyPossible(that)
    new Matrix(that.columnVectors.map(this * _))
  }
}