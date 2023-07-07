plugins {
    id("ordo.kotlin-common-conventions")
    application
}

dependencies {
    implementation(project(":rubrics"))
}

application {
    mainClass.set("pl.versusdeum.ordo.console.OrdoAppKt")
}
