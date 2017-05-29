package org.cbi.scala_for_the_impatient.unit11.ex6

case class AsciiArt(private val figure: Array[String]) {

  override def toString: String = figure.mkString("\n")

  def +(that: AsciiArt) = AsciiArt(figure.zip(that.figure).map(f => f._1 + " " + f._2))
  def /(that: AsciiArt) = AsciiArt(figure ++ that.figure)
}

object AsciiArt {
  val cat =   Array(""" /\_/\ """,
                    """( ' ' )""",
                    """(  -  )""",
                    """ | | | """,
                    """(__|__)""")

  val hello = Array("""   -----  """,
                    """ / Hello \""",
                    """<  Scala |""",
                    """ \ Coder /""",
                    """   -----  """)
}