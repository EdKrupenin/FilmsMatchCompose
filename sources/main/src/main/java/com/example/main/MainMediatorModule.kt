package com.example.main

import com.example.main.navigation.MainMediatorImpl
import com.example.main_api.MainMediator
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface MainMediatorModule {
    @Binds
    @IntoMap
    @ClassKey(MainMediator::class)
    fun bindMainMediator(impl: MainMediatorImpl) : Any
}