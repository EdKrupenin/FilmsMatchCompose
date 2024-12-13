package com.example.filmsmatch

import android.app.Application
import com.example.core_api.AppWithApplicationComponent
import com.example.core_api.ApplicationComponentProvider

class App : Application(), AppWithApplicationComponent {

    private var applicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        getApplicationComponentProvider()
    }

    override fun getApplicationComponentProvider() : ApplicationComponentProvider {
        return applicationComponent ?: ApplicationComponent.init(this).also {
            applicationComponent = it
        }
    }
}