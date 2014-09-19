
scalaVersion := "2.11.2"

scalaSource in Compile <<= baseDirectory(_ / "src")

javaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test")

javaSource in Test <<= baseDirectory(_ / "test")

resourceDirectory in Compile <<= baseDirectory(_ / "resources")

resourceDirectory in Test <<= baseDirectory(_ / "test-resources")

libraryDependencies ++= Seq(
      "com.miglayout" % "miglayout-core" % "4.2",
      "com.miglayout" % "miglayout-swing" % "4.2"
)

resolvers += "Local Maven Repository" at file(Path.userHome.absolutePath+"/.m2/repository").toURL.toString

