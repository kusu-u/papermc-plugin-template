plugins {
    java
    id("xyz.jpenilla.run-paper") version "3.1.0"
    id("com.gradleup.shadow") version "9.6.1"
}

group = "com.example.ExamplePlugin"
version = "1.0.0"

java.toolchain.languageVersion = JavaLanguageVersion.of(25)

repositories {
    maven {
        name = "papermc"
        url = uri("https://repo.papermc.io/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:26.2.build.124-stable")

    implementation("dev.jorel:commandapi-paper-shade:12.0.0")
}

tasks.jar {
    enabled = false
}

tasks.assemble {
    dependsOn(tasks.shadowJar)
}

tasks.runServer {
    minecraftVersion("26.2")
}

tasks.processResources {
    filesMatching("plugin.yml") {
        expand(
            "NAME" to rootProject.name,
            "VERSION" to version,
            "PACKAGE" to project.group
        )
    }
}