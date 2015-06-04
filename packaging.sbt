val httpPort = 8888
javaOptions in Universal ++= Seq(
  s"-Dhttp.port=$httpPort"
)

// docker settings
dockerExposedPorts += httpPort

// server settings
import com.typesafe.sbt.packager.archetypes.ServerLoader
serverLoading in Debian := ServerLoader.Systemd
