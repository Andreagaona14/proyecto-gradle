plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "Gradle1"
include("src:main:resource2")
findProject(":src:main:resource2")?.name = "resource2"
