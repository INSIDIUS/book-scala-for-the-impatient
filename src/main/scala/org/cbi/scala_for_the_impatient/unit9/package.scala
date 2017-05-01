package org.cbi.scala_for_the_impatient

import java.io.File

import scala.io.Source

package object unit9 {

  def applyOnUrl(url: String, f: (Source) => Any) = {
    lazy val source = Source.fromURL(url)
    applyOnSource(source, f)
  }

  def applyOnFile(file: File, f: (Source) => Any) = {
    lazy val source = Source.fromFile(file)
    applyOnSource(source, f)
  }

  def applyOnSource(source: Source, f: (Source) => Any) = {
    try f(source) finally source.close()
  }
}