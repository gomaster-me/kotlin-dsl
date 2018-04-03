rootProject.name = "gradle-kotlin-dsl"

include(
    "provider",
    "tooling-models",
    "tooling-builders",
    "plugins",
    "plugins-experiments",
    "test-fixtures",
    "samples-tests")

fun RepositoryHandler.kotlinDev() =
    maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")

pluginManagement {
    repositories {
        kotlinDev()
        gradlePluginPortal()
    }
}

gradle.rootProject {
    allprojects {
        dependencies {
            repositories {
                kotlinDev()
            }
        }
    }
}
