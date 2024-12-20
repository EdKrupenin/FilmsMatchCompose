package com.example.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.core_api.AppWithApplicationComponent
import com.example.core_api.Destinations
//import com.example.main.di.MainComponent
import com.example.ui_kit.theme.FilmsMatchComposeTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //MainComponent.create((application as AppWithApplicationComponent).getApplicationComponentProvider()).inject(this)

        enableEdgeToEdge()
        setContent {
            FilmsMatchComposeTheme {

            }
        }
    }
}
