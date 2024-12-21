package com.example.main.di

import com.example.core_api.ApplicationComponentProvider
import com.example.main.MainActivity
import dagger.Component

@Component(
    dependencies = [ApplicationComponentProvider::class],
    modules = [MainActivityModule::class]
)
interface MainActivityComponent {

    companion object{
        fun create(provider: ApplicationComponentProvider) : MainActivityComponent {
            return DaggerMainActivityComponent.builder()
                .applicationComponentProvider(provider)
                .build()
        }
    }

    fun inject(mainActivity: MainActivity)
}