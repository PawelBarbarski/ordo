plugins {
    id("org.sonarqube")
}


sonar {
    properties {
        property("sonar.projectKey", "test-ordo_test")
        property("sonar.organization", "test-ordo")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}