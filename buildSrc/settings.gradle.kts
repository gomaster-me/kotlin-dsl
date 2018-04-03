
fun RepositoryHandler.kotlinDev() =
    maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")

pluginManagement {
    repositories {
        kotlinDev()
        gradlePluginPortal()
    }
}

gradle.rootProject {
    dependencies {
        repositories {
            kotlinDev()
        }
    }
}
