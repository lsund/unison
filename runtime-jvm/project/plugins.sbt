addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-M15")
addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.5.0")
addSbtPlugin("com.typesafe.sbt" % "sbt-osgi" % "0.9.1")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.4")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.1")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.1.14")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")
addSbtPlugin("org.tpolecat" % "tut-plugin" % "0.4.8")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.21")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.15")
scalacOptions ++= Seq(
  "-feature",
  "-deprecation"
)
