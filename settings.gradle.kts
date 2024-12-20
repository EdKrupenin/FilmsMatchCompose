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
include(":sources:core_api")
include(":sources:core_imp")
include(":sources:core_factory")
include(":sources:ui_kit")
include(":sources:infrastructure")
include(":sources:base_feature")
include(":sources:features_auth")
include(":sources:features_profile")
include(":sources:features_main")
include(":sources:features_room")
include(":sources:main")
include(":sources:main_api")
