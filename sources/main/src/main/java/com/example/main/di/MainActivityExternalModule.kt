package com.example.main.di

import com.example.core_api.MediatorEntry
import com.example.main.navigation.MainMediatorImpl
import com.example.main_api.MainMediator
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
interface MainActivityExternalModule {
    @Binds
    @IntoMap
    @ClassKey(MainMediator::class)
    fun bindMediator(mediator: MainMediatorImpl) : MediatorEntry
}