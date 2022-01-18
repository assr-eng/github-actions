name := "github-actions"
version := "1.0"
organization := "assr-eng"
scalaVersion := "2.9.2"
sbtVersion := "0.13"

libraryDependencies += "org.scala-lang" % "scala-swing" % "2.9.2"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "com.github.benhutchison" % "scalaswingcontrib" % "1.3"

libraryDependencies += "junit" % "junit" % "4.8.1" % "test"

// Initial commands to be run in your REPL.  I like to import various project-specific things here.

initialCommands := """
    import myproject.stuff._;
    import myproject.other.stuff._;
  """