multi-kotlin-project-config-injection
=====================================

A multi-project build with two Kotlin based projects:

 1. [core](./core) implements the main algorithm to compute the answer to the ultimate question of Life, the Universe and Everything
 2. [cli](./cli) implements the command line interface

Common behavior for all projects, including `KotlinCompile` task configuration is defined in the [root project build script](./build.gradle.kts).

Plugin application and dependency configuration is segregated to each separate subproject.

Run with:

    ./gradlew run

Check all project dependencies with:

    ./gradlew dependencies
