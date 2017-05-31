package org.cbi.scala_for_the_impatient.unit11.ex9

case class RichFile(path: String, filename: String, ext: String)

object RichFile {

  private val pathPattern = """^(.*)[/|\\](.*)\.(.*)$""".r

  def unapply(fullpath: String): Option[RichFile] =
    fullpath match {
      case pathPattern(p, f, e) => Some(RichFile(p, f, e))
      case p => println(s"Can't parse it: $p"); None
    }
}