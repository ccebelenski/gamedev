package com.gamedev.test

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.stage.Stage
import scala.collection.JavaConverters._

object TestClass {
  def main(args: Array[String]): Unit = {
    Application.launch(classOf[TestClass],args:_*)
  }
}

class TestClass extends Application {
  @throws[Exception]
  override def start(stage: Stage): Unit = {
    val root = new Group
    val scene = new Scene(root, 600, 400)
    stage.setScene(scene)
    stage.show()
  }
}