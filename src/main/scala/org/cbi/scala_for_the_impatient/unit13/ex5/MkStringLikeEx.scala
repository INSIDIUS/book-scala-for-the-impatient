package org.cbi.scala_for_the_impatient.unit13.ex5

object MkStringLikeEx {
  def myMkString(t: Traversable[Any], start: String = "", sep: String = "", end: String = "") =
    start + t.reduceLeft(_ + sep + _) + end
}
