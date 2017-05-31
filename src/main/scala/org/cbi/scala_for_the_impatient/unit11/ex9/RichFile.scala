package org.cbi.scala_for_the_impatient.unit11.ex9

object RichFile {

  private val pathPattern = """^(.*)[/|\\](.*)\.(.*)$""".r

  def unapplySeq(fullpath: String): Option[Seq[String]] =
    fullpath match {
      case pathPattern(path, filename, ext) => Some(Seq(path, filename, ext))
      case p => println(s"Can't parse it: $p"); None
    }
}