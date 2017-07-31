package com.gamedev

import javafx.animation.Animation
import javafx.application.Application
import javafx.geometry.Rectangle2D
import javafx.scene.{Group, Scene}
import javafx.scene.image.{Image, ImageView}
import javafx.stage.Stage
import javafx.util.Duration

import com.gamedev.anim.SpriteAnimation

class HorseFX extends Application {

  val IMAGE: Image = new Image("https://upload.wikimedia.org/wikipedia/commons/7/73/The_Horse_in_Motion.jpg")
  val COLUMNS = 4
  val COUNT = 10
  val OFFSET_X = 18
  val OFFSET_Y = 25
  val WIDTH = 374
  val HEIGHT = 243

  def start(primaryStage: Stage) = {

    primaryStage.setTitle("The Horse In Motion")
    val imageView: ImageView = new ImageView(IMAGE)
    imageView.setViewport(new Rectangle2D(OFFSET_X, OFFSET_Y, WIDTH, HEIGHT))

    val animation: Animation = new SpriteAnimation(imageView, Duration.millis(1000),
      COUNT, COLUMNS, OFFSET_X, OFFSET_Y, WIDTH, HEIGHT)

    animation.setCycleCount(Animation.INDEFINITE)
    animation.play()

    primaryStage.setScene(new Scene(new Group(imageView)))
    primaryStage.show()
  }

}

object HorseFX {

  def main(args: Array[String]): Unit = {
    Application.launch(classOf[HorseFX], args: _*)
  }

}