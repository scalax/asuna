lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core)
lazy val core = project in file("./core")
val codegen = project in file("./codegen")
AsunaSettings.scalaVersionSettings