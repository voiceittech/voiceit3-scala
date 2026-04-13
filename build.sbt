lazy val commonSettings = Seq(
    organization := "io.voiceit",
    version := "3.0.5",
    scalaVersion := "2.13.16",
    crossScalaVersions := Seq("2.13.16", "2.12.20")
)

lazy val root = (project in file("."))
  .settings(
      commonSettings,
      name := "VoiceIt3",
      libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.4.2",
      libraryDependencies += "com.typesafe.play" %% "play-json" % "2.10.6" % "test",
      libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test",
      libraryDependencies += "commons-io" % "commons-io" % "2.21.0" % "test"
  )
