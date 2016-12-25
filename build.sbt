name := "Ssgd"

version := "0.2.0"

scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.10.6", "2.11.8")

artifactName := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
  artifact.name + "-" + module.revision + "." + artifact.extension
}

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.0"  //% "provided"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.0"  //% "provided"

libraryDependencies  ++= Seq(
  "com.nativelibs4java" %% "scalaxy-loops" % "[0.3.4,)",
  "org.scalanlp" %% "breeze" % "[0.11.2,)",
  "org.scalanlp" %% "breeze-natives" % "[0.11.2,)"
)

resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
