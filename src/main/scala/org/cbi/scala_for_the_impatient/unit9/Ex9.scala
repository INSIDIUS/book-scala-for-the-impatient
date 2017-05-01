package org.cbi.scala_for_the_impatient.unit9

import java.net.URI
import java.nio.file.FileVisitResult._
import java.nio.file.attribute.BasicFileAttributes
import java.nio.file.{Files, Path, Paths, SimpleFileVisitor}

object Ex9 {
  private val classNamePattern = "^.*\\.classS".r

  private implicit def makeFileVisitor(f: (Path) => Unit) = new SimpleFileVisitor[Path] {
    override def visitFile(p: Path, attrs: BasicFileAttributes) = {
      f(p)
      CONTINUE
    }
  }

  def countClassFiles(path: String) = {
    var counter = 0
    Files.walkFileTree(Paths.get(URI.create("file:/" + path)), (_: Path) => counter += 1)
    counter
  }
}