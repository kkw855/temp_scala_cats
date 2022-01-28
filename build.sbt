ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .settings(
    name := "temp_scala_cats",
    idePackagePrefix := Some("com.endsoul")
  )

addCompilerPlugin(
  "org.typelevel" %% "kind-projector" % "0.11.3" cross CrossVersion.full
)

libraryDependencies += "org.typelevel" %% "cats-core" % "2.1.1" withSources () withJavadoc ()
libraryDependencies += "org.typelevel" %% "cats-laws" % "2.1.1" withSources () withJavadoc ()
libraryDependencies += "org.typelevel" %% "discipline-core" % "1.0.0" withSources () withJavadoc ()
libraryDependencies += "org.typelevel" %% "discipline-scalatest" % "2.1.1" withSources () withJavadoc ()
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2" withJavadoc ()
