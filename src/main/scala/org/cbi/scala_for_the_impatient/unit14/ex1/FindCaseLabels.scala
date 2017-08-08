package org.cbi.scala_for_the_impatient.unit14.ex1

import java.lang.Double
import java.nio.file.{Files, Path}

import scala.collection.JavaConverters._
import scala.io.Source
import scala.util.matching.Regex

object FindCaseLabels {

  val casePattern = """case [^:]+:""".r
  val fallsPattern = """\/{2}.+alls? thr""".r

  def findMatchCount(path: Path, pattern: Regex): Int = {

    val source = Source.fromFile(path.toFile)
    val count = source.getLines()
      .map(pattern.findFirstIn(_))
      .count(_.isDefined)

    source.close()
    count
  }

  def percentOfUsageFile(path: Path) = (path.getFileName, 1.0 * findMatchCount(path, fallsPattern) / findMatchCount(path, casePattern))

  def percentOfUsageDir(dir: Path) = {

    val pairs = Files.walk(dir).iterator().asScala

      .filter(Files.isRegularFile(_))
      .map(path => percentOfUsageFile(path))
      .filter(p => Double.isFinite(p._2))
      .toList

    pairs
      .sortBy(_._2)
      .foreach(p => println(s"${p._1} => ${p._2}"))

    val sum = pairs.map(p => p._2).sum
    val count = pairs.length

    println("==========================")
    println(sum)
    println(count)

    val result = (sum / count) * 100

    println(f"Falls through usage $result%.3f%%")

    result
  }
}