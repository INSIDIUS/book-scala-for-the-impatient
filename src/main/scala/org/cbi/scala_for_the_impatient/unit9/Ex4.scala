package org.cbi.scala_for_the_impatient.unit9

import java.io.File

import scala.io.Source

object Ex4 {

  def fileStatistics(source: Source) = {
    val nums = try source.getLines().mkString(" ").split(" ").map(_.toDouble) finally source.close()
    (nums.sum, nums.sum / nums.length, nums.max, nums.min)
  }
}