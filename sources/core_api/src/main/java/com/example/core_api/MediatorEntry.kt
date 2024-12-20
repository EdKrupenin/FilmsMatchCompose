package com.example.core_api

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


typealias Destinations = Map<Class<out MediatorEntry>, @JvmSuppressWildcards MediatorEntry>

interface MediatorEntry {
    val featureRoute: String

    fun NavGraphBuilder.composable(
        navController: NavHostController,
        destinations: Destinations,
    ){
        composable(featureRoute) { backStackEntry ->
            Composable(navController, destinations, backStackEntry)
        }
    }

    @Composable
    fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    )
}