name := "algs4partII-wordnet"

organizationName := "Coursera"

organization := "edu.coursera"

version := "0.1"

scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

resolvers ++= Seq(
  "sonatype releases" at "https://oss.sonatype.org/content/repositories/releases/",
  "sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
  "org.specs2"          %   "specs2_2.10"            % "2.3.10"     % "test"
  ,"junit"              %   "junit"                  % "4.11"       % "test"
  ,"org.scalatest"      %   "scalatest_2.10"         % "1.9.1"      % "test"
)

TaskKey[Unit]("zip") <<= baseDirectory map {
                              bd => {
                                val out = new File(bd + "/wordnet.zip")
                                val sources: Traversable[(File, String)] = Path.allSubpaths(new File(bd + "/src/main/java"))
                                IO.zip(sources, out)
                              }
                            }