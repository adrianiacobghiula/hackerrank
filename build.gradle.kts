plugins {
    java
    id("io.freefair.lombok") version "8.6"
}

group = "aig"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.2")

    testImplementation("org.assertj:assertj-core:3.26.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
