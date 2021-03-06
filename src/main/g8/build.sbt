// Turn this project into a Scala.js project by importing these settings
scalaJSSettings

name := "$name$"

version := "$version$"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
    "org.scala-lang.modules.scalajs" %% "scalajs-jquery" % "0.4",
    "org.scala-lang.modules.scalajs" %% "scalajs-dom" % "0.4",
    "org.scala-lang.modules.scalajs" %% "scalajs-jasmine-test-framework" % scalaJSVersion % "test"
)

// Specify additional .js file to be passed to package-js and optimize-js
unmanagedSources in (Compile, ScalaJSKeys.packageJS) +=
    baseDirectory.value / "js" / "startup.js"
