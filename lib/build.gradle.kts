/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.6/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    kotlin("jvm") version "1.7.21"

    // Apply the java-library plugin for API and implementation separation.
    java
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    maven("https://jitpack.io")
}

val mV = "v140"

dependencies {
    compileOnly("com.github.Anuken.Arc:arc-core:$mV")
    //compileOnly("com.github.Anuken.Arc:flabel:$mV")
    compileOnly("com.github.Anuken.Mindustry:core:$mV")
}

tasks.jar{
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    manifest{
        attributes["Main-Class"] = "com.github.smol.kotmindy.KotMindyKt"
    }

    from(*configurations.runtimeClasspath.files.map { if (it.isDirectory()) it else zipTree(it) }.toTypedArray())
}

tasks.register<Copy>("deploy"){
    dependsOn("jar")

    from("build/libs/lib.jar")
    into("..")

    doLast{
        delete("build/libs/lib.jar")
    }
}
