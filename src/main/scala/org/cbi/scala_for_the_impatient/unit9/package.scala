package org.cbi.scala_for_the_impatient

import java.io.File

import scala.io.Source

package object unit9 {

  def applyOnFile(temp: File, f: (Source) => Any) = {
    lazy val source = Source.fromFile(temp)
    applyOnSource(source, f)
  }

  def applyOnSource(source: Source, f: (Source) => Any) = {
    try f(source) finally source.close()
  }
}