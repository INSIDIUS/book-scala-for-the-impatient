package org.cbi.scala_for_the_impatient.unit10.ex1

import java.awt.geom.RectangularShape

trait RectangleLike {
  this: RectangularShape =>

  def getX: Double
  def getY: Double
  def getWidth: Double
  def getHeight: Double

  def translate(dx: Int, dy: Int): Unit = {

    var x = getX
    var y = getY
    var width = getWidth
    var height = getHeight

    var oldv = x
    var newv = oldv + dx
    if (dx < 0) {
      if (newv > oldv) {
        if (width >= 0) width += newv - Integer.MIN_VALUE
        newv = Integer.MIN_VALUE
      }
    } else {
      if (newv < oldv) {
        if (width >= 0) {
          width += newv - Integer.MAX_VALUE
          if (width < 0) width = Integer.MAX_VALUE
        }
        newv = Integer.MAX_VALUE
      }
    }

    x = newv
    oldv = y
    newv = oldv + dy

    if (dy < 0) {
      if (newv > oldv) {
        if (height >= 0) height += newv - Integer.MIN_VALUE
        newv = Integer.MIN_VALUE
      }
    } else {
      if (newv < oldv) {
        if (height >= 0) {
          height += newv - Integer.MAX_VALUE
          if (height < 0) height = Integer.MAX_VALUE
        }
        newv = Integer.MAX_VALUE
      }
    }

    y = newv

    setFrame(x, y, width, height)
  }

  def grow(h: Int, v: Int): Unit = {

    var x0 = getX
    var y0 = getY
    var x1 = getWidth
    var y1 = getHeight

    x1 += x0
    y1 += y0
    x0 -= h
    y0 -= v
    x1 += h
    y1 += v
    if (x1 < x0) {
      x1 -= x0
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE
    }
    else {
      if (x0 < Integer.MIN_VALUE) x0 = Integer.MIN_VALUE
      else if (x0 > Integer.MAX_VALUE) x0 = Integer.MAX_VALUE
      x1 -= x0
      if (x1 < Integer.MIN_VALUE) x1 = Integer.MIN_VALUE
      else if (x1 > Integer.MAX_VALUE) x1 = Integer.MAX_VALUE
    }
    if (y1 < y0) {
      y1 -= y0
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE
    }
    else {
      if (y0 < Integer.MIN_VALUE) y0 = Integer.MIN_VALUE
      else if (y0 > Integer.MAX_VALUE) y0 = Integer.MAX_VALUE
      y1 -= y0
      if (y1 < Integer.MIN_VALUE) y1 = Integer.MIN_VALUE
      else if (y1 > Integer.MAX_VALUE) y1 = Integer.MAX_VALUE
    }

    setFrame(x0.toInt, y0.toInt, x1.toInt, y1.toInt)
  }
}