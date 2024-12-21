package com.example.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.core_api.AppWithApplicationComponent
import com.example.main.di.MainActivityComponent
import com.example.main.navigation.AppNavigation
import com.example.ui_kit.theme.FilmsMatchComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appComponentProvider =
            (application as AppWithApplicationComponent).getApplicationComponentProvider()

        MainActivityComponent.create(appComponentProvider).inject(this)

        val destinations = appComponentProvider.mediatorsMap()

        enableEdgeToEdge()
        setContent {
            FilmsMatchComposeTheme {
                val navController = rememberNavController()
                AppNavigation(
                    navController = navController,
                    destinations = destinations
                )
            }
        }
    }
}
