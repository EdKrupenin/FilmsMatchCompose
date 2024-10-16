pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Films Match Compose"
include(":app")
include(":core:core_api")
include(":core:core_imp")
include(":core:core_factory")
include(":base:ui_kit")
include(":base:infrastructure")
include(":base:base_feature")
include(":features:features_auth")
include(":features:features_profile")
include(":features:features_main")
include(":features:features_room")
