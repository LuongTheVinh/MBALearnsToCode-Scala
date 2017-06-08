lazy val `ScalaFuncProg-project` =
  (project in file("."))
    .settings(
      name := "ScalaFuncProg-project",

      organization := "MBALearnsToCode",

      version := "1.0.2",

      scalaVersion := "2.12.2",

      resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases",

      libraryDependencies ++= Seq(
        // ScalaCheck
        "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",

        // Scalactic
        "org.scalactic" %% "scalactic" % "3.0.1",

        // ScalaTest
        "org.scalatest" %% "scalatest" % "3.0.1" % "test",

        // SuperSafe
        "com.artima.supersafe" %% "supersafe" % "1.1.2"
      ),

      initialCommands := "import pkg._"
    )
