package com.gamedev
import javafx.animation.Animation
import javafx.application.Application
import javafx.geometry.Rectangle2D
import javafx.scene.{Group, Scene}
import javafx.scene.image.{Image, ImageView}
import javafx.stage.Stage
import javafx.util.Duration

import com.gamedev.anim.SpriteAnimation
class ShipFX extends Application {
  // TODO This sprite sheet is messed up - will need to create new ones for our assets.
  val IMAGE: Image = new Image("file:resources/spritesheet.png",false)
  val COLUMNS = 3
  val COUNT = 4
  val OFFSET_X = 0
  val OFFSET_Y = 0
  val WIDTH = 34
  val HEIGHT = 30

  def start(primaryStage: Stage) = {

    primaryStage.setTitle("Scramble Ship")
    val imageView: ImageView = new ImageView(IMAGE)
    imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT))
    imageView.setScaleX(8.0)
    imageView.setScaleY(8.0)

    val animation: Animation = new SpriteAnimation(imageView, Duration.millis(1000),
      COUNT, COLUMNS, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT)

    animation.setCycleCount(Animation.INDEFINITE)
    animation.play()

    primaryStage.setScene(new Scene(new Group(imageView)))
    primaryStage.show()
  }
}


object ShipFX {

  def main(args: Array[String]): Unit = {
    Application.launch(classOf[ShipFX], args: _*)
  }

}