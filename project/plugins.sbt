resolvers += Classpaths.sbtPluginReleases

autoCompilerPlugins := true

addDependencyTreePlugin

libraryDependencies += "commons-io" % "commons-io" % "2.11.0"

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")

addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")

addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.12.0")

addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.0.1")

addSbtPlugin("com.github.sbt" % "sbt-protobuf" % "0.8.0")

resolvers += "RAW Labs GitHub Packages" at "https://maven.pkg.github.com/raw-labs/sbt-module-patcher"

ThisBuild / credentials += Credentials(
  "GitHub Package Registry",
  "maven.pkg.github.com",
  "raw-labs",
  sys.env.getOrElse("GITHUB_TOKEN", "")
)

addSbtPlugin("com.raw-labs" % "sbt-module-patcher" % "0.1.1")