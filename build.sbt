name := "ticket-system"

scalaVersion in ThisBuild := "2.10.4"

scalacOptions ++= Seq("-feature")

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" % "webjars-play_2.10" % "2.3.0-3",
  "org.webjars" % "bootstrap" % "3.1.1",
  "org.webjars" % "html5shiv" % "3.7.0",
  "org.webjars" % "respond" % "1.4.2",
  "com.typesafe.play" %% "play-slick" % "0.6.0.1",
  "com.typesafe.slick" %% "slick-extensions" % "2.0.0",
  "mysql" % "mysql-connector-java" % "5.1.31",
  "org.xerial" % "sqlite-jdbc" % "3.7.2"
)

play.Project.playScalaSettings
