package com.example.main.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.example.core_api.Destinations
import com.example.main_api.MainMediator
import javax.inject.Inject

class MainMediatorImpl @Inject constructor() : MainMediator() {
    @Composable
    override fun Composable(
        navController: NavHostController,
        destinations: Destinations,
        backStackEntry: NavBackStackEntry
    ) {
        TODO("Not yet implemented")
    }

}