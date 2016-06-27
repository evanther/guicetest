organization := "com.despegar"

name := "guicetest"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "net.codingwell" %% "scala-guice" % "4.0.1"
)

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }
