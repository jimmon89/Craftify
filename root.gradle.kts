plugins {
    kotlin("jvm") version "1.9.24" apply false
    id("net.kyori.blossom") version "1.3.2" apply false
    id("com.github.johnrengelman.shadow") version "8.1.1" apply false
    id("gg.essential.multi-version.root")
}

preprocess {
    "1.21.4-fabric"(12104, "yarn") {
    }
}