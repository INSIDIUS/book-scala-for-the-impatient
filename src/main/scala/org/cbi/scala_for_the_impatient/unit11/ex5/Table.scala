package org.cbi.scala_for_the_impatient.unit11.ex5

case class Table(private val html: String = "") {

  private def insertCloseTrIfNeed(html: String) = if (!html.endsWith("/tr")) "</tr>" else ""

  override def toString: String = "<table><tr>" + html + insertCloseTrIfNeed(html) + "</table>"

  def |(string: String) = Table(html + "<td>" + string + "</td>")
  def ||(string: String) = Table(html + insertCloseTrIfNeed(html) + "<tr><td>" + string + "</td>")
}