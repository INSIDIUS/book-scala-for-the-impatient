package org.cbi.scala_for_the_impatient

import java.io.File

import scala.io.Source

package object unit9 {
  def applyOnFile(temp: File, f: (Source) => Any) = {
    val source = Source.fromFile(temp)
    val result = f(source)
    source.close()
    result
  }

  def applyOnSource(source: Source, f: (Source) => Any) = {
    val result = f(source)
    source.close()
    result
  }
}