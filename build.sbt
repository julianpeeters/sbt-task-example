name := "sbt-task-example"

organization := "com.julianpeeters"

version := "0.1.1-SNAPSHOT"

TaskKey[Unit]("hello") := println("hello world!")
