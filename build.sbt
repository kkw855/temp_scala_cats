ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

lazy val root = (project in file("."))
  .settings(
    name := "temp_scala_cats",
    idePackagePrefix := Some("com.endsoul")
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "2.3.0" withSources() withJavadoc()
