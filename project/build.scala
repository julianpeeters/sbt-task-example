import sbt._
import Keys._

object HelloBuild extends Build {
  val hwsettings = Defaults.defaultSettings ++ Seq(
    organization := "com.julianpeeters",
    name         := "sbt-task-example",
    version      := "1.0-SNAPSHOT",
    scalaVersion := "2.9.0-1"
  )

  val hello = TaskKey[Unit]("hello", "Prints 'Hello World'")

  val helloTask = hello := {
    println("Hello World")
  }

  lazy val project = Project (
    "project",
    file ("."),
    settings = hwsettings ++ Seq(helloTask)
  )
}
