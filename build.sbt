val scala3Version = "3.4.1"
val scalikejdbcVersion      = "4.0.+"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty16036",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
        "org.scalameta" %% "munit" % "0.7.29" % Test,
        "org.scalikejdbc" %% "scalikejdbc"       % scalikejdbcVersion,
        "org.scalikejdbc" %% "scalikejdbc-test"   % scalikejdbcVersion % "test",
        "org.scalikejdbc" %% "scalikejdbc-config"  % scalikejdbcVersion,
        "org.specs2" %% "specs2-core" % "5.2.0" % "test"
        )
  )
