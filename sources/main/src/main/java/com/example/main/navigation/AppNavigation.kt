package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.core_api.Destinations

@Composable
fun AppNavigation(
    navController: NavHostController,
    destinations: Destinations
) {
    NavHost(navController = navController, startDestination = "main") {
        destinations.values.forEach { entry ->
            with(entry) {
                composable(navController, destinations)
            }
        }
    }
}

