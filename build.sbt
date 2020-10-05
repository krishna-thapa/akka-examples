name := "akka-examples"
version := "0.1"
description := "Akka example projects from light-bend courses"

organization in ThisBuild := "com.krishna"
scalaVersion in ThisBuild := "2.13.3"

// PROJECTS
lazy val global = project
  .in(file("."))
  .settings(settings)
  .aggregate(common, `akka-streams`)

// Common project that has common codes
lazy val common = project
  .settings(
    name := "common",
    settings,
    libraryDependencies ++= commonDependencies
  )

// Project for the exercises using akka stream
lazy val `akka-streams` = project
  .settings(
    name := "akka-streams",
    settings,
    libraryDependencies ++= akkaStreamDependencies
  )

// All the dependencies used in the project
lazy val dependencies =
  new {
    val slf4j      = "org.slf4j"          % "slf4j-simple" % "1.7.5"
    val akka       = "com.typesafe.akka" %% "akka-actor"   % "2.6.5"
    val akkaStream = "com.typesafe.akka" %% "akka-stream"  % "2.6.9"
  }

lazy val commonDependencies = Seq(
  dependencies.slf4j,
  dependencies.akkaStream
)

lazy val akkaStreamDependencies = Seq(
  dependencies.akka,
  dependencies.akkaStream
)

// SETTINGS
lazy val settings = Seq(
  scalacOptions ++= compilerOptions
)

lazy val compilerOptions = Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-deprecation",
  "-encoding",
  "utf8"
)
