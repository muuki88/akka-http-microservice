val httpPort = 8888
javaOptions in Universal ++= Seq(
  s"-Dhttp.port=$httpPort"
)

// docker settings
dockerExposedPorts += httpPort
