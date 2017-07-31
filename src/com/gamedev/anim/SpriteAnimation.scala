package com.gamedev.anim

import javafx.animation.{Interpolator, Transition}
import javafx.geometry.Rectangle2D
import javafx.scene.image.ImageView
import javafx.util.Duration

class SpriteAnimation(imageView: ImageView, duration: Duration, count: Int, columns: Int, offsetX: Int, offsetY: Int, width: Int, height: Int) extends Transition {
  setCycleDuration(duration)
  setInterpolator(Interpolator.LINEAR)

  private var lastIndex:Int = 0

  override def interpolate(frac: Double): Unit = {
    val index: Int = Math.min(Math.floor(frac * count).toInt,count-1)
    if(index != lastIndex) {
      val x = (index % columns) * width + offsetX
      val y = (index /columns) * height + offsetY
      imageView.setViewport(new Rectangle2D(x,y,width,height))
      lastIndex = index
    }
  }
}
