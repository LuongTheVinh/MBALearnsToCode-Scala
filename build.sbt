lazy val ScalaFuncProg_project = (project in file(".")).
  settings(

    name := "ScalaFuncProg-project",

    organization := "MBALearnsToCode",

    version := "1.0.2",

    scalaVersion := "2.11.7"

    // libraryDependencies ++= Seq(
    //   "org.scalatest" %% "scalatest" % "2.2.1" % "test",
    //   "org.scalacheck" %% "scalacheck" % "1.11.5" % "test"),

    // initialCommands := "import pkg._"
  )
