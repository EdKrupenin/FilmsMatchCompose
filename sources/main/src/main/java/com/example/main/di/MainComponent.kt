package com.example.main.di

import com.example.core_api.ApplicationComponentProvider
import com.example.main.MainActivity
import dagger.Component

/*@Component(
    dependencies = [ApplicationComponentProvider::class]
)
interface MainComponent {

    companion object{
        fun create(provider: ApplicationComponentProvider) : MainComponent {
            return DaggerMainComponent.builder()
                .appProvider(provider)
                .build()
        }
    }

    fun inject(mainActivity: MainActivity)
}*/